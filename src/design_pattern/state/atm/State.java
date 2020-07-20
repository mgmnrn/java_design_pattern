package design_pattern.state.atm;

public interface State {
    public void enterPin(Context context);
    public void displayBalance(Context context);
    public void deposit(Context context);
    public void start(Context context);
    public void off(Context context);
}
