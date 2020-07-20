package design_pattern.templateMethod.coffeeTea;

public class Tea extends  CaffeineBeverage {
    @Override
    void addCondiments() {
        System.out.println("add lemon");
    }

    @Override
    void brew() {
        System.out.println("Tea");
    }
}
