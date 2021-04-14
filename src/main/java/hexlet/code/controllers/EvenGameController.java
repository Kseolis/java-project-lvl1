package hexlet.code.controllers;

import hexlet.code.model.EvenGame;

import static hexlet.code.controllers.GamesController.ITEM_SCANNER;

import static hexlet.code.model.EvenGame.getCorrectAnswer;
import static hexlet.code.model.EvenGame.randomNumber;
import static hexlet.code.model.Game.setCounter;
import static hexlet.code.model.Game.getCounter;
import static hexlet.code.model.Game.getVictoryCondition;


import static hexlet.code.view.GameView.processGameDialog;
import static hexlet.code.view.GameView.getSuccessText;
import static hexlet.code.view.GameView.getFailText;
import static hexlet.code.view.GameView.getWinText;

public class EvenGameController {

    public static void playEvenGame() {
        String playerAnswer;
        while (getCounter() < getVictoryCondition()) {
            EvenGame evenGame = new EvenGame();
            int randomNumber = randomNumber();
            String correctAnswer = getCorrectAnswer();

            processGameDialog(randomNumber);
            playerAnswer = ITEM_SCANNER.next().toLowerCase();

            if (evenGame.checkPlayerAnswer(playerAnswer)) {
                getSuccessText();
                setCounter();
            } else {
                getFailText(playerAnswer, correctAnswer);
            }
        }
        getWinText();
    }
}
