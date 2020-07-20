package design_pattern.decorator.starbuzz;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Real espresso";
    }

    @Override
    public double cost() {
        return 20.0;
    }
}
