package design_pattern.decorator.car;

public class NitroTruck extends DecoratorCar {
    public NitroTruck(Car car) {
        super(car);
    }

    @Override
    public void driving() {
        super.driving();
        this.addNitroDriving();
    }

    public void addNitroDriving() {
        System.out.println("Ilvv hurdan yvj bn");
    }
}
