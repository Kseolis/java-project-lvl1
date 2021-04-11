package hexlet.code.model;

public class Game {
    private static int choiceGame;

    private static boolean gameState;

    private static int counter;

    public Game(final int choiceNum) {
        choiceGame = choiceNum;
    }

    public static int getChoiceGame() {
        return choiceGame;
    }

    public static int getCounter() {
        return counter;
    }

    public static boolean isGameState() {
        return gameState;
    }

    public static void setChoiceGame(final int num) {
        choiceGame = num;
    }

    public static void setGameState(final boolean state) {
        Game.gameState = state;
    }

    public static void setCounter() {
        Game.counter += 1;
    }
}
