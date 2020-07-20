package design_pattern.templateMethod.game;

public class Nba extends Game {
    @Override
    void endGame() {
        System.out.println("Nba duuslaa");
    }

    @Override
    void startGame() {
        System.out.println("Nba exellee");
    }
}