package hexlet.code.model;

public interface GameInterface {
    int MINIMUM = 1;
    int MAXIMUM = 100;

    boolean checkPlayerAnswer(String answer);
}
