package hexlet.code.view;

import hexlet.code.controllers.GamesController;

public class App<T> {
    private static final GamesController GAMES_CONTROLLER =
            new GamesController();
    public static void main(final String[] args) {
        GAMES_CONTROLLER.gameFlow();
    }
}
