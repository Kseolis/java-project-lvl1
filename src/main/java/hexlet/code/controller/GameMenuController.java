package hexlet.code.controller;

import hexlet.code.Cli;
import hexlet.code.model.Games;

import java.util.Scanner;

public class GameMenuController {
    private static final Scanner ITEM_SCANNER = new Scanner(System.in);
    private static final Games GAMES = new Games(0);

    public final void menuItemSelection() {
        menuCall();
        int item = ITEM_SCANNER.nextInt();
        itemWork(item);
    }

    private static void menuCall() {
        final String[] menu = GAMES.getGameMenu();
        System.out.println("Please enter the game number and press Enter.");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " " + menu[i]);
        }
        System.out.print("Your choice: ");
    }

    private void itemWork(final int num) {
        switch (num) {
            case 0:
                return;
            case 1:
                Cli.welcome();
            default:
                GAMES.setChoiceGame(num);
                GamesController.startGame();
        }
    }
}
