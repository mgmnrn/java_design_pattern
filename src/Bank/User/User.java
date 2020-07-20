package Bank.User;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private int pincode;
    private Balance balance;
    private Email email;

    public User(String username, int pincode) {
        this.username = username;
        this.pincode = pincode;
        this.balance = new Balance(pincode);
        this.email = new Email(username + "@gmail.com");
    }

    public String getUsername() {
        return username;
    }

    int getPincode() {
        return pincode;
    }

    public Balance getBalance() {
        return balance;
    }

    public Email getEmail() {
        return email;
    }
}