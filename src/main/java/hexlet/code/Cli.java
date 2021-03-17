package hexlet.code;

import hexlet.code.model.Player;

import java.util.Scanner;

public class Cli {
    public static void welcome() {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        final Player player = new Player(sc.next());
        final String hello =  "Hello, " + player + "!";
        System.out.println(hello);
    }
}
