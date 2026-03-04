/**
 * ============================================================
 *  STUDENT CHALLENGE: Patterns 3
 * ============================================================
 *  Print the following advanced patterns:
 *
 *  Pattern A — Pascal's Triangle (5 rows):
 *        1
 *       1 1
 *      1 2 1
 *     1 3 3 1
 *    1 4 6 4 1
 *
 *  Pattern B — Floyd's Triangle:
 *    1
 *    2  3
 *    4  5  6
 *    7  8  9  10
 *
 *  Pattern C — Butterfly Pattern:
 *    *       *
 *    * *   * *
 *    * * * * *
 *    * * * * *
 *    * *   * *
 *    *       *
 * ============================================================
 */
public class Patterns3 {

    public static void main(String[] args) {
        int n = 5;

        // --- Pattern A: Pascal's Triangle ---
        System.out.println("=== Pattern A: Pascal's Triangle ===");
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i; s++) System.out.print(" ");
            long coeff = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(coeff + " ");
                coeff = coeff * (i - j) / (j + 1);
            }
            System.out.println();
        }

        // --- Pattern B: Floyd's Triangle ---
        System.out.println("\n=== Pattern B: Floyd's Triangle ===");
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-4d", num++);
            }
            System.out.println();
        }

        // --- Pattern C: Butterfly ---
        System.out.println("\n=== Pattern C: Butterfly ===");
        // upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int s = 1; s <= 2 * (n - i); s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        // lower half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int s = 1; s <= 2 * (n - i); s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
