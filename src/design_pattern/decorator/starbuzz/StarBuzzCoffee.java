package design_pattern.decorator.starbuzz;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage espresso = new Espresso();
        espresso = new Milk(espresso);
        espresso = new Milk(espresso);
        System.out.println(espresso.getDescription() + " $" + espresso.cost());
    }
}
