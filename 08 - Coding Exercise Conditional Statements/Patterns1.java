/**
 * ============================================================
 *  STUDENT CHALLENGE: Patterns 1
 * ============================================================
 *  Print the following patterns using nested loops:
 *
 *  Pattern A — Right Triangle (stars grow right):
 *    *
 *    * *
 *    * * *
 *    * * * *
 *    * * * * *
 *
 *  Pattern B — Inverted Right Triangle:
 *    * * * * *
 *    * * * *
 *    * * *
 *    * *
 *    *
 *
 *  Pattern C — Number Triangle:
 *    1
 *    1 2
 *    1 2 3
 *    1 2 3 4
 *    1 2 3 4 5
 * ============================================================
 */
public class Patterns1 {

    public static void main(String[] args) {
        int n = 5;

        System.out.println("=== Pattern A: Right Triangle ===");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }

        System.out.println("\n=== Pattern B: Inverted Right Triangle ===");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }

        System.out.println("\n=== Pattern C: Number Triangle ===");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }
}
