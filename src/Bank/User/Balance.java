package Bank.User;

import java.io.Serializable;

public class Balance implements Serializable {
    private static final long serialVersionUID = 1L;
    private String number;
    private double money;

    Balance(int pin) {
        this.number = "500000" + pin;
        this.money = 0;
    }

    public String getNumber() {
        return number;
    }

    public double getMoney() {
        return money;
    }

    public boolean addMoney(double money) {
        this.money += money;
        dataChanged();
        return true;
    }

    public boolean subMoney(double money) {
        if (this.money - money >= 0) {
            this.money -= money;
            dataChanged();
            return true;
        } else return false;
    }

    private void dataChanged() {
        UserContainer.getInstance().forceUpdate();
    }
}
