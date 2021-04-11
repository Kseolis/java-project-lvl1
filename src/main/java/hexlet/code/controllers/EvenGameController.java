package hexlet.code.controllers;

import hexlet.code.model.EvenGame;
import static hexlet.code.model.GameInterface.getRandom;

import static hexlet.code.model.Game.getCounter;
import static hexlet.code.model.GameInterface.VICTORY_CONDITION;
import static hexlet.code.view.GameView.processGameDialog;

public class EvenGameController {

    public static void startEvenGame() {
        while (getCounter() < VICTORY_CONDITION) {
            int randomNumber = getRandom();
            EvenGame evenGame = new EvenGame(randomNumber);
            processGameDialog(randomNumber);

        }
    }
}
