package design_pattern.command.smarthome;

public class CeilingFan {
    private static int HIGH = 3;
    private static int MEDIUM = 2;
    private static int LOW = 1;
    private static int OFF = 0;
    int speed;
    String location;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
    }
}
