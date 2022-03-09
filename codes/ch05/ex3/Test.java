public class Test {
    public static void main(String[] args) {

        // Creating an object of Car class.
        Car1 car = new Car1("Alto", "Petrol", 300);
        System.out.println("Name of car: " + car.getName() + "\n" + "Type of engine: " + car.getEngine().getType() + "\n" + "Horse power of Engine: " + car.getEngine().getHorsePower());

        // Creating an object of Engine class.
        Engine engn = new Engine("Diesel", 200);

        Car2 car2 = new Car2("Car2", engn);
        System.out.println("Name of car: " + car2.getName() + "\n" + "Type of engine: " + car2.getEngine().getType() + "\n" + "Horse power of Engine: " + car2.getEngine().getHorsePower());

    }
}
