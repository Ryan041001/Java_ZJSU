package Company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Scanner ct = new Scanner(System.in);
        String content1 = ct.nextLine();
        mediator.notice(content1);
        String content2 = ct.nextLine();
        mediator.notice(content2);
    }
}
