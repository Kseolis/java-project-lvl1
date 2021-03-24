package hexlet.code.controller;

import hexlet.code.model.EvenGame;

public class EvenController {
    private int counter;

    public final void evenGameLogic(final String received) {
        final EvenGame even = new EvenGame(1, 100);
        final int randomNumber = even.getRandomNumber();
        final String answer = checkNumberForEvenness(randomNumber);
        checkAnswer(answer);
        // TODO дописать вызов числа и проверку.
    }

    private String checkNumberForEvenness(final int randomNumber) {
        double mod = randomNumber % 2;
        String answer = "yes";
        if (mod > 0) {
            answer = "no";
        }
        return answer;
    }

    private boolean checkAnswer(final String answer) {
        boolean result = false;
        if (answer.equals("yes")) {
            result = true;
        }
        return result;
    }
}
