package design_pattern.factory.pizza;

public class PizzaStore {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.getPizza("cheese");
        System.out.println(cheesePizza.getName() + " and " + cheesePizza.getSize());
        Pizza meatPizza = pizzaFactory.getPizza("meat");
        System.out.println(meatPizza.getName() + " and " + meatPizza.getSize());
    }
}
