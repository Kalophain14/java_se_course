import java.util.Scanner;
import java.util.*;

class javaKick {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.nextLine();

        System.out.println("You entered: " + name);
        System.out.println("Each letter:");

        // name.length() gives the total number of characters in the string
        // We loop once — the left column counts forward, the right column counts backward
        for (int letter = 0; letter < name.length(); letter++) {
            char forward  = name.charAt(letter);                      // left column: start from the front
            char backward = name.charAt(name.length() - 1 - letter); // right column: start from the back
            System.out.println(forward + "  " + backward);
        } */






        /*Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

// Counters for each vowel we are tracking
        int countA = 0;
        int countE = 0;
        int countO = 0;

// Convert to lowercase so 'A' and 'a' are treated the same
        String nameLower = name.toLowerCase();

// Repeat name.length() times — check each character one by one
        for (int i = 0; i < nameLower.length(); i++) {
            char letter = nameLower.charAt(i);  // get the character at position i

            if (letter == 'a') {
                countA++;
            } else if (letter == 'e') {
                countE++;
            } else if (letter == 'o') {
                countO++;
            }
        }

// Display the results
        System.out.println("Number of a's: " + countA);
        System.out.println("Number of e's: " + countE);
        System.out.println("Number of o's: " + countO); */









        /* int[] myNumbers = new int[10];
        Random rand = new Random();

// put 10 random numbers in an array and display them on one line
        int sizeOf = 10;
        System.out.print("All:  "); // holds all the numbers

        for (int i = 0; i < sizeOf; i++) {
            myNumbers[i] = rand.nextInt(100);   // random number 0 to 99
            System.out.print(myNumbers[i] + " ");
        }
        System.out.println(); // next line

// Go through the array again and print only the even numbers
        System.out.print("Even: ");
        int evSum = 0;  // holds even numbers

        for (int i = 0; i < sizeOf; i++) {
            if (myNumbers[i] % 2 == 0) {        // % 2 == 0 means the number divides evenly by 2
                System.out.print(myNumbers[i] + " ");
                evSum = evSum + myNumbers[i]; // add the even number to our total
            }
        }

        System.out.println();                   // move to next line
        System.out.println("Sum: " + evSum);  // display the total of all even numbers */

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        boolean playAgain = true;

        while (playAgain) {

            int score = 0; // reset to 0

            // asks the player 3 questions
            for (int i = 1; i <= 3; i++) {

                // negative numbers: range -20 to 20 (nextInt(41) - 20)
                int num1 = rand.nextInt(41) - 20;
                int num2 = rand.nextInt(41) - 20;

                // randomly pick 0=add, 1=subtract, 2=multiply, 3=divide
                int operation = rand.nextInt(4);

                int answer;
                String question;

                if (operation == 0) {  // addition
                    answer   = num1 + num2;
                    question = num1 + " + " + num2;

                } else if (operation == 1) { // subtraction
                    answer   = num1 - num2;
                    question = num1 + " - " + num2;

                } else if (operation == 2) {   // multiplication
                    answer   = num1 * num2;
                    question = num1 + " x " + num2;

                } else {   // division
                    int answer1  = rand.nextInt(10) + 1;   // decide the answer first e.g. 4
                    int divisor  = rand.nextInt(10) + 1;   // e.g. 3
                    int dividend = answer1 * divisor;      // 4 x 3 = 12, so question is 12 / 3 = ?
                    answer   = answer1;
                    question = dividend + " / " + divisor;
                }


                // show the final score after all 3 questions
                System.out.print("Q" + i + " " + playerName + ": " + question + " = ? ");
                int userAnswer = scanner.nextInt();

                // Handling output for Correct/Wrong answers
                if (userAnswer == answer) {
                    System.out.println("Correct!");
                    score = score + 1;
                } else {
                    System.out.println("Wrong. The answer was " + answer + ".");
                }
            }

            System.out.println(playerName + ", you scored " + score + " out of 3.");

            scanner.nextLine(); // clears the keyboard buffer so the next input works correctly

            // trim() removes spaces, toLowerCase() accepts "YES" "Yes" "yes"
            System.out.print("Play again? (yes/no): ");
            String reply = scanner.nextLine().trim().toLowerCase();

            playAgain = reply.equals("yes") || reply.equals("y"); // anything other than yes/y stops the game
        }
        System.out.println("Thanks for playing!");

    }
}