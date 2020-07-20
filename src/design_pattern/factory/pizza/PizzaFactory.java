package design_pattern.factory.pizza;

public class PizzaFactory {
    public Pizza getPizza(String type) {
        if (type.equalsIgnoreCase("meat")) {
            return new MeatPizza("Meat", 12);
        } else if (type.equalsIgnoreCase("cheese")) {
            return new CheesePizza("cheese", 6);
        }
        return null;
    }
}
