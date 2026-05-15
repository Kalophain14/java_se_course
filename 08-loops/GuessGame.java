import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        int guess;
        int attempts = 0;
        int min = 1;
        int max = 10;
        int randonNumber = rand.nextInt(min, max + 1);

        System.out.println("==Number Guessing Game==");
        System.out.printf("Guess a number between %d-%d\n: ", min, max);

        do {
            System.out.print("Enter a number: ");
            guess = input.nextInt();
            attempts++;

            if (guess < randonNumber) {
                System.out.println("Too Lower, try again!");
            } else if (guess > randonNumber) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("You guessed the correct number!: " + randonNumber);
                System.out.println("number of attempts made: " + attempts);
            }

        }while(guess != randonNumber);

        input.close();
    }
}