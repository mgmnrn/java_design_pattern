package design_pattern.introduction.Duck;

public class Quack implements  QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
