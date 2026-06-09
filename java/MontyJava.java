import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class  MontyJava {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        /*int evenCount = 0;
        int oddCount = 0;
        int oddSum = 0;

        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(100);

            if (num % 2 == 0) { // % gives remainder → 0 means even
                evenCount++;
            } else {
                oddCount++;
                oddSum += num; // add VALUE, not 1
            }
        }*/

        /*


        //User to enter random numbers
        System.out.print("Enter the any random to generate: ");
        int numCount = input.nextInt();

        int sumSmall = 0, countSmall = 0;
        int sumBig = 0, countBig = 0;
        int sumAll = 0;


        //Looping through random num based user input from num 0-99
        for (int i = 0; i < numCount; i++) {
            int num = rand.nextInt(100);
            sumAll += num; //Storing the random numbers

            //Checking whether num is less than 50 + iterating
            if (num < 50) {
                sumSmall += num;
                countSmall++;
            } else {
                sumBig += num;
                countBig++;
            }
        }

        //Casting the output to be able to handle the decimals + using printf for easy decimal
        System.out.printf("The Average of <50 : %.2f\n", (sumSmall / (double) countSmall));
        System.out.printf("The Average of >=50: %.2f\n", (sumBig / (double) countBig));
        System.out.printf("The Average of All: %.2f\n", (sumAll / (double) numCount));

        input.close();*/


        /*
        int negative = 0;

        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(21) - 10; //Gen 20 num -10 to 10
            if (num < 0)
                negative++;
        }
        System.out.println("Negatives: " + negative);
        */



       /*
       RANDOM FORMULAE
       a = 4
       b = 9
       b − a + 1) = how many values are possible
       + a = where the range starts
       int myRand = rand.nextInt(b - a + 1) + a
       int myRand = rand.nextInt(9 - 4 + 1) + 4
       int myRand = rand.nextInt(6) + 4;

       Generate 6 numbers and start from 4
       0 1 2 3 4 5
       4 5 6 7 8 9
       */

        /*System.out.println("=== 4.c generate random number from 4 to 9 ===");
        int myRand = rand.nextInt(6) + 4;
        System.out.println("Random num: " + myRand);

        // loop from 1 to myRand
        for (int i = 1; i <= myRand; i++)
        {
            System.out.println(i);
        }*/

        /*
        System.out.println("=== 4.d gen random num (3-6 print 1->n then n->1 ===");
        int myRand = rand.nextInt(4) + 3;
        System.out.println("Random num: " + myRand);

        // Forward loop
        for (int i = 1; i <= myRand; i++) {
            System.out.println(i);
        }
        // Reverse Loop
        for (int i = myRand; i >= 1; i--) {
                System.out.println(i);
        }*/

        /*
        System.out.println("===4.e No duplicate ===");
        int myRand = rand.nextInt(4) + 3;
        System.out.println("Random num: " + myRand);

        // Forward loop
        for (int i = 1; i <= myRand; i++) {
            System.out.println(i);
        }
        // Reverse: start lower (no duplicate)
        for (int i = myRand - 1; i >= 1; i--) {
            System.out.println(i);
        }
        */


        /*System.out.println("===4.f forward & reverse + side by side===");
        int myRand = rand.nextInt(7) + 3;

        System.out.println("Random num: " + myRand);

        int countBack = myRand;
        for (int i = 1; i <= myRand; i++) {
            System.out.println(i + " " + (myRand - i + 1) + " " + countBack);
            countBack--;
        }*/

        /*
        System.out.println("===5b even and odd 1-40===");
        for (int i = 1; i <= 10; i++) {
            int myNum = rand.nextInt(40) + 1; // 1–40

            if (myNum % 2 == 0) {
                System.out.println(myNum + " (even)");
            } else {
                System.out.println(myNum + " (odd)");
            }
        }
        */

        /*System.out.println("===5c 10 numbers divisible by 2 or 3===");
        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(100) + 1; // 1–100

            if (num % 2 == 0) {
                System.out.println(num + "(two)");
            } else if (num % 3 == 0) {
                System.out.println(num + "(three)");
            }
            else {
                System.out.println(num);
        }*/


        /*
        System.out.println("===6a 10 numbers divisible by 2 and/or 3===");
        int size = 6;

        for (int i = 1; i <= size; i++) {
            int myNum = rand.nextInt(19) + 2; // 2–20

            if (myNum % 2 == 0 && myNum % 3 == 0) {
                System.out.println(myNum + " correct");
            } else {
                System.out.println(myNum);
            }
        }
        */

        /*
        System.out.println("===6b values of (2 & 3)(2 & 5)(6,10,12)===");
        int size = 6;

        for (int i = 1; i <= size; i++) {
            int num = rand.nextInt(20) + 2; // 1–20

            if ((num % 2 == 0 && num % 3 == 0) ||
                    (num % 2 == 0 && num % 5 == 0)) {
                System.out.println(num + " correct");
            } else {
                System.out.println(num);
            }
        }
        */

        /*
        System.out.println("==6c 10 numbers Small, Large and Average==");
        int size = 10;
        for (int i = 1; i <= size; i++) {
            int num = rand.nextInt(100); // 0–99


            if (num <= 33) { //0-33
                System.out.println(num + " Small");
            } else if (num <= 66) { //34-66
                System.out.println(num + " Average");
            } else { //67-99
                System.out.println(num + " Large");
            }
            */

            /*
            switch(num/34){
                //Using an idea of boxes storing things 33 = 0, 34 = 1 68 = 2
                case 1 -> {
                    System.out.println(num + " Small");
                }
                case 2 -> {
                    System.out.println(num + " Average");
                }
                case 3 -> {
                    System.out.println(num + " Large");
                }
                }
              */



            /*
            int z =1;
            while(z <= 10){
                int myNum = rand.nextInt(100); // 0–99

                if (myNum <= 33) { //0-33
                    System.out.println(myNum + " Small");
                } else if (num <= 66) { //34-66
                    System.out.println(myNum + " Average");
                } else { //67-99
                    System.out.println(myNum + " Large");
                }
            }
            i++; //infinite loop

             */


        /*
        System.out.println("==7b 1-9==");
        int size = rand.nextInt(6) + 2;

        for (int i = 1; i <= size; i++) { //rows
            for (int j = 1; j <= i; j++) { //column
                System.out.print(" *");
            }
            System.out.println();
        }
        */


        /*
        System.out.println("==7c num repeated ==");
        int size = rand.nextInt(6) + 2;
        System.out.println("The random size num is: " + size);

        for (int i = 1; i <= size; i++) { //rows
            for (int j = 1; j <= i; j++) { //colums
                System.out.print(i + " ");
            }
            System.out.println();
        }
        */

        /*
        System.out.println("==7d fixed grid pattern ==");
        int size = rand.nextInt(6) + 2;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        */

        /*
        // Prompt user for their name
        System.out.print("Enter your name: ");
        //String name = scanner.nextLine();
        String name = "aaaAbeEEoi";
        // Display the entered name
        System.out.println("You entered: " + name);

        // Display each letter on a new line
        System.out.println("Each letter:");
        int countA = 0;
        int countE = 0;
        int countO = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'A' ){
                countA++;
            }
            if (Character.toLowerCase(name.charAt(i)) == 'e'){
                countE++;
            }
            if (name.charAt(i) == 'o'){
                countO++;
            }
        }
        System.out.println("A: " +countA);
        System.out.println("E: " +countE);
        System.out.println("O: " +countO);

        scanner.close();
        */

        /*
        int[] myNumbers = new int[10];
        int size = 5;

        System.out.println("Forward");
        for (int i = 0; i < size; i++) {
            myNumbers[i] = rand.nextInt(1000);
            System.out.println(myNumbers[i]);
        }
        System.out.println("Reverse");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(myNumbers[i]);
        }
        */

        /*
        System.out.println("== 9a. Generate 10, Even & add sumofEven ==");
        int[] nums = new int[10];
        int sum = 0;

        // Fill array + print all numbers
        System.out.print("All num: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(10); // 0–9
            System.out.print(nums[i] + " ");
        }
        System.out.println(); //New Line

        // Print even numbers + sum
        System.out.print("Even: ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i] + " ");
                sum += nums[i];
            }
        }
        System.out.println();
        // Print sum
        System.out.println("Sum: " + sum);
        */


        /*
        System.out.println("== 9c. Fill, Print & Sort Arrays ==");
        int[] nums = new int[20];
        // Fill array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(100); // 0–99
        }

        // Print original array
        System.out.println("Original:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // Sort array
        Arrays.sort(nums);

        // Print sorted array
        System.out.println("Sorted:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        */

        /*
        System.out.println("==Math Addition quiz ==");
        int score = 0;

        for (int i = 1; i <= 3; i++) {
            int correctAnswer = addition(i);
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct! ✅");
                score++;
            } else {
                System.out.println("Wrong ❌ Correct answer: " + correctAnswer);
            }
        }

        System.out.println("Quiz complete! Score: " + score + "/3");

        scanner.close();
    }

    // Method to generate question and return correct answer
    public static int addition ( int questionNo){
        Random rand = new Random();

        int num1 = rand.nextInt(20) + 1; // 1–20
        int num2 = rand.nextInt(20) + 1; // 1–20

        System.out.print("Question " + questionNo + ": What is "
                + num1 + " + " + num2 + "? ");

        return num1 + num2;
        */


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int rounds = 5;
        String playAgain = "yes";

        //handle A-Z a-z
        while (playAgain.equalsIgnoreCase("yes")) {

            int score = 0;
            System.out.println("\nHi " + name + "!");

            //Genrate 5 question using rounds
            for (int i = 1; i <= rounds; i++) {
                int num1 = rand.nextInt(20) + 1;
                int num2 = rand.nextInt(20) + 1;

                /*
                Generates 0-3 mapping the user to one of the switch case
                Which math operator to use
                 */
                int randNum = rand.nextInt(4);

                int answer = 0;
                String symbol = "";

                //Switch Cases
                switch (randNum) {
                    case 0: //Addition
                        answer = num1 + num2;
                        symbol = "+";
                        break;
                    case 1: //Substraction
                        answer = num1 - num2;
                        symbol = "-";
                        break;
                    case 2: //Multiplication
                        answer = num1 * num2;
                        symbol = "*";
                        break;
                    case 3: //Division
                        num2 = rand.nextInt(9) + 1; //avoids division by 0 start 1-9
                        answer = rand.nextInt(10) + 1; //Generates correct number
                        num1 = answer * num2;
                        symbol = "/";
                        break;
                }

                //Displays the question
                //Division is also handled whereby the symbol is used to display the operands
                System.out.print("Q" + i + ": " + num1 + " " + symbol + " " + num2 + " = ");
                int user = scanner.nextInt();

                //Checks answer
                if (user == answer) {
                    System.out.println("Correct");
                    score++;
                } else {
                    System.out.println("Wrong Ans: " + answer);
                }
            }

            //result in division
            System.out.println("\nScore: " + score + "/" + rounds);
            scanner.nextLine();

            //User decide to play or no
            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine();
        }

        System.out.println("Bye " + name);
        scanner.close();
    }
}