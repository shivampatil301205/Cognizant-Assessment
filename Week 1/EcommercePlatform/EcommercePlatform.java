package EcommercePlatform;

import java.util.*;

public class EcommercePlatform {


    static class Product {
        final String sku;
        final String name;
        final double price;
        int stock;

        Product(String sku, String name, double price, int stock) {
            this.sku = sku;
            this.name = name;
            this.price = price;
            this.stock = stock;
        }

        @Override
        public String toString() {
            return String.format("%s(%s) $%.2f stock=%d", sku, name, price, stock);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Product)) return false;
            Product product = (Product) o;
            return Objects.equals(sku, product.sku);
        }

        @Override
        public int hashCode() {
            return Objects.hash(sku);
        }
    }

    static class Order {
        final String orderId;
        final List<CartItem> items;
        final double total;

        Order(String orderId, List<CartItem> items, double total) {
            this.orderId = orderId;
            this.items = items;
            this.total = total;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Order ").append(orderId).append(" total=$").append(String.format("%.2f", total)).append("\n");
            for (CartItem ci : items) {
                sb.append("  - ").append(ci.product.sku)
                        .append(" x").append(ci.quantity)
                        .append(" @$").append(String.format("%.2f", ci.product.price))
                        .append("\n");
            }
            return sb.toString();
        }
    }

    static class CartItem {
        final Product product;
        final int quantity;

        CartItem(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }
    }

    static class EcommerceService {
        private final Map<String, Product> catalogBySku = new HashMap<>();
        private final Map<String, Integer> cartBySku = new HashMap<>();
        private final List<Product> catalog = new ArrayList<>();



        private final PriorityQueue<TopSeller> topSellersHeap;
        private final int topN;
        private final Map<String, Integer> unitsSold = new HashMap<>();

        private int orderCounter = 1000;

        EcommerceService(int topN) {
            this.topN = topN;
            this.topSellersHeap = new PriorityQueue<>(Comparator.comparingInt(ts -> ts.unitsSold));
        }

        void addProduct(Product p) {
            catalogBySku.put(p.sku, p);
            catalog.add(p);
        }


        List<Product> getCatalogSortedByPriceAsc() {
            List<Product> copy = new ArrayList<>(catalog);
            copy.sort(Comparator.comparingDouble(pr -> pr.price));
            return copy;
        }

        List<Product> getCatalogSortedByNameAsc() {
            List<Product> copy = new ArrayList<>(catalog);
            copy.sort(Comparator.comparing(pr -> pr.name.toLowerCase(Locale.ROOT)));
            return copy;
        }


        List<Product> searchByNameContains(String query) {
            if (query == null || query.isBlank()) return Collections.emptyList();
            String q = query.toLowerCase(Locale.ROOT);
            List<Product> res = new ArrayList<>();
            for (Product p : catalog) {
                if (p.name.toLowerCase(Locale.ROOT).contains(q)) {
                    res.add(p);
                }
            }
            return res;
        }


        void addToCart(String sku, int qty) {
            if (qty <= 0) return;
            Product p = catalogBySku.get(sku);
            if (p == null) {
                System.out.println("SKU not found: " + sku);
                return;
            }
            int existing = cartBySku.getOrDefault(sku, 0);
            cartBySku.put(sku, existing + qty);
        }

        void removeFromCart(String sku) {
            cartBySku.remove(sku);
        }

        void printCart() {
            if (cartBySku.isEmpty()) {
                System.out.println("Cart is empty.");
                return;
            }
            System.out.println("--- Cart ---");
            double total = 0;
            for (Map.Entry<String, Integer> e : cartBySku.entrySet()) {
                Product p = catalogBySku.get(e.getKey());
                int q = e.getValue();
                double line = p.price * q;
                total += line;
                System.out.printf("%s x%d @ $%.2f => $%.2f%n", p.sku, q, p.price, line);
            }
            System.out.println("Cart Total = $" + String.format("%.2f", total));
        }

        double cartTotal() {
            double total = 0;
            for (Map.Entry<String, Integer> e : cartBySku.entrySet()) {
                Product p = catalogBySku.get(e.getKey());
                total += p.price * e.getValue();
            }
            return total;
        }


        Order placeOrder() {
            if (cartBySku.isEmpty()) {
                System.out.println("Cannot place order: cart is empty.");
                return null;
            }

            for (Map.Entry<String, Integer> e : cartBySku.entrySet()) {
                Product p = catalogBySku.get(e.getKey());
                int qty = e.getValue();
                if (p.stock < qty) {
                    System.out.printf("Insufficient stock for %s. Requested=%d Available=%d%n", p.sku, qty, p.stock);
                    return null;
                }
            }

            List<CartItem> orderItems = new ArrayList<>();
            double total = 0;

            for (Map.Entry<String, Integer> e : cartBySku.entrySet()) {
                Product p = catalogBySku.get(e.getKey());
                int qty = e.getValue();

                p.stock -= qty;
                orderItems.add(new CartItem(p, qty));

                total += p.price * qty;


                int newUnits = unitsSold.getOrDefault(p.sku, 0) + qty;
                unitsSold.put(p.sku, newUnits);


                topSellersHeap.add(new TopSeller(p, newUnits));
                trimHeap();
            }

            String orderId = "ORD-" + (orderCounter++);
            cartBySku.clear();

            return new Order(orderId, orderItems, total);
        }

        private void trimHeap() {
            while (topSellersHeap.size() > topN) {
                topSellersHeap.poll();
            }
        }

        List<Product> getTopSellers() {

            List<TopSeller> snapshot = new ArrayList<>();
            for (TopSeller ts : topSellersHeap) snapshot.add(ts);


            snapshot.sort((a, b) -> Integer.compare(b.unitsSold, a.unitsSold));

            List<Product> res = new ArrayList<>();
            Set<String> seen = new HashSet<>();
            for (TopSeller ts : snapshot) {
                String sku = ts.product.sku;
                if (seen.add(sku)) {
                    res.add(ts.product);
                    if (res.size() == topN) break;
                }
            }
            return res;
        }

        void printCatalog() {
            System.out.println("--- Catalog ---");
            for (Product p : catalog) {
                System.out.println(p);
            }
        }

        void printStock() {
            System.out.println("--- Stock Remaining ---");
            for (Product p : catalog) {
                System.out.println(p.sku + " => " + p.stock);
            }
        }


        static class TopSeller {
            final Product product;
            final int unitsSold;

            TopSeller(Product product, int unitsSold) {
                this.product = product;
                this.unitsSold = unitsSold;
            }
        }
    }



    public static void main(String[] args) {
        EcommerceService service = new EcommerceService(3);

        service.addProduct(new Product("SKU-100", "Eco Bottle", 12.50, 10));
        service.addProduct(new Product("SKU-200", "Solar Charger", 29.99, 6));
        service.addProduct(new Product("SKU-300", "Recycled Notebook", 5.75, 25));
        service.addProduct(new Product("SKU-400", "Compost Bin", 39.00, 3));
        service.addProduct(new Product("SKU-500", "Bamboo Toothbrush", 2.49, 50));

        service.printCatalog();

        System.out.println("\n--- Sorted by Price (ASC) ---");
        for (Product p : service.getCatalogSortedByPriceAsc()) {
            System.out.println(p.sku + " => $" + String.format("%.2f", p.price));
        }

        System.out.println("\n--- Search: 'eco' ---");
        for (Product p : service.searchByNameContains("eco")) {
            System.out.println(p);
        }


        service.addToCart("SKU-100", 2);
        service.addToCart("SKU-500", 5);
        service.addToCart("SKU-300", 3);
        service.printCart();


        System.out.println("\n--- Placing Order 1 ---");
        Order o1 = service.placeOrder();
        if (o1 != null) System.out.println(o1);

        service.printStock();


        service.addToCart("SKU-200", 2);
        service.addToCart("SKU-400", 1);
        service.addToCart("SKU-300", 4);
        System.out.println("\n--- Cart Before Order 2 ---");
        service.printCart();

        System.out.println("\n--- Placing Order 2 ---");
        Order o2 = service.placeOrder();
        if (o2 != null) System.out.println(o2);

        service.printStock();

        System.out.println("\n--- Top Sellers (Top 3 by units sold) ---");
        List<Product> top = service.getTopSellers();
        for (Product p : top) {
            System.out.println(p.sku + " - " + p.name);
        }
    }
}

