package design_pattern.introduction.Dog;

public abstract class Dog {
    RunBehavior runBehavior;
    SoundBehavior soundBehavior;

    public Dog() {
    }

    public abstract void display();

    public void performRun() {
        runBehavior.run();
    }

    public void performSound() {
        soundBehavior.makeSound();
    }

    public void setRunBehavior(RunBehavior runBehavior) {
        this.runBehavior = runBehavior;
    }

    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }
}
