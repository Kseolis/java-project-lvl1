package hexlet.code.model;

public class Player {
    private static String player;

    public Player(final String p) {
        player = p;
    }

    public static String getPlayer() {
        return player;
    }
}
