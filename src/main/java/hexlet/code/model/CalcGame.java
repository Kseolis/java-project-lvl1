package hexlet.code.model;

public class CalcGame implements GameInterface {
    private int operationResult;
    private int firstNumberExpression;

    @Override
    public final boolean checkPlayerAnswer(final String answer) {
        return true;
    }

    public static String randomOperation() {
        String[] mathOperations = new String[]{"*", "-", "+"};
        int randomElement = (int) Math.floor(
                Math.random() * mathOperations.length
        );
        return mathOperations[randomElement];
    }
}
