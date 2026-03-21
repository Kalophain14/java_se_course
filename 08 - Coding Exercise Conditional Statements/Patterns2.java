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
public class Patterns2 {

    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            //System.out.print(i + " ");
            for(int j = 1; j <=5-i+1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
