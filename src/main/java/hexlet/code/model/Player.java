package hexlet.code.model;

public class Player {
    private String player;

    public Player(final String p) {
        this.player = p;
    }

    public final String getPlayer() {
        return player;
    }

    public final void setPlayer(final String p) {
        this.player = p;
    }
}
