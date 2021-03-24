package hexlet.code.model;

public class Greet {
    private static final String WELCOME_TEXT = "Welcome to the Brain Games!";

    private static final String ASK_NAME_TEXT = "May I have your name? ";

    public static String getWelcomeText() {
        return WELCOME_TEXT;
    }

    public static String getAskNameText() {
        return ASK_NAME_TEXT;
    }
}
