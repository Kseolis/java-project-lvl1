package hexlet.code.controllers;

import java.util.InputMismatchException;
import java.util.Scanner;

import static hexlet.code.controllers.CalcGameController.startCalcGame;
import static hexlet.code.controllers.EvenGameController.startEvenGame;
import static hexlet.code.view.GameView.menuCall;
import static hexlet.code.view.GameView.startGameDialog;

public class GamesController {
    private static final Scanner ITEM_SCANNER = new Scanner(System.in);
    private int gameNumber = 0;

    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;

    public final void gameFlow() {
        menuCall();
        tryScanNumber();
        gameInitialization();
    }

    public final void gameInitialization() {
        switch (gameNumber) {
            case EVEN_GAME:
                startEvenGame();
            case CALC_GAME:
                startCalcGame();
            default:
                break;
        }
    }

    private void tryScanNumber() {
        boolean validInput = false;
        do {
            try {
                gameNumber = ITEM_SCANNER.nextInt();
                startGameDialog(gameNumber);
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
