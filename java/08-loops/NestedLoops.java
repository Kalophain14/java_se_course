import java.util.Scanner;

/**
 * ============================================================
 *  TOPIC: Nested Loops
 * ============================================================
 *
 *  CONCEPT: A loop inside another loop.
 *           Outer loop runs n times; inner loop runs m times
 *           per outer iteration → total = n × m iterations.
 *
 *  FLOWCHART:
 *
 *        ┌──────────┐
 *        │  START   │
 *        └────┬─────┘
 *             │  i = 1
 *        ┌────▼──────────┐
 *   ┌───►│  i <= rows ?  │
 *   │    └──┬─────────┬──┘
 *   │     f │       t │
 *   │       │    ┌────▼──────────┐     j = 1
 *   │       │    │  j <= cols ?  │◄─────────────┐
 *   │       │    └──┬─────────┬──┘              │
 *   │       │     f │       t │                 │
 *   │       │       │   ┌────▼────────────┐     │
 *   │       │       │   │  print element  │     │
 *   │       │       │   └────┬────────────┘     │
 *   │       │  newline  ┌────▼────────────┐     │
 *   │       │       │   │     j++         │─────┘
 *   └───────┘   i++ │   └─────────────────┘
 *           │       │
 *        ┌──▼──────┐
 *        │   END   │
 *        └─────────┘
 *
 *  SYNTAX:
 *    for (int i = 1; i <= rows; i++) {       // outer loop
 *        for (int j = 1; j <= cols; j++) {   // inner loop
 *            // body code
 *        }
 *    }
 * ============================================================
 */
public class NestedLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
        } */

        //Matrixs
        int rows;
        int cols;
        char symbol;

        System.out.print("Enter the num of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the num of columns: ");
        cols = scanner.nextInt();

        System.out.print("Enter the symbol: ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}