package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void userGreet() {
        final Scanner sc = new Scanner(System.in);
        System.out.print( "May I have your name? ");
        final String name = sc.next();
        final String hello =  "Hello, " + name + "!";
        System.out.println(hello);
    }
}
