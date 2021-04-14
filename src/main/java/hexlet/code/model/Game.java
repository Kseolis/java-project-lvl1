package hexlet.code.model;

public class Game {
    private static final int VICTORY_CONDITION = 3;
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

    public static int getVictoryCondition() {
        return VICTORY_CONDITION;
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
