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

        int A[][] = {{1,2,3,4},{5,6,7,8},{2,6,8,10}};

        //Accessing the 2D Array

        //rows
        for(int i = 0; i<A.length; i++)
        {
            //column
            for(int j = 0; j<A[0].length; j++)
            {
                System.out.print(A[0][j]);
            }
            System.out.println("\n");
        }
    }
}
