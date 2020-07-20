package design_pattern.decorator.starbuzz;

public class Milk extends CondimentDecorator {
    private Beverage beverage;
    Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " milk";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
