package compound;

public class CounringDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new Rubberduck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }
}
