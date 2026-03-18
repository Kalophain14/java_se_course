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

        /* Armstrong Numbers Using While Loop*/

        // TASK Display Digits Of a No

        // We have a number N = 257
        // we find a reminder by using mod %,
        // 257 % 10 = 7
        // 257/10 = 25
        // 25 % 10 = 5
        // 25/10 = 2
        // 2/10 = 0

        int dis = 257;

        /* for(; dis > 0; dis = dis / 10 ){
            int rem = dis % 10;
            System.out.println(rem);
        } */

        System.out.println("Enter a number");
        dis = sc.nextInt();

        int mod;

        while( dis > 0){
            mod = dis % 10;
            dis = dis / 10;

            System.out.println(mod);
        }

        //Count digits of a number
        int count = 0;
        int numC;

        System.out.println("Enter your counter");
        numC = sc.nextInt();

        while(numC > 0){
            numC = numC / 10;
            count++;
        }
        System.out.println(count);

        // Finding a num is Armstrong or not
        //input
        System.out.println("Enter your armstrong number: ");
        int armstrong = sc.nextInt();

        int arm = armstrong;   // preserve original number for comparison
        int sumOf = 0;
        int digit;

        while (arm > 0) {
            digit = arm % 10;
            sumOf = sumOf + digit * digit * digit;
            arm = arm / 10;
        }

        if (sumOf == armstrong) {
            System.out.println(armstrong + " is an Armstrong number ✅");
        } else {
            System.out.println(armstrong + " is NOT an Armstrong number ❌");
        }

        // Reverse the number + Input
        System.out.println("Enter the reversal number");
        int reversal = sc.nextInt();

        int n = reversal;
        int rev = 0;
        int nums;

        while (n > 0) {
            nums = n % 10;
            rev = (rev * 10) + nums;
            n = n / 10;
        }
        System.out.println(rev);

        //Check Palindrome

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a palindrome number or word: ");
        String word = scanner.nextLine().toLowerCase(); // convert to lowercase so "Racecar" and "racecar" are treated the same

        int left = 0;
        int right = word.length() - 1; // point to the last character index (e.g. "hello" → index 4)
        boolean isPalindrome = true;   // assume it's a palindrome until proven otherwise

// compare characters from both ends moving toward the middle
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) { // charAt() gets the character at a given index
                isPalindrome = false; // mismatch found, not a palindrome
                break;                // stops checking further
            }
            left++;  // move left pointer forward  →
            right--; // move right pointer backward ←
        }

        if (isPalindrome) {
            System.out.println("✅ \"" + word + "\" is a Palindrome!");
        } else {
            System.out.println("❌ \"" + word + "\" is NOT a Palindrome.");
        }

        scanner.close(); // always close the scanner to free up memory and resources
    }
}