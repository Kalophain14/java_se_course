/**
 * ============================================================
 *  TOPIC: for Loop
 * ============================================================
 *
 *  FLOWCHART:
 *
 *        ┌──────────────┐
 *        │    START     │
 *        └──────┬───────┘
 *               │
 *        ┌──────▼───────┐
 *        │ init (i = 0) │   ← runs ONCE at the beginning
 *        └──────┬───────┘
 *               │
 *        ┌──────▼───────┐
 *   ┌───►│  condition?  │
 *   │    └──┬────────┬──┘
 *   │     f │      t │
 *   │       │   ┌────▼────────┐
 *   │       │   │   Process   │
 *   │       │   └────┬────────┘
 *   │       │        │
 *   │       │   ┌────▼────────┐
 *   └───────────│  update     │   ← e.g. i++
 *           │   └─────────────┘
 *        ┌──▼──────┐
 *        │   END   │
 *        └─────────┘
 *
 *  SYNTAX:
 *    for (initialisation; condition; update) {
 *        // statements
 *    }
 *
 *  USE WHEN: number of iterations is known in advance
 * ============================================================
 */
public class ForLoop {

    public static void main(String[] args) {

        // --- Basic for loop ---
        System.out.println("=== Count 1 to 10 ===");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // --- Count backwards ---
        System.out.println("\n=== Countdown 10 to 1 ===");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // --- Multiplication table ---
        System.out.println("\n=== Table of 7 ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }

        // --- Sum 1 to 100 ---
        System.out.println("\n=== Sum of 1 to 100 ===");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum); // expected 5050
    }
}
