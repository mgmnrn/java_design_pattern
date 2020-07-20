package design_pattern.templateMethod.coffeeTea;

public class Coffee extends CaffeineBeverage {
    @Override
    void addCondiments() {
        System.out.println("add sugar and milk");
    }

    @Override
    void brew() {
        System.out.println("coffee");
    }
}