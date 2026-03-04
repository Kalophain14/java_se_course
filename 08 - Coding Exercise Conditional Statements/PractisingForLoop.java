/**
 * ============================================================
 *  PRACTICE: Practising For Loop
 * ============================================================
 *  Exercises to complete:
 *    1. Print squares of numbers 1 to 10
 *    2. Print multiplication table for any number
 *    3. Sum of all even numbers from 1 to 50
 *    4. Print factors of a given number
 *    5. Check if a number is prime using for loop
 * ============================================================
 */
public class PractisingForLoop {

    public static void main(String[] args) {

        // --- Exercise 1: Squares ---
        System.out.println("=== Squares of 1 to 10 ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "² = " + (i * i));
        }

        // --- Exercise 2: Multiplication table ---
        int tableOf = 9;
        System.out.println("\n=== Table of " + tableOf + " ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableOf + " x " + i + " = " + (tableOf * i));
        }

        // --- Exercise 3: Sum of evens ---
        System.out.println("\n=== Sum of even numbers 1 to 50 ===");
        int sumEvens = 0;
        for (int i = 2; i <= 50; i += 2) {
            sumEvens += i;
        }
        System.out.println("Sum = " + sumEvens); // expected 650

        // --- Exercise 4: Factors ---
        int number = 36;
        System.out.println("\n=== Factors of " + number + " ===");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // --- Exercise 5: Prime check ---
        int checkNum = 29;
        boolean isPrime = checkNum > 1;
        for (int i = 2; i <= Math.sqrt(checkNum); i++) {
            if (checkNum % i == 0) { isPrime = false; break; }
        }
        System.out.println("\n=== Is " + checkNum + " prime? " + isPrime + " ===");
    }
}
