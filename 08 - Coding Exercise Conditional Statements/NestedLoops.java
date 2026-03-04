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
 *    for (int i = 1; i <= rows; i++) {       // outer
 *        for (int j = 1; j <= cols; j++) {   // inner
 *            // body
 *        }
 *    }
 * ============================================================
 */
public class NestedLoops {

    public static void main(String[] args) {

        // --- Rectangle of stars ---
        System.out.println("=== 4x6 Star Rectangle ===");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // --- Multiplication table grid ---
        System.out.println("\n=== Multiplication Table (1-5) ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        // --- Right-angle triangle ---
        System.out.println("\n=== Right-Angle Triangle (5 rows) ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
