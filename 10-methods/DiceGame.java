import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        //Java Dice Roller Program

        Scanner input = new Scanner(System.in); //accept user input
        Random rand = new Random(); //get random numbers
        int numOfDice;
        int total;

        System.out.print("Enter the number of dice to roll: ");
        numOfDice = input.nextInt();
        
        //Get # Of Dice From the user
        
        if (numOfDice > 0){
            System.out.println("You rolled the dice");
        } else {
            System.out.println("Number of dice must be greater than 0");
        }

        //Check if # of Dice > 0

        //Roll all the Dice

        //Get the total

        //Display ASCCI DICE
    }
}
