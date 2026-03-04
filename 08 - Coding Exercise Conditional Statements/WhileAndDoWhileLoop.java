/**
 * ============================================================
 *  TOPIC: while Loop  vs  do-while Loop
 * ============================================================
 *
 *  WHILE LOOP                        DO-WHILE LOOP
 *  (condition checked FIRST)         (body runs FIRST, then check)
 *
 *        ┌──────────┐                      ┌──────────┐
 *        │  START   │                      │  START   │
 *        └────┬─────┘                      └────┬─────┘
 *             │                                 │
 *        ┌────▼─────┐                      ┌────▼─────┐
 *   ┌───►│condition?│                      │ Process  │◄──┐
 *   │    └──┬────┬──┘                      └────┬─────┘   │
 *   │     f │  t │                              │         │
 *   │       │ ┌──▼──────┐                  ┌────▼─────┐   │
 *   │       │ │ Process │──────────────────►│condition?│   │
 *   │       │ └─────────┘                  └──┬────┬──┘   │
 *   └───────┘                               f │  t │      │
 *        ┌──▼──────┐                          │    └───────┘
 *        │   END   │                      ┌───▼──┐
 *        └─────────┘                      │  END │
 *                                         └──────┘
 *
 *  SYNTAX:
 *    while (condition) {        do {
 *        // statements              // statements  ← runs at least once
 *    }                          } while (condition);
 *
 *  KEY DIFFERENCE:
 *    while    → 0 or more executions (condition checked before entering)
 *    do-while → 1 or more executions (condition checked after body)
 * ============================================================
 */
public class WhileAndDoWhileLoop {

    public static void main(String[] args) {

        // --- while loop ---
        System.out.println("=== while: print 1 to 5 ===");
        int i = 1;
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        // --- do-while loop ---
        System.out.println("\n=== do-while: print 1 to 5 ===");
        int j = 1;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j <= 5);

        // --- key difference demo ---
        System.out.println("\n=== Difference (condition false from start) ===");
        int x = 10;
        System.out.print("while   → ");
        while (x < 5) { System.out.print("runs "); }
        System.out.println("(never entered)");

        System.out.print("do-while → ");
        do { System.out.print("runs once! "); } while (x < 5);
        System.out.println();
    }
}
