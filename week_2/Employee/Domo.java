package Employee;

public class Domo {
    public static void main(String[] args) {
        Manager mgr = new Manager("韩寒", 28, 7788);
//        mgr.discuss();
//        mgr.getInfo();
        Employee em = new Employee("王建新", 25, 5247);
        em.setAge(27);
        em.setSex("男");
        em.work();
        em.discuss();
        em.getInfo();
        mgr.setSex("男");
        mgr.discuss();
        mgr.setVehicle("奔驰车");
        mgr.getInfo();
    }
}
