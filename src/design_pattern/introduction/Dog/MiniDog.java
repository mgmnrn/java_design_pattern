package design_pattern.introduction.Dog;

public class MiniDog extends Dog{
    public MiniDog() {
        runBehavior = new RunNoLeg();
        soundBehavior = new SoundLow();
    }

    @Override
    public void display() {
        System.out.println("I,m very mini dog");
    }
}
