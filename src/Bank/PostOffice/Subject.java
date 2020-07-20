package Bank.PostOffice;

import Bank.User.User;

public interface Subject {
    public void register(Object o);
    public void unRegister(Object o);
    public void notify(Object sms, Object sender, Object to);
}
