package hexlet.code.controller;

import hexlet.code.Cli;
import hexlet.code.model.EvenGame;
import hexlet.code.model.Player;

import java.util.Scanner;

public class EvenController {
    private static final EvenGame EVEN_GAME = new EvenGame(1, 100);
    private static int randomNumber;
    private static final Scanner QUESTION_SCANNER = new Scanner(System.in);
    private static final String PLAYER = Player.getPlayer();
    private static final int VICTORY_CONDITION = 3;
    private static final String YES = "yes";
    private static final String NO = "no";
    private static String received;
    private static int counter = 0;

    public static void startEvenGame() {
        Cli.welcome();
        evenGameLogic();
    }

    private static void evenGameLogic() {
        randomNumber = EVEN_GAME.getRandomNumber();
        final String expected = checkNumberForEvenness();
        String expectedResult = checkAnswer(expected);
        startGameDialog();
        if (expectedResult.equals(received) && counter < VICTORY_CONDITION) {
            counter += 1;
            System.out.println(EVEN_GAME.getSuccessText());
            evenGameLogic();
        } else if (!expectedResult.equals(received)) {
            System.out.println(received
                    + EVEN_GAME.getFailText()
                    + expected
                    + ".");
            System.out.println("Let's try again, " + PLAYER + "!");
            evenGameLogic();
        }
        if (counter == VICTORY_CONDITION) {
            System.out.println(EVEN_GAME.getWinText() + PLAYER);
        }
        // TODO дописать вызов числа и проверку.
    }

    private static void startGameDialog() {
        if (counter == 0) {
            System.out.println(EVEN_GAME.getGameRule());
        }
        System.out.println(EVEN_GAME.getQuestion() + randomNumber);
        checkReceived();
    }

    private static String checkNumberForEvenness() {
        double mod = randomNumber % 2;
        String answer = YES;
        if (mod > 0) {
            answer = NO;
        }
        return answer;
    }

    private static String checkAnswer(final String answer) {
        String result = NO;
        if (answer.equals(YES)) {
            result = YES;
        }
        return result;
    }

    private static void checkReceived() {
        System.out.print(EVEN_GAME.getYourAnswer());
        received = QUESTION_SCANNER.next();
        if (!received.equals(YES) && !received.equals(NO)) {
            System.out.println("incorrect answer, try again!");
            System.out.println(EVEN_GAME.getGameRule());
            checkReceived();
        }
    }
}
