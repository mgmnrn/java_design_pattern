package design_pattern.templateMethod.game;

public class Fifa extends Game {
    @Override
    void endGame() {
        System.out.println("Fifa duuslaa");
    }

    @Override
    void startGame() {
        System.out.println("Fifa exellee");
    }
}
