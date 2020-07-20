package design_pattern.adapter.duck;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
        this.turkey.fly();
    }
}
