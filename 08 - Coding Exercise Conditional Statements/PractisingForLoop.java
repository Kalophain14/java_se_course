import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * ============================================================
 *  PRACTICE: Practising For Loop
 * ============================================================
 *  Exercises to complete:
 *    1. Print squares of numbers 1 to 10
 *    2. Print multiplication table for any number
 *    3. Sum of all even numbers from 1 to 50
 * ============================================================
 */
public class PractisingForLoop {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        // Print squares
        for (int s = 1; s <= 10; s++) {
            System.out.println("1² = 1");
        }

        // print multiplication
        //int tableNumber = 7;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int tableNumber = sc.nextInt();

        for (int t = 1; t <= 10; t++) {
            System.out.println(tableNumber + " x " + t + " = " + (tableNumber * t));
        }
        //System.out.println();

        //sumOfAll
        System.out.println("Enter a number");

        Scanner as = new Scanner(System.in);
        int evenSum = as.nextInt();

        for (int e = 1; e <= 50; e++){
            if (e % 2 == 0) {
                evenSum += e;
            }
        }
        System.out.println("sum of all that number is " + evenSum);

        //Fibonacci Series




    }
}
