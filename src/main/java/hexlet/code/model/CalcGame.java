package hexlet.code.model;

public class CalcGame implements GameInterface {
    private static final char MULTIPLICATION = '*';
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';

    private static int correctAnswer;
    private int firstNumberExpression;
    private int secondNumberExpression;
    private char operationExpression;

    private static String expression;

    private final StringBuilder builder = new StringBuilder();

    @Override
    public final boolean checkPlayerAnswer(final String answer) {
        return Integer.toString(correctAnswer).equals(answer);
    }

    public static int getCorrectAnswer() {
        return correctAnswer;
    }

    public final void setCorrectAnswer(final int c) {
        correctAnswer = c;
    }

    public static String getExpression() {
        return expression;
    }

    public final void setExpression(final String e) {
        expression = e;
    }

    public final void expressionConstructor() {
        firstNumberExpression = randomNumber();
        secondNumberExpression = randomNumber();
        operationExpression = randomOperation();

        expression =  builder.append(firstNumberExpression)
                .append(" ")
                .append(operationExpression)
                .append(" ")
                .append(secondNumberExpression)
                .toString();
    }

    public final void calculatingExpression() {
        switch (operationExpression) {
            case MULTIPLICATION:
                correctAnswer =
                        firstNumberExpression * secondNumberExpression;
                break;
            case SUBTRACTION:
                correctAnswer =
                        firstNumberExpression - secondNumberExpression;
                break;
            case ADDITION:
                correctAnswer =
                        firstNumberExpression + secondNumberExpression;
                break;
            default:
                break;
        }
    }

    private char randomOperation() {
        char[] mathOperations = new char[]{'*', '-', '+'};
        int randomElement = (int) Math.floor(
                Math.random() * mathOperations.length
        );
        return mathOperations[randomElement];
    }

    private int randomNumber() {
        return (int) ((Math.random() * (MAXIMUM - MINIMUM)) + MINIMUM);
    }
}
