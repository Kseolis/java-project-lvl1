package hexlet.code.model;

public class Player {
    private static String player;

    public static String getPlayer() {
        return player;
    }

    public static void setPlayer(final String p) {
        Player.player = p;
    }
}
