package hexlet.code.view;

import hexlet.code.Cli;

import static hexlet.code.model.Player.getPlayer;

import static hexlet.code.view.GameContent.GAME_RULES;
import static hexlet.code.view.GameContent.QUESTION_TEXT;
import static hexlet.code.view.GameContent.ASK_ANSWER_TEXT;
import static hexlet.code.view.GameContent.FAIL_TEXT;
import static hexlet.code.view.GameContent.SUCCESS_TEXT;
import static hexlet.code.view.GameContent.WIN_TEXT;

public class GameView {
    private static final String[] GAME_MENU = {"Exit", "Greet", "Even", "Calc"};
    private static final int ONLY_GREET_CHOICE = 1;

    // Вызов меню для выбора игры.
    public static void menuCall() {
        System.out.println("Please enter the game number and press Enter.");
        for (int i = 1; i < GAME_MENU.length; i++) {
            System.out.println(i + " " + GAME_MENU[i]);
        }
        System.out.println("0" + " " + GAME_MENU[0]);
        System.out.print("Your choice: ");
    }

    // Начальный диалог, при выборе игры (или в преветствия
    public static void startGameDialog(final int g)
            throws ArrayIndexOutOfBoundsException {
        String gameRule = GAME_RULES[g];
        if (g == ONLY_GREET_CHOICE && getPlayer() != null) {
            Cli.welcome();
        } else {
            Cli.welcome();
            System.out.println(gameRule);
        }
    }

    public static void processGameDialog(final int num) {
        System.out.println(QUESTION_TEXT + num);
        System.out.print(ASK_ANSWER_TEXT);
    }

    public static void getFailText() {
        System.out.println(FAIL_TEXT);
    }

    public static void getSuccessText() {
        System.out.println(SUCCESS_TEXT);
    }

    public static void getWinText() {
        System.out.println(WIN_TEXT);
    }
}
