/**
 * ============================================================
 *  STUDENT CHALLENGE: Patterns 2
 * ============================================================
 *  Print the following patterns using nested loops:
 *
 *  Pattern A — Pyramid (centred):
 *          *
 *        * * *
 *      * * * * *
 *    * * * * * * *
 *
 *  Pattern B — Diamond:
 *        *
 *      * * *
 *    * * * * *
 *      * * *
 *        *
 *
 *  Pattern C — Hollow Square:
 *    * * * * *
 *    *       *
 *    *       *
 *    *       *
 *    * * * * *
 * ============================================================
 */
public class Patterns2 {

    public static void main(String[] args) {
        int n = 4;

        System.out.println("=== Pattern A: Pyramid ===");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("* ");
            System.out.println();
        }

        System.out.println("\n=== Pattern B: Diamond ===");
        // upper half
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("* ");
            System.out.println();
        }
        // lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("* ");
            System.out.println();
        }

        System.out.println("\n=== Pattern C: Hollow Square ===");
        int size = 5;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
