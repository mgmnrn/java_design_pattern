package design_pattern.introduction.Dog;

public class DogDemo {
    public static void main(String[] args) {
        Dog nemts = new NemtsOvchark();
        nemts.performRun();
        nemts.performSound();
        nemts.display();

        Dog mini = new MiniDog();
        mini.performRun();
        mini.performSound();
        mini.display();
    }
}
