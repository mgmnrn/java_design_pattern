package design_pattern.state.atm;

public class ReadyState implements State {
    @Override
    public void enterPin(Context context) {
        context.setState(context.getWorkState());
        System.out.println("Та кодоо оруулна уу");
    }

    @Override
    public void displayBalance(Context context) {
        context.setState(this);
        System.out.println("Та эхлээд нэвтрэх хэрэгтэй");
    }

    @Override
    public void deposit(Context context) {
        context.setState(this);
        System.out.println("Та эхлээд нэвтрэх хэрэгтэй");
    }

    @Override
    public void start(Context context) {
        context.setState(this);
        System.out.println("ATM аль хэдийн ассан байна");
    }

    @Override
    public void off(Context context) {
        context.setState(context.getOffState());
        System.out.println("ATM унтарлаа");
    }
}
