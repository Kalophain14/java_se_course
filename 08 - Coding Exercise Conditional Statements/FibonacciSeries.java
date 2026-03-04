/**
 * ============================================================
 *  STUDENT CHALLENGE: Fibonacci Series
 * ============================================================
 *  DEFINITION:
 *    Each number is the sum of the two preceding numbers.
 *    Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 *
 *  FORMULA:
 *    F(0) = 0
 *    F(1) = 1
 *    F(n) = F(n-1) + F(n-2)  for n > 1
 *
 *  FLOWCHART:
 *
 *    ┌──────────┐
 *    │  Read n  │  (how many terms)
 *    └────┬─────┘
 *         │  a=0, b=1, count=0
 *    ┌────▼────────┐
 *    │ count < n ? │◄─────────────────────┐
 *    └──┬───────┬──┘                      │
 *     f │     t │                         │
 *       │  ┌────▼───────────────────────┐ │
 *       │  │ print a                    │ │
 *       │  │ next = a + b               │ │
 *       │  │ a = b  →  b = next         │ │
 *       │  │ count++                    │─┘
 *       │  └────────────────────────────┘
 *    ┌──▼──────┐
 *    │   END   │
 *    └─────────┘
 * ============================================================
 */
public class FibonacciSeries {

    public static void main(String[] args) {
    }
}
