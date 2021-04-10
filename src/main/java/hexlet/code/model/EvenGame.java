package hexlet.code.model;

import static hexlet.code.model.Game.getCounter;

/**
 * EvenGame - класс, модель для игры.
 */
public class EvenGame implements GameInterface {
    private static final String NO = "no";
    private static final String YES = "yes";
    private static String expected;

    @Override
    public final void gameLogic(final int randomNumber) {
        while (getCounter() < VICTORY_CONDITION) {
            isEven(randomNumber);

        }
    }

    private static void isEven(final int number) {
        expected = number % 2 == 0 ? YES : NO;
    }

    @Override
    public final boolean checkCorrectAnswer(final String answer) {
        return expected.equals(answer);
    }
}
