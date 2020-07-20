package design_pattern.decorator.car;

public class Main {
    public static void main(String[] args) {
        Car truck = new Truck();
        truck.driving();

        Car nitroTruck = new NitroTruck(truck);
        nitroTruck.driving();
    }
}
