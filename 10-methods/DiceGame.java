import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        //Java Dice Roller Program

        Scanner input = new Scanner(System.in); //accept user input
        Random rand = new Random(); //get random numbers
        int numOfDice;
        int total = 0;

        //Get # Of Dice From the user
        System.out.print("Enter the number of dice to roll: ");
        numOfDice = input.nextInt();

        //Check if # of Dice > 0
        if (numOfDice > 0){
            for (int i = 1; i < numOfDice; i++) {
                int roll = rand.nextInt(6) + 1;
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        } else {
            System.out.println("Number of dice must be greater than 0");
        }



        //Roll all the Dice

        //Get the total

        //Display ASCCI DICE
    }
}
