package hexlet.code.controllers;

import hexlet.code.model.EvenGame;

import static hexlet.code.controllers.GamesController.ITEM_SCANNER;
import static hexlet.code.model.Game.setCounter;
import static hexlet.code.model.GameInterface.getRandom;

import static hexlet.code.model.Game.getCounter;
import static hexlet.code.model.GameInterface.VICTORY_CONDITION;
import static hexlet.code.view.GameView.processGameDialog;
import static hexlet.code.view.GameView.getSuccessText;
import static hexlet.code.view.GameView.getFailText;
import static hexlet.code.view.GameView.getWinText;

public class EvenGameController {

    public static void playEvenGame() {
        String playerAnswer;
        while (getCounter() < VICTORY_CONDITION) {
            int randomNumber = getRandom();
            EvenGame evenGame = new EvenGame(randomNumber);
            processGameDialog(randomNumber);
            playerAnswer = ITEM_SCANNER.next().toLowerCase();
            if (evenGame.checkCorrectAnswer(playerAnswer)) {
                getSuccessText();
                setCounter();
            } else {
                getFailText();
            }
        }
        getWinText();
    }
}
