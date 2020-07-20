package Bank.ATM;

import Bank.User.User;
import Bank.User.UserContainer;

import java.util.Scanner;

public class WorkingState implements State {
    private UserContainer container = UserContainer.getInstance();

    @Override
    public void login(Context context) {
        System.out.println("Та нэвтэрсэн байна");
    }

    @Override
    public void balance(Context context) {
        User currentUser = container.getCurrentUser();
        System.out.println("Таны дансанд: " + currentUser.getBalance().getMoney() );
    }

    @Override
    public void deposit(Context context) {
        User currentUser = container.getCurrentUser();
        System.out.println("Та хэдэн төгрөг хийх вэ?");
        double deposit = new Scanner(System.in).nextDouble();
        if (currentUser.getBalance().addMoney(deposit)){
            System.out.println("Таны дансанд " + deposit + "₮ нэмэгдлээ");
        } else {
            System.out.println("Амжилтгүй");
        }
    }

    @Override
    public void withdraw(Context context) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Мөнгө шилжүүлэх дансны дугаар");
        String number = scanner.nextLine();
        if (container.isMyBankNumber(number)) {
            System.out.println("Та хэдэн төгрөг шилжүүлэх вэ?");
            double amount = scanner.nextDouble();
            if (container.getCurrentUser().getBalance().getMoney() >= amount ) {
                if (container.transferMoney(number, amount)) {
                    container.getCurrentUser().getBalance().subMoney(amount);
                    System.out.println("Гүйлгээ амжилттай");
                } else {
                    System.out.println("Гүйлгээ амжилтгүй");
                }
            } else  {
                System.out.println("Таны дансны үлдэгдэл хүрэлцэхгүй байна");
            }

        } else {
            System.out.println("Таны оруулсан данс манай банк - нд бүртгэлгүй байна");
        }
    }

    @Override
    public void logout(Context context) {
        context.setState(context.getReadyState());
        container.setCurrentUser(null);
        System.out.println("Амжилттай гарлаа");
    }

    @Override
    public void on(Context context) {
        System.out.println("ATM асааллтай байна");
    }

    @Override
    public void off(Context context) {
        context.setState(context.getShutdownState());
        System.out.println("Амжилттай унтарлаа");
    }
}
