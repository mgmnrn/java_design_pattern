package Bank.User;

public class UserFactory {
    private UserFactory() {
    }

    public static User getUser(String username, int pin) {
        return new User(username, pin);
    }
}
