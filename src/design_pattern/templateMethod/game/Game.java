package design_pattern.templateMethod.game;

public abstract class Game {
    final void play() {
        startGame();
        pauseGame();
        endGame();
    }

    abstract void endGame();
    abstract void startGame();

    void pauseGame(){
        System.out.println("Togloom zogosloo");
    }
}
