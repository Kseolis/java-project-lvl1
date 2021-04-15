package hexlet.code.controllers;

import hexlet.code.model.CalcGame;
import hexlet.code.view.GameView;

import static hexlet.code.controllers.GamesController.ITEM_SCANNER;

import static hexlet.code.model.CalcGame.getExpression;
import static hexlet.code.model.CalcGame.getCorrectAnswer;

import static hexlet.code.model.Game.getVictoryCondition;
import static hexlet.code.model.Game.getCounter;
import static hexlet.code.model.Game.setCounter;

import static hexlet.code.view.GameView.getSuccessText;
import static hexlet.code.view.GameView.getFailText;
import static hexlet.code.view.GameView.getWinText;

public class CalcGameController {

    public static void playCalcGame() {
        String playerAnswer;
        while (getCounter() < getVictoryCondition()) {
            CalcGame calcGame = new CalcGame();

            calcGame.expressionConstructor();
            calcGame.calculatingExpression();

            String e = getExpression();
            String correctAnswer = Integer.toString(getCorrectAnswer());

            GameView.processGameDialog(e);

            playerAnswer = ITEM_SCANNER.next().toLowerCase();

            if (calcGame.checkPlayerAnswer(playerAnswer)) {
                getSuccessText();
                setCounter();
            } else {
                getFailText(playerAnswer, correctAnswer);
            }
        }
        getWinText();
    }
}
