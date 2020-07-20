package Bank.User;

import Bank.Database.Database;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class UserContainer {
    private static UserContainer instance = new UserContainer();
    private User currentUser = null;
    private List<User> users;

    private UserContainer() {
    }

    public void init() {
        users = Database.getData();
    }

    public static UserContainer getInstance() {
        return instance;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public void addUser (User user) {
        users.add(user);
        forceUpdate();
    }

    public String objectToJSON() {
        JSONArray jsonArray = new JSONArray();
        users.forEach(user -> {
            JSONObject userObject = new JSONObject();
            try {
                userObject.put("username", user.getUsername());
                userObject.put("pin", user.getPincode());
                jsonArray.put(userObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        });
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("users", jsonArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject.toString();
    }

    public void removeUser(User user) {
        users.remove(user);
        forceUpdate();
    }

    public User getUser(String username) {
        return users.stream().filter(e -> e.getUsername().equals(username)).findFirst().get();
    }

    public boolean isUser(String name, int pin) {
        AtomicBoolean isUser = new AtomicBoolean(false);
        users.forEach(user -> {
            if (user.getUsername().equals(name) && user.getPincode() == pin) isUser.set(true);
        });
        return isUser.get();
    }

    public boolean isUserPin(int pin) {
        AtomicBoolean isUser = new AtomicBoolean(false);
        users.forEach(user -> {
            if (user.getPincode() == pin) isUser.set(true);
        });
        return isUser.get();
    }

    public void isCurrentUser(int pin) {
        users.forEach(user -> {
            if(user.getPincode() == pin) {
                setCurrentUser(user);
            }
        });
    }

    public boolean isMyBankNumber(String number) {
        AtomicBoolean isUser = new AtomicBoolean(false);
        users.forEach(user -> {
            if (user.getBalance().getNumber().equals(number)) isUser.set(true);
        });
        return isUser.get();
    }

    public boolean transferMoney(String number, double amount) {
        AtomicBoolean isUser = new AtomicBoolean(false);
        users.forEach(user -> {
            if (user.getBalance().getNumber().equals(number)) {
                isUser.set(user.getBalance().addMoney(amount));
            }
        });
        return isUser.get();
    }

    void forceUpdate() {
        Database.write(users);
    }
}
