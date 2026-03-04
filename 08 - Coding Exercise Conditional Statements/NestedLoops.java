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
    }
}
