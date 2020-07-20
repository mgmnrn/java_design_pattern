package design_pattern.adapter.duck;

public class MallardDuck implements  Duck {
    @Override
    public void quack() {
        System.out.println("Quack quack");
    }

    @Override
    public void fly() {
        System.out.println("Mallard duck nisej bn");
    }
}
