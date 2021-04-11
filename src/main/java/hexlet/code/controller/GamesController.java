package hexlet.code.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import static hexlet.code.view.App.menuCall;
import static hexlet.code.view.App.startGameDialog;

public class GamesController {
    private static final Scanner ITEM_SCANNER = new Scanner(System.in);
    private int game = 0;

    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;

    public final void startGame() {
        menuCall();
        tryScanNumber();
    }

    public final boolean gameFlow() {
        return game == EVEN_GAME;
    }

    private void tryScanNumber() {
        boolean validInput = false;
        do {
            try {
                game = ITEM_SCANNER.nextInt();
                startGameDialog(game);
                validInput = true;
            } catch (ArrayIndexOutOfBoundsException
                    | InputMismatchException e) {
                ITEM_SCANNER.nextLine();
                System.out.println("Incorrect input!");
                System.out.print("Input an integer from 0 to 3: ");
            }
        } while (!validInput);
    }
}
