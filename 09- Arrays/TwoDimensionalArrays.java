public class TwoDimensionalArrays {

    public static void main(String[] args) {
        /*
        Two-Dimensional Arrays
        Its like a matrix

        //Different ways to Initializing a 2D Array
        //Array of 3 rows and 4 elements/column

        * int A[][];
        A = new int[3][4];

        * int A[][] = new int[3][4];
        * int A[][] = {{1,2,3,4},{5,6,7,8},{2,6,8,10}};


        To access the row and column, you need to either of nested for loop and for each
        */

        System.out.println("===Accessing Using For Loop===");

        int A[][] = {{1,2,3,4},{5,6,7,8},{2,6,8,9}};

        //rows
        for(int i = 0; i<A.length; i++)
        {
            //column
            for(int j = 0; j<A[0].length; j++)
            {
                System.out.print(A[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("===Accessing Using For Each===");

        int B[][] = {{4,2,3,1},{1,2,3,5},{3,5,6,8}};

        for (int x[]:B) {
            //column
            for (int y:x) {
                System.out.print(y);
            }
            System.out.print("\n");
        }

        System.out.println("===Jagged Array===");
        //array of arrays where each row can have a different number of columns

        int jagged[][] = {{3,4,9,2},{1,2,},{5,6,8}};

        // Using for-each loop
        for(int[] row : jagged) { //for each row
            for(int value : row) { //for each value in the row
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
