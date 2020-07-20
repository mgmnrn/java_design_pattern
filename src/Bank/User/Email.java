package Bank.User;

import java.io.Serializable;
import java.util.ArrayList;

public class Email implements Observer, Serializable {
    private String email;
    private ArrayList<String> inbox;

    Email(String email) {
        this.email = email;
        this.inbox = new ArrayList<>();
    }

    private String getEmail() {
        return email;
    }

    public void display() {
        this.inbox.forEach(System.out::println);
    }

    @Override
    public void inbox(Object sms, Object to) {
        Email email = (Email)to;
        String mail = email.getEmail();
        this.inbox.add(mail + ": " + sms);
    }
}
