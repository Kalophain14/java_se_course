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

    public static void main(String[] args){
        int rows = 5;
        int[] triangle = new int[rows]; //arrays stores the num from the rows


        for (int i = 0; i < rows; i++) {

            //spaces for the triangle loop
            for (int space = 0; space < rows - i - 1; space++) {
                System.out.print("   ");
            }

            // calculating num of rows walking backwards using the array
            for (int j = i; j > 0; j--) {
                triangle[j] = triangle[j] + triangle[j - 1];
            }

            triangle[0] = 1;

            //print num in rows
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[j] + "   ");
            }

            System.out.println();
        }
    }
}