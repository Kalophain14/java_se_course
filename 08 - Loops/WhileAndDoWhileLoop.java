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
 *  while → condition checked first → body may run 0 or more times
 *  do-while → body runs first at least 1 time → then condition is checked to decide if it continues running (e.g food menu)
 * ============================================================
 */
public class WhileAndDoWhileLoop {

    public static void main(String[] args) {
        int i = 1, n = 100;
        int x = 1, y = 100;

        while (i < 100) {
            System.out.println(i);
            i = i*2;
        }


        System.out.println();
        do {
            System.out.println(x);
            x = x*2;
        } while (x < y);
    }
}
