public class StudentChallengeRotate {

    public static void main(String[] args) {
        // Student Challenge - Rotate

        // 01 - Rotating an Array - Shift to left first index becomes last index
        int num[] = {5, 9, 6, 10, 12, 7, 3, 5, 4, 2};

        //printing all elements of the original array
        for (int x: num)
            System.out.print(x+ ",");
        System.out.println("");

        //left rotate the array by one position
        int temp = num[0]; //stores first index before being overwritten
        for(int i = 1; i < num.length; i++){
            num[i-1] = num[i]; //shifting from left
        }
        num[num.length -1] = temp; //storing the array from the last index rotation completed

        //printing the array after the rotation completed
        for (int x: num)
            System.out.print(x+ ",");
        System.out.println("");

        //-------------------------------

        // 02 - Inserting an element
        //printing all elements of the original array

        int insert[] = new int[10];
        insert[0] = 2;
        insert[1] = 4;
        insert[2] = 6;
        insert[3] = 8;
        insert[4] = 10;
        insert[5] = 12;
        insert[6] = 14;
        insert[7] = 16;
        insert[8] = 18;
        insert[9] = 20;

        //before inserting
        for (int x: insert)
            System.out.print(x+ ",");
        System.out.println("");

        int element = 99; //to be inserted
        int insertIndex = 5; //where the element will go

        for(int i = insert.length - 1; i > insertIndex; i--){
            insert[i] = insert[i - 1]; //shifting from right
        }
        insert[insertIndex] = element; //index freedUp

        //after inserting
        for (int x: insert)
            System.out.print(x+ ",");
        System.out.println(" ");

        //-------------------------------
        // 03 - Deleting an element

        // before deleting
        for (int x: insert)
            System.out.print(x+ ",");
        System.out.println(" ");

        int deleteIndex = 5;

        for(int i = deleteIndex; i < insert.length - 1; i++){
            insert[i] = insert[i + 1]; //shifting left
        }
        insert[insert.length -1] = 0; //stores 0 to the last index deleted

        // after deleting
        for (int x: insert)
            System.out.print(x+ ",");

        //-------------------------------
    }
}