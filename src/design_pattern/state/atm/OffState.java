package design_pattern.state.atm;

public class OffState implements State{
    @Override
    public void enterPin(Context context) {
        context.setState(this);
        System.out.println("Унтарсан байгаа энэ тул үйлдэл боломжгүй");
    }

    @Override
    public void displayBalance(Context context) {
        context.setState(this);
        System.out.println("Унтарсан байгаа энэ тул үйлдэл боломжгүй");
    }

    @Override
    public void deposit(Context context) {
        context.setState(this);
        System.out.println("Унтарсан байгаа тул энэ үйлдэл боломжгүй");
    }

    @Override
    public void start(Context context) {
        context.setState(context.getReadyState());
        System.out.println("ATM аслаа");
    }

    @Override
    public void off(Context context) {
        System.out.println("Аль хэдийн унтарсан байна");
    }
}
