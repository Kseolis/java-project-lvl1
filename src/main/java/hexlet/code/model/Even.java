package hexlet.code.model;

/**
 * Even - класс, модель для игры
 */
public class Even {
    /**
     * MIN - минимальное из случайных чисел, для игры "Проверка на чётность".
     * MAX - максимальное из случайных чисел, для игры "Проверка на чётность".
     */
    private final int MIN;
    private final int MAX;

    public Even(final int min, final int max) {
        this.MIN = min;
        this.MAX = max;
    }

    public int getRandomNumber() {
        return (int) ((Math.random() * (MAX - MIN)) + MIN);
    }

    public int getMIN() {
        return MIN;
    }

    public int getMAX() {
        return MAX;
    }
}
