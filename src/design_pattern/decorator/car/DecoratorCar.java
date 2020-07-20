package design_pattern.decorator.car;

public abstract class DecoratorCar implements Car {
    protected Car decoratorCar;

    public DecoratorCar(Car car) {
        this.decoratorCar = car;
    }

    public void driving() {
        decoratorCar.driving();
    }
}
