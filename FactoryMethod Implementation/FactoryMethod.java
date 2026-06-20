public class FactoryMethod {

    interface Vehicle {
        void manufacture();
    }

    static class Car implements Vehicle {
        @Override
        public void manufacture() {
            System.out.println("Car is manufactured.");
        }
    }

    static class Bike implements Vehicle {
        @Override
        public void manufacture() {
            System.out.println("Bike is manufactured.");
        }
    }

    static class VehicleFactory {

        public Vehicle getVehicle(String type) {

            if (type == null) {
                return null;
            }

            if (type.equalsIgnoreCase("CAR")) {
                return new Car();
            }

            if (type.equalsIgnoreCase("BIKE")) {
                return new Bike();
            }

            return null;
        }
    }

    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();

        Vehicle vehicle1 = factory.getVehicle("CAR");
        vehicle1.manufacture();

        Vehicle vehicle2 = factory.getVehicle("BIKE");
        vehicle2.manufacture();
    }
}
