package compound;

public class DuckSimalutor {
    public static void main(String[] args) {
        DuckSimalutor duckSimalutor = new DuckSimalutor();
        AbstractDuckFactory factory = new CounringDuckFactory();
        duckSimalutor.simulate(factory);
    }

    private void simulate(AbstractDuckFactory factory) {
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable redHeadDuck = factory.createRedHeadDuck();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        simulate(mallardDuck);
        simulate(duckCall);
        simulate(redHeadDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println(QuackCounter.getCounter() );
    }

    void simulate(Quackable quackable) {
        quackable.quack();
    }
}
