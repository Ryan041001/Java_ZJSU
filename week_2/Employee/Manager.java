package Employee;

public class Manager extends Employee {

    private String vehicle;

    public Manager(String name, int age, int ID) {
        super(name, age, ID);
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("座驾: " + vehicle);
    }

}
