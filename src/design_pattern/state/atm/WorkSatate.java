package design_pattern.state.atm;

public class WorkSatate implements State {
    @Override
    public void enterPin(Context context) {
        context.setState(this);
        System.out.println("Ажиллаж байгаа тул энэ үйлдэл хийх боломжгүй");
    }

    @Override
    public void displayBalance(Context context) {
        context.setState(this);
        System.out.println("Таны дансанд 5 сая төгрөг байна.");
    }

    @Override
    public void deposit(Context context) {
        context.setState(this);
        System.out.println("Таны гүйлгээ хийх дансаны дугаараа явуулна уу");
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
