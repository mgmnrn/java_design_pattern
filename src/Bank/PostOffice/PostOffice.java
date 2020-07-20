package Bank.PostOffice;

import Bank.User.Email;
import Bank.User.User;

import java.util.ArrayList;

public class PostOffice implements Subject {
    private ArrayList<Email> emails;

    public PostOffice() {
        emails = new ArrayList<>();
    }

    @Override
    public void register(Object o) {
        emails.add((Email) o);
    }

    @Override
    public void unRegister(Object o) {
        emails.remove(o);
    }

    @Override
    public void notify(Object sms, Object sender, Object to) {
        emails.forEach(email -> {
            if (email == sender) {
                email.inbox(to, sms);
            }
        });
    }
}
