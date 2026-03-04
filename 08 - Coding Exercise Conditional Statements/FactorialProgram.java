/**
 * ============================================================
 *  STUDENT CHALLENGE: Factorial Program
 * ============================================================
 *  PROBLEM:
 *    Given a non-negative integer n, compute n! (n factorial).
 *
 *  DEFINITION:
 *    n! = n × (n-1) × (n-2) × ... × 2 × 1
 *    0! = 1  (by definition)
 *
 *  EXAMPLES:
 *    5! = 5 × 4 × 3 × 2 × 1 = 120
 *    6! = 720
 *    0! = 1
 *
 *  FLOWCHART:
 *
 *    ┌──────────┐
 *    │  Read n  │
 *    └────┬─────┘
 *         │  result = 1, i = 1
 *    ┌────▼──────────┐
 *    │   i <= n ?    │◄─────────────┐
 *    └──┬─────────┬──┘              │
 *     f │       t │                 │
 *       │   ┌────▼────────────┐     │
 *       │   │ result = result │     │
 *       │   │        * i      │     │
 *       │   └────┬────────────┘     │
 *       │        │  i++             │
 *       │        └──────────────────┘
 *    ┌──▼──────────────┐
 *    │  Print result   │
 *    └─────────────────┘
 * ============================================================
 */
public class FactorialProgram {

    public static void main(String[] args) {

        // --- Test cases ---
        int[] testValues = {0, 1, 5, 6, 10};

        for (int n : testValues) {
            System.out.println(n + "! = " + factorial(n));
        }
    }

    /**
     * Returns the factorial of n using a for loop.
     * @param n non-negative integer
     * @return n!
     */
    static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
