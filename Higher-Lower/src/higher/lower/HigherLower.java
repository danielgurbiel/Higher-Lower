package higher.lower;

import java.util.InputMismatchException;
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
        try{
            int range;
            do{
                System.out.print("Set range: ");
                range = input.nextInt();
            } while(range < 1);
            game.setRange(range);
            game.play();
        } catch (InputMismatchException e) {
            System.out.println("Input by user was not a number.");
            e.printStackTrace();
        }   
    } 
}
