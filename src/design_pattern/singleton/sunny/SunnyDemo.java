package design_pattern.singleton.sunny;

public class SunnyDemo {
    public static void main(String[] args) {
        Sunny sunny = Sunny.getInstance();
        Sunny sunny1 = Sunny.getInstance();
        sunny.show();
        sunny1.show();
    }
}