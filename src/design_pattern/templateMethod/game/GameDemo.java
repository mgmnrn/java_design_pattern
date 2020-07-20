package design_pattern.templateMethod.game;

public class GameDemo {
    public static void main(String[] args) {
        Game nba = new Nba();
        Game fifa = new Fifa();

        //this is template methods
        nba.play();
        fifa.play();
    }
}