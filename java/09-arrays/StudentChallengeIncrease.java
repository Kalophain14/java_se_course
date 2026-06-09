import java.util.Arrays;

public class StudentChallengeIncrease {

    public static void main(String[] args) {


        // Copying an array
        System.out.println("=== Copying an Arrayy ===");
        int copyA[] = {8, 6, 10, 9, 2, 15, 7, 13, 14, 11};
        int copyB[] = new int[10];

        System.out.print("Before: ");
        for (int x :copyA)
            System.out.print(x + ",");
        System.out.println("");

        for(int i = 0; i<copyA.length; i++ ){
            copyB[i] = copyA[i];
        }

        //copyB = Arrays.copyOf(copyA, copyA.length); //easy way to do it

        System.out.print("After:  ");
        for (int x : copyB)
            System.out.print(x + ",");
        System.out.println("");

        //Reversing an array
        int RevA[] = {2, 4, 6, 8, 10};
        int RevB[] = new int[5];

        System.out.println("=== Reversing an Arrayy ===");
        System.out.print("Before: ");
        for (int x :RevA)
            System.out.print(x + ",");
        System.out.println("");

        for(int i = 0; i<RevA.length; i++ ){
            RevB[i] = RevA[RevA.length - i -1];
        }

        System.out.print("After:  ");
        for (int x : RevB)
            System.out.print(x + ",");
        System.out.println("");

        //Increasing an array
        System.out.println("=== Increasing an Arrayy ===");
        int BiggerA[] = {10, 20, 30, 40, 50};
        int BiggerB[] = new int[10];

        System.out.print("Before: ");
        for (int x :BiggerA)
            System.out.print(x + ",");
        System.out.println("");

        for(int i = 0; i < BiggerA.length; i++){
            BiggerB[i] = BiggerA[i];
        }
        //BiggerB = Arrays.copyOf(BiggerA, 8); // Easy way to do it

        System.out.print("After: ");
        for (int x :BiggerB)
            System.out.print(x + ",");
        System.out.println("");
    }
}
