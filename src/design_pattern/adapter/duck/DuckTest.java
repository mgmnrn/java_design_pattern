package design_pattern.adapter.duck;

public class DuckTest {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        System.out.println("Mallard: ");
        mallardDuck.fly();
        mallardDuck.quack();

        WildTurkey turkey = new WildTurkey();
        System.out.println("Wild turkey: ");
        turkey.fly();
        turkey.gobble();

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("Wild turkey adapter: ");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
