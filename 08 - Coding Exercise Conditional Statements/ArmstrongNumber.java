/**
 * ============================================================
 *  STUDENT CHALLENGE: Armstrong Number
 * ============================================================
 *  DEFINITION:
 *    A number is Armstrong (narcissistic) if the sum of its
 *    digits each raised to the power of the number of digits
 *    equals the number itself.
 *
 *  EXAMPLES:
 *    153  → 1³ + 5³ + 3³ = 1 + 125 + 27 = 153  ✓
 *    370  → 3³ + 7³ + 0³ = 27 + 343 + 0 = 370  ✓
 *    9474 → 9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474           ✓
 *    123  → 1³ + 2³ + 3³ = 1 + 8 + 27 = 36  ✗
 *
 *  ALGORITHM:
 *    1. Count number of digits (len)
 *    2. Extract each digit and raise it to power len
 *    3. Sum all powered digits
 *    4. If sum == original number → Armstrong
 *
 *  FLOWCHART:
 *
 *    ┌──────────┐
 *    │  Read n  │
 *    └────┬─────┘
 *         │  temp = n, sum = 0, len = countDigits(n)
 *    ┌────▼────────┐
 *    │  temp != 0? │◄────────────────┐
 *    └──┬───────┬──┘                 │
 *     f │     t │                    │
 *       │  ┌────▼──────────────────┐ │
 *       │  │ digit = temp % 10     │ │
 *       │  │ sum += digit ^ len    │ │
 *       │  │ temp /= 10            │─┘
 *       │  └───────────────────────┘
 *    ┌──▼─────────────┐
 *    │  sum == n?     │
 *    └──┬─────────┬───┘
 *     Y │       N │
 *  Armstrong   Not Armstrong
 * ============================================================
 */
public class ArmstrongNumber {

    public static void main(String[] args) {

        int[] testValues = {153, 370, 371, 407, 9474, 123, 100};

        for (int n : testValues) {
            System.out.println(n + " → " + (isArmstrong(n) ? "Armstrong ✓" : "Not Armstrong ✗"));
        }
    }

    static boolean isArmstrong(int n) {
        int temp = n, sum = 0;
        int len = String.valueOf(n).length();
        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, len);
            temp /= 10;
        }
        return sum == n;
    }
}
