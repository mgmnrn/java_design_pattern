package design_pattern.introduction.Duck;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
