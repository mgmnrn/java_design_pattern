package Bank.ATM;

import Bank.User.UserContainer;

import java.util.Scanner;

public class ReadyState implements State{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void login(Context context) {
        System.out.println("Та пин кодоо оруулна уу");
        int pin = scanner.nextInt();
        UserContainer container = UserContainer.getInstance();

        if (container.isUserPin(pin)) {
            context.setState(context.getWorkingState());
            container.isCurrentUser(pin);
            System.out.println("Амжилттай ATM нэвтэрлээ");
        } else  {
            System.out.println("Таны пин код буруу байна");
        }
    }

    @Override
    public void balance(Context context) {
        System.out.println("Та эхлээд нэвтэрч орно уу");
    }

    @Override
    public void deposit(Context context) {
        System.out.println("Та эхлээд нэвтэрч орно уу");
    }

    @Override
    public void withdraw(Context context) {
        System.out.println("Та эхлээд нэвтэрч орно уу");
    }

    @Override
    public void logout(Context context) {
        System.out.println("Та эхлээд нэвтэрч орно уу");
    }

    @Override
    public void on(Context context) {
        System.out.println("ATM ассан байна");
    }

    @Override
    public void off(Context context) {
        context.setState(context.getShutdownState());
        System.out.println("ATM унтарлаа");
    }
}
