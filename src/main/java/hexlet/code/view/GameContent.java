package hexlet.code.view;

public class GameContent {
    static final String ASK_ANSWER_TEXT = "Your answer: ";
    static final String QUESTION_TEXT = "Question: ";
    static final String FAIL_TEXT = " is wrong answer ;(. Correct answer was ";

    static final String SUCCESS_TEXT =  "Correct!";
    static final String WIN_TEXT = "Congratulations! ";


    static final String EVEN_GAME_RULE =
            "Answer 'yes' if number even, otherwise answer 'no'.";

    static final String CALC_GAME_RULE =
            "What is the result of the expression?";

    static final String[] GAME_RULES = {
            null,
            null,
            EVEN_GAME_RULE,
            CALC_GAME_RULE
    };
}
