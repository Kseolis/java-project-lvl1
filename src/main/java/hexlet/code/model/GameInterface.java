package hexlet.code.model;

public interface GameInterface {
    int VICTORY_CONDITION = 3;
    int MINIMUM = 1;
    int MAXIMUM = 100;

    void gameLogic();

    boolean checkCorrectAnswer(String answer);

    static int getRandom() {
        return (int) ((Math.random() * (MAXIMUM - MINIMUM)) + MINIMUM);
    }
}
