package higher.lower;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Daniel Gurbiel
 */

public class GameHigherLower {
    private int range;
    private static int number_of_attempts;
    private static Scanner input;
    private int random_value;
    private Random generator;

    public GameHigherLower() {
        number_of_attempts = 0;
        range = 0;
        input = new Scanner(System.in);
        generator = new Random();
    }
    
    public int getRange(){
        return range;
    }
    
    public void setRange(int range){
        this.range = range;
    }
    
    public int getNumberOfAttempts(){
        return number_of_attempts;
    }
    
    public void increaseNumberOfAttempts(){
        number_of_attempts++;
    }
    
    public void play(){
        generateRandomValue();
        int result;
        
        try{
            
            do{
                System.out.print("Insert value: ");
                result = input.nextInt();
                increaseNumberOfAttempts();
                if(result > random_value) System.out.println("Too large...");
                else if(result < random_value) System.out.println("To small...");
                
            } while(result != random_value);
            
        } catch (InputMismatchException e) {
            System.out.println("Input by user was not a number.");
            e.printStackTrace();
        }  
        
        System.out.print("You won! The number of your attempts is: " + number_of_attempts + ".");
    }
    
    public void generateRandomValue(){
        random_value = generator.nextInt(range)+1;
    }
    
}
