package hexlet.code.model;

/**
 * EvenGame - класс, модель для игры.
 */
public class EvenGame implements GameInterface {
    private static final String NO = "no";
    private static final String YES = "yes";
    private final int random;
    private static String expected;

    public EvenGame(final int r) {
        this.random = r;
    }

    @Override
    public final boolean checkCorrectAnswer(final String answer) {
        isEven(random);
        return expected.equals(answer);
    }

    private static void isEven(final int number) {
        expected = number % 2 == 0 ? YES : NO;
    }
}
