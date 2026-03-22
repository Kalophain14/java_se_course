/**
 * ============================================================
 *  STUDENT CHALLENGE: Patterns 1
 * ============================================================
 *  Print the following patterns using nested loops:
 *
 *  Pattern A — 1 2 3 4:
 *    1 2 3 4
 *    1 2 3 4
 *    1 2 3 4
 *    1 2 3 4
 *
 *  Pattern B —
 *    1 2 3 4 5 6
 *    2 3 4 5 6 7
 *    3 4 5 6 7 8
 *    4 5 6 7 8 9
 *    5 6 7 8 9 10
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

        //Patter A

        for(int i = 1; i <= 5; i++){
             //System.out.print(i + " ");
            for(int j = 1; j <=5-i+1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}