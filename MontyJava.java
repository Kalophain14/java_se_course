import java.util.Scanner;
import java.util.Random;

public class  MontyJava {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
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

        System.out.println("=== 4.c generate random number from 4 to 9 ===");
        int myRand = rand.nextInt(6) + 4;
        System.out.println("Random num: " + myRand);

        // loop from 1 to myRand
        for (int i = 1; i <= myRand; i++)
        {
            System.out.println(i);
        }

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
        }
        */

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

        /*
        System.out.println("===4.f forward & reverse + side by side===");
        int myRand = rand.nextInt(7) + 3;

        System.out.println("Random num: " + myRand);

        for (int i = 1; i <= myRand; i++) {
            System.out.println(i + " " + (myRand - i + 1)); //
        }
        */
    }
}