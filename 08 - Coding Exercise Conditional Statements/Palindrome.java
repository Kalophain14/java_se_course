/**
 * ============================================================
 *  STUDENT CHALLENGE: Palindrome
 * ============================================================
 *  DEFINITION:
 *    A number (or string) is a palindrome if it reads the
 *    same forwards and backwards.
 *
 *  EXAMPLES (numbers):
 *    121   → reversed = 121  ✓
 *    1331  → reversed = 1331 ✓
 *    12321 → reversed = 12321 ✓
 *    123   → reversed = 321  ✗
 *
 *  ALGORITHM (number):
 *    1. Save original number
 *    2. Reverse the number using % 10 and /= 10
 *    3. Compare reversed to original
 *
 *  FLOWCHART:
 *
 *    ┌──────────┐
 *    │  Read n  │
 *    └────┬─────┘
 *         │  original = n, rev = 0
 *    ┌────▼────────┐
 *    │   n != 0?   │◄──────────────────┐
 *    └──┬───────┬──┘                   │
 *     f │     t │                      │
 *       │  ┌────▼────────────────────┐ │
 *       │  │  rev = rev * 10 + n%10  │ │
 *       │  │  n /= 10                │─┘
 *       │  └─────────────────────────┘
 *    ┌──▼────────────────┐
 *    │  rev == original? │
 *    └──┬─────────────┬──┘
 *     Y │           N │
 *  Palindrome    Not Palindrome
 * ============================================================
 */
public class Palindrome {

    public static void main(String[] args) {

        int[] testNums = {121, 1331, 12321, 123, 10};
        System.out.println("=== Number Palindrome Check ===");
        for (int n : testNums) {
            System.out.println(n + " → " + (isNumberPalindrome(n) ? "Palindrome ✓" : "Not Palindrome ✗"));
        }

        String[] testStrings = {"racecar", "madam", "hello", "level", "java"};
        System.out.println("\n=== String Palindrome Check ===");
        for (String s : testStrings) {
            System.out.println("\"" + s + "\" → " + (isStringPalindrome(s) ? "Palindrome ✓" : "Not Palindrome ✗"));
        }
    }

    static boolean isNumberPalindrome(int n) {
        int original = n, rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev == original;
    }

    static boolean isStringPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }
}
