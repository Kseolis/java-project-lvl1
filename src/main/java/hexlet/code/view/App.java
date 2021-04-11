package hexlet.code.view;

import hexlet.code.Cli;
import hexlet.code.controller.GamesController;

import static hexlet.code.view.GameContent.GAME_RULES;
import static hexlet.code.view.GameContent.QUESTION_TEXT;

public class App<T> {
    private static final GamesController GAMES_CONTROLLER =
            new GamesController();

    private static final String[] GAME_MENU = {"Exit", "Greet", "Even", "Calc"};
    private static final int ONLY_GREET_CHOICE = 1;

    public static void main(final String[] args) {
        GAMES_CONTROLLER.gameFlow();
    }

    // Вызов меню для выбора игры.
    public static void menuCall() {
        System.out.println("Please enter the game number and press Enter.");
        for (int i = 1; i < GAME_MENU.length; i++) {
            System.out.println(i + " " + GAME_MENU[i]);
        }
        System.out.println("0" + " " + GAME_MENU[0]);
        System.out.print("Your choice: ");
    }

    public static void startGameDialog(final int g)
             throws ArrayIndexOutOfBoundsException {
        String gameRule = GAME_RULES[g];
        if (g == ONLY_GREET_CHOICE) {
            Cli.welcome();
        } else {
            Cli.welcome();
            System.out.println(gameRule);
            System.out.println(QUESTION_TEXT);
        }
    }
}
