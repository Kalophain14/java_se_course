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
        /* int rows = 5;
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
        }*/

        int n = 5;

        // Top half (including middle)
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (j <= n - i)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            for (int j = 1; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = 1; i < n; i++)
        {
            for (int j = 1; j <= i; j++) //spaces increases as i grows
            {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++)
            {
                System.out.print("* ");
            }
            for (int j = 1; j < n - i; j++) //stars decreases each row
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}