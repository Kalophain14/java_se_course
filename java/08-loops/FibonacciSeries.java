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
import java.util.*;
public class FibonacciSeries {

    public static void main(String[] args) {

        //AP Series Challange
        Scanner ap = new Scanner(System.in);

        System.out.println("Program to print AP Series");
        System.out.println("Enter a, d and n");
        int a = ap.nextInt();
        int d = ap.nextInt();
        int n = ap.nextInt();

        int term = a;

        for (int i = 0; i<n; i++){
            System.out.print(term + " ,");
            term = term + d; //get the next term and print next term until i == n
        }

        //Display GP Series
        Scanner gp = new Scanner(System.in);

        System.out.println("Program to print GP Series");
        System.out.println("Enter b e and o");
        int b = gp.nextInt();
        int e = gp.nextInt();
        int o = gp.nextInt();

        int term2 = o;

        for (int g = 0; g < o; g++){
            System.out.print(term2 + " ,");
            term2 = term2*e;
        }

        // Fibonacci Series
        Scanner fb = new Scanner(System.in);
        System.out.println("Program to print Fibonacci Series");
        System.out.println("Enter your fib numbers");
        int fib = fb.nextInt();

        int aFib = 0;
        int bFib = 1;

        /*int count = 0;
        while (count < fib) {
            System.out.print(aFib + " ,");
            int next = aFib + bFib;
            aFib = bFib;
            bFib = next;
            count++;
        }*/

        for (int count = 0; count < fib-2; count++){
            int next = aFib + bFib;
            System.out.println(aFib + ", ");
            aFib = bFib;
            bFib = next;
        }
    }
}