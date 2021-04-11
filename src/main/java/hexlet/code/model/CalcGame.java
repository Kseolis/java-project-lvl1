package hexlet.code.model;

public class CalcGame implements GameInterface {
    private int operationResult;

    @Override
    public final boolean checkCorrectAnswer(final String answer) {
        int intAnswer = Integer.parseInt(answer);
        return false;
    }
}
