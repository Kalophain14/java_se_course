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
    }
}
