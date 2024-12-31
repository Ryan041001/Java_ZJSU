package Company;


public class ConcreteMediator implements Mediator {
    public employeeA employeeA = new employeeA();
    public employeeB employeeB = new employeeB();

    @Override
    public void notice(String content) {

        if (content.equals("上司来了")) {
            employeeA.work();
        } else if (content.equals("客户来了")) {
            employeeB.work();
        }
    }
}
