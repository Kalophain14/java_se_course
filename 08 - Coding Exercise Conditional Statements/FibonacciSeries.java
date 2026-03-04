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

        System.out.println("=== First 15 Fibonacci numbers ===");
        printFibonacci(15);

        System.out.println("\n=== Fibonacci up to 100 ===");
        printFibonacciUpTo(100);

        System.out.println("\n=== Find the 10th Fibonacci number ===");
        System.out.println("F(10) = " + fibonacci(10)); // expected 55
    }

    static void printFibonacci(int terms) {
        int a = 0, b = 1;
        for (int count = 0; count < terms; count++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    static void printFibonacciUpTo(int limit) {
        int a = 0, b = 1;
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    static long fibonacci(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long next = a + b; a = b; b = next;
        }
        return b;
    }
}
