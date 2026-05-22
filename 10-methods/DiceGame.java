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

        //Check Dice > 0 & Roll all the Dice + Get Total
        if (numOfDice > 0){
            for (int i = 1; i < numOfDice; i++) {
                int roll = rand.nextInt(6) + 1;
                printDice(roll); //Method Calling Dice

                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        } else {
            System.out.println("Number of dice must be greater than 0");
        }

        input.close();
    }
    static void printDice(int roll) {
        System.out.println("Roll: " + roll);

        String dice = switch (roll) {
            case 1 -> """
                 -------
                |       |
                |   •   |
                |       |
                 -------
                """;

            case 2 -> """
                 -------
                | •     |
                |       |
                |     • |
                 -------
                """;

            case 3 -> """
                 -------
                | •     |
                |   •   |
                |     • |
                 -------
                """;

            case 4 -> """
                 -------
                | •   • |
                |       |
                | •   • |
                 -------
                """;

            case 5 -> """
                 -------
                | •   • |
                |   •   |
                | •   • |
                 -------
                """;

            case 6 -> """
                 -------
                | •   • |
                | •   • |
                | •   • |
                 -------
                """;

            default -> "Invalid roll: must be 1–6";
        };

        System.out.println(dice);
    }
}
