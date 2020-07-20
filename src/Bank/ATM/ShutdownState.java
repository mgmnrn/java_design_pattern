package Bank.ATM;

public class ShutdownState implements State {
    @Override
    public void login(Context context) {
        System.out.println("ATM унтарсан тул нэвтрэх боломжгүй байна");
    }

    @Override
    public void balance(Context context) {
        System.out.println("ATM унтарсан байна");
    }

    @Override
    public void deposit(Context context) {
        System.out.println("ATM унтарсан байна");
    }

    @Override
    public void withdraw(Context context) {
        System.out.println("ATM унтарсан байна");
    }

    @Override
    public void logout(Context context) {
        System.out.println("ATM унтарсан байна");
    }

    @Override
    public void on(Context context) {
        context.setState(context.getReadyState());
        System.out.println("ATM аслаа");
    }

    @Override
    public void off(Context context) {
        System.out.println("ATM унтарсан байна");
    }
}
