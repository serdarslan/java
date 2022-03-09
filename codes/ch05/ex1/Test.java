public class Test {
    public static void main(String[] args) {
// Creating an object of Engine class.
        Engine engn = new Engine("Petrol", 300);

// Creating an object of Car class.
        {
            Car car = new Car("Alto", engn);
            System.out.println("Name of car: " + car.getName() + "\n" + "Type of engine: " + engn.getType() + "\n" + "Horse power of Engine: " + engn.getHorsePower());

        }
    }
}
