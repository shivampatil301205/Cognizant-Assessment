
interface Coffee {
    void brew();
}

class Espresso implements Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing Espresso...");
    }
}

class Latte implements Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing Latte...");
    }
}

class Cappuccino implements Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing Cappuccino...");
    }
}

interface CoffeeFactory {
    Coffee createCoffee();
}

class EspressoFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
}

class LatteFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}

class CappuccinoFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Cappuccino();
    }
}

public class FactoryMethod {
    public static void main(String[] args) {

        CoffeeFactory espressoFactory = new EspressoFactory();
        Coffee espresso = espressoFactory.createCoffee();
        espresso.brew();

        CoffeeFactory latteFactory = new LatteFactory();
        Coffee latte = latteFactory.createCoffee();
        latte.brew();

        CoffeeFactory cappuccinoFactory = new CappuccinoFactory();
        Coffee cappuccino = cappuccinoFactory.createCoffee();
        cappuccino.brew();
    }
}
