package Bank.ATM;

public interface State {
    public void login(Context context);
    public void balance(Context context);
    public void deposit(Context context);
    public void withdraw(Context context);
    public void logout(Context context);
    public void on(Context context);
    public void off(Context context);
}
