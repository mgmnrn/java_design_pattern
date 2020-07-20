package compound;

public class QuackCounter implements Quackable {
    Quackable quackable;
    static int counter = 0;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
