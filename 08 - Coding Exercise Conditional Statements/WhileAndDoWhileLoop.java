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
    }
}
