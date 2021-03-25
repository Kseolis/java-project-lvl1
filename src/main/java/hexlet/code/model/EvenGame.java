package hexlet.code.model;

/**
 * EvenGame - класс, модель для игры.
 */
public class EvenGame {
    /**
     * min - минимальное из случайных чисел, для игры "Проверка на чётность".
     * max - максимальное из случайных чисел, для игры "Проверка на чётность".
     */
    private final int minimum;
    private final int maximum;

    public EvenGame(final int min, final int max) {
        this.minimum = min;
        this.maximum = max;
    }

    public final int getRandomNumber() {
        return (int) ((Math.random() * (maximum - minimum)) + minimum);
    }

    public final int getMinimum() {
        return minimum;
    }

    public final int getMaximum() {
        return maximum;
    }

    public final String getGameRule() {
        return "Answer 'yes' if number even, otherwise answer 'no'.";
    }

    public final String getQuestion() {
        return "Question: ";
    }

    public final String getYourAnswer() {
        return "Your answer: ";
    }

    public final String getFailText() {
        return " is wrong answer ;(. Correct answer was ";
    }

    public final String getSuccessText() {
        return "Correct!";
    }

    public final String getWinText() {
        return "Congratulations! ";
    }
}
