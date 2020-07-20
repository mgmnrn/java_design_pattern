package design_pattern.decorator.starbuzz;

public class HouseBlend extends Beverage {

    HouseBlend() {
        description = "House blend";
    }

    @Override
    public double cost() {
        return 28.0;
    }
}
