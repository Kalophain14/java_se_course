public class StudentChallengeMatrix {

    public static void main(String[] args)
    {

        System.out.println("===Adding 2D Matrix===");

        int[][] A = {{3,5,9},{7,6,2},{4,3,5}};
        int[][] B = {{1,5,2},{6,8,4},{3,9,7}};

        int[][] C = new int[3][3];

        for(int i = 0; i< A.length; i++)
        {
            for (int j = 0; j < A[0].length; j++)
            {//Adding
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for(int[] add :C)
        {
            for(int result:add)
            {
                System.out.print(result+" ");
            }
            System.out.println();
        }

        System.out.println("===Multiplying 2D Matrix===");

        int[][] D = {{3,5,9},{7,6,2},{4,3,5}};
        int[][] E = {{1,0,0},{0,1,0},{0,0,1}};

        int[][] F = new int[3][3];

        for(int i = 0; i< D.length; i++)
        {
            for (int j = 0; j < D[0].length; j++)
            {//Multiplying
                F[i][j] = D[i][j]*C[i][j];
            }
        }

        for(int[] multi : D){
            for(int result2: multi){
                System.out.print(result2 + " ");
            }
            System.out.println();
        }

        System.out.println("===Sorting Array Of Strings===");

        String[] arr ={"java", "python", "pascal", "smalltalk","ada","basic"};

        java.util.Arrays.sort(arr);

        for(String x:arr)
            System.out.println(x);
    }
}