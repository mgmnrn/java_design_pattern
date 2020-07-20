package design_pattern.introduction.Dog;

public class NemtsOvchark extends Dog {
    public NemtsOvchark() {
        runBehavior = new RunWithLeg();
        soundBehavior = new SoundFull();
    }

    @Override
    public void display() {
        System.out.println("I NemtsOvchark");
    }
}
