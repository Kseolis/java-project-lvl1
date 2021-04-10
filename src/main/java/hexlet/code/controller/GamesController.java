package hexlet.code.controller;

import hexlet.code.Cli;
import hexlet.code.model.CalcGame;
import hexlet.code.model.EvenGame;
import hexlet.code.model.Game;

public class GamesController {
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;

    public final void startGame() {
        Cli.welcome();
        switch (Game.getChoiceGame()) {
            case EVEN_GAME:
                new EvenGame();
            case CALC_GAME:
                new CalcGame();
            default:
                break;
        }
    }
}
