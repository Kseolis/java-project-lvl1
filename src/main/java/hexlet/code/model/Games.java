package hexlet.code.model;

public class Games {

    private final int choiceNumber;

    private final String[] gameMenu = {"Exit", "Greet", "Even"};

    public Games(final int choiceNum) {
        this.choiceNumber = choiceNum;
    }

    public final int getChoiceNumber() {
        return choiceNumber;
    }

    public final String[] getGameMenu() {
        return gameMenu;
    }
}
