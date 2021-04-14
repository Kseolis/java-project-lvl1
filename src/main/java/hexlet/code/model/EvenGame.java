package hexlet.code.model;

/**
 * EvenGame - класс, модель для игры.
 */
public class EvenGame implements GameInterface {
    private static final String NO = "no";
    private static final String YES = "yes";
    private static int randomNumber;

    private static String correctAnswer;

    @Override
    public final boolean checkPlayerAnswer(final String answer) {
        isEven(randomNumber);
        return correctAnswer.equals(answer);
    }

    private static void isEven(final int number) {
        correctAnswer = number % 2 == 0 ? YES : NO;
    }

    public static int randomNumber() {
        randomNumber = (int) ((Math.random() * (MAXIMUM - MINIMUM)) + MINIMUM);
        return randomNumber;
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}
