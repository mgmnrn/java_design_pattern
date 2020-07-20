package Bank.Database;

import Bank.User.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private static File file = new File("C:\\Users\\mgmnr\\IdeaProjects\\design_pattern\\src\\Bank\\Database\\data.json");

    public static void write(List<User> users) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(users);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<User> getData() {
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<User> list = (ArrayList<User>)ois.readObject();
            ois.close();
            list.forEach(user -> System.out.println(user.getUsername()));
            return list;
        } catch (IOException | ClassNotFoundException e) {
        }
        return new ArrayList<>();
    }
}
