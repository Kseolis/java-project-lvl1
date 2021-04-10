package hexlet.code;

import hexlet.code.model.Greet;
import hexlet.code.model.Player;

import java.util.Scanner;

public class Cli {
    private static final Scanner PLAYER_NAME_SCANNER = new Scanner(System.in);

    public static void welcome() {
        greetDialog();
    }

    private static void greetDialog() {
        System.out.println(Greet.getWelcomeText());
        System.out.print(Greet.getAskNameText());
        String playerName = PLAYER_NAME_SCANNER.next();
        Player.setPlayer(playerName);
        final String hello =  "Hello, " + playerName + "!";
        System.out.println(hello);
    }
}
