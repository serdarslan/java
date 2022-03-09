public class Test {

    public static void main(String[] args) {
        Instructor ins = new Instructor("Serdar", 43, 123, "Ceng");

        System.out.println("I am : " + ins);

        ins.visitParents();

        ins.developCode();
    }
}
