public class Instructor extends Person implements SoftwareEngineer, FamilyMember{
    private int id;
    private String dept;

    public Instructor() {
        super();
        id = -1;
        dept = "None";
    }

    public Instructor(String name, int age, int id, String dept) {
        super(name, age);
        this.id = id;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return super.toString() + " Instructor{" +
                "id=" + id +
                ", dept='" + dept + '\'' +
                '}';
    }

    @Override
    public void visitParents() {
        System.out.println( this.getName() + " visiting parents");
    }

    @Override
    public void developCode() {
        System.out.println( this.getName() + " working!");
    }
}
