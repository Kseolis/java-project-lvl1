package hexlet.code.model;

public class Games {

    private static int choiceGame;

    private final String[] gameMenu = {"Exit", "Greet", "Even"};

    public Games(final int choiceNum) {
        choiceGame = choiceNum;
    }

    public static int getChoiceGame() {
        return choiceGame;
    }

    public final String[] getGameMenu() {
        return gameMenu;
    }

    public final void setChoiceGame(final int num) {
        choiceGame = num;
    }
}
