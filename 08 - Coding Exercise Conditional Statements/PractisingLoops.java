/**
 * ============================================================
 *  PRACTICE: Practising Loops (while & do-while)
 * ============================================================
 *  Exercises to complete:
 *    1. Print even numbers from 2 to 20 using while
 *    2. Print odd numbers from 1 to 19 using do-while
 *    3. Sum of digits of a number using while
 *    4. Reverse a number using while
 *    5. Count digits in a number using while
 * ============================================================
 */
public class PractisingLoops {

    public static void main(String[] args) {

        // --- Exercise 1: Even numbers 2–20 (while) ---
        System.out.println("=== Even numbers 2 to 20 ===");
        int n = 2;
        while (n <= 20) {
            System.out.print(n + " ");
            n += 2;
        }
        System.out.println();

        // --- Exercise 2: Odd numbers 1–19 (do-while) ---
        System.out.println("\n=== Odd numbers 1 to 19 ===");
        int m = 1;
        do {
            System.out.print(m + " ");
            m += 2;
        } while (m <= 19);
        System.out.println();

        // --- Exercise 3: Sum of digits ---
        System.out.println("\n=== Sum of digits of 4572 ===");
        int num = 4572, sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum = " + sum); // expected 18

        // --- Exercise 4: Reverse a number ---
        System.out.println("\n=== Reverse of 1234 ===");
        int original = 1234, reversed = 0;
        while (original != 0) {
            reversed = reversed * 10 + (original % 10);
            original /= 10;
        }
        System.out.println("Reversed = " + reversed); // expected 4321

        // --- Exercise 5: Count digits ---
        System.out.println("\n=== Digit count of 98765 ===");
        int value = 98765, count = 0;
        while (value != 0) {
            count++;
            value /= 10;
        }
        System.out.println("Digits = " + count); // expected 5
    }
}
