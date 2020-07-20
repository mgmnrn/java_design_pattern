package design_pattern.singleton.sunny;

public class Sunny {
    private static Sunny instance = new Sunny();
    private String color = "Shar";

    private Sunny() {
    }

    public static Sunny getInstance() {
        return instance;
    }

    public void show() {
        System.out.println(color + "nar mandlaa");
    }
}
