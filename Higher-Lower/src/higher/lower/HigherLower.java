package higher.lower;

import java.util.Scanner;

/**
 *
 * @author Daniel Gurbiel
 */
public class HigherLower {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        GameHigherLower game = new GameHigherLower();
        System.out.println("Hello! This is game: higher / lower. Let's start! Enjoy!");
        System.out.print("Set range: ");
        game.setRange(input.nextInt());
        
    }
    
}
