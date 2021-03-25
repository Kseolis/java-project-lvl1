package hexlet.code.controller;

import hexlet.code.model.Games;

import static hexlet.code.controller.EvenController.startEvenGame;

public class GamesController {

    public static void startGame() {
        switch (Games.getChoiceGame()) {
            case 2:
                startEvenGame();
            default:
                break;
        }
    }
}
