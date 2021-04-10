package hexlet.code.view;

import hexlet.code.Cli;
import hexlet.code.controller.GamesController;
import hexlet.code.model.Game;

import java.util.Scanner;

import static hexlet.code.model.GameInterface.getRandom;
import static hexlet.code.view.GameContent.QUESTION_TEXT;
import static hexlet.code.view.GameContent.EVEN_GAME_RULE;

public class App<T> {
    private static final Scanner ITEM_SCANNER = new Scanner(System.in);
    private static final GamesController GAMES_CONTROLLER =
            new GamesController();

    private static final String[] GAME_MENU = {"Exit", "Greet", "Even", "Calc"};

    public static void main(final String[] args) {
        menuItemSelection();
    }

    private static void menuItemSelection() {
        menuCall();
        int item = ITEM_SCANNER.nextInt();
        itemWork(item);
    }

    // Вызов меню для выбора игры.
    private static void menuCall() {
        System.out.println("Please enter the game number and press Enter.");
        for (int i = 1; i < GAME_MENU.length; i++) {
            System.out.println(i + " " + GAME_MENU[i]);
        }
        System.out.println("0" + " " + GAME_MENU[0]);
        System.out.print("Your choice: ");
    }

    //
    private static void itemWork(final int num) {
        switch (num) {
            case 0:
                return;
            case 1:
                Cli.welcome();
            default:
                GAMES_CONTROLLER.startGame();
        }
    }

    private static void startGameDialog(final Game g) {
        if (Game.getCounter() == 0) {
            System.out.println(EVEN_GAME_RULE);
            //TODO Доработать получение правил игры.
        }
        System.out.println(QUESTION_TEXT + getRandom());
    }
}
