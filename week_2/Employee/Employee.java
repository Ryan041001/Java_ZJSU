package Employee;

public class Employee extends Person {

    private int ID;

    public Employee(String name, int age, int ID) {
        super(name, age, "");
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public void work() {
        System.out.println(super.getName() + "在工作");
    }

    public final void discuss() {
        System.out.println(super.getName() + "在讨论");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(",工号: " + ID);
    }
}
