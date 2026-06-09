public class StudentChallengeRotate {

    public static void main(String[] args) {

        // 01 - Rotating an Array
        System.out.println("=== Rotating Elements ===");
        int num[] = {5, 9, 6, 10, 12, 7, 3, 5, 4, 2};

        System.out.print("Before: ");
        for (int x : num)
            System.out.print(x + ",");
        System.out.println("");

        int temp = num[0]; //stores first index before being overwritten
        for (int i = 1; i < num.length; i++) {
            num[i - 1] = num[i]; //shifting from left
        }
        num[num.length - 1] = temp; //storing the array from the last index rotation completed

        System.out.print("After:  ");
        for (int x : num)
            System.out.print(x + ",");
        System.out.println("\n");

        // ------------------------------

        // 02 - Inserting an Element
        System.out.println("=== Inserting Elements ===");
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

        System.out.print("Before: ");
        for (int x : insert)
            System.out.print(x + ",");
        System.out.println("");

        int element = 99; //to be inserted
        int insertIndex = 5; //where the element will go

        for (int i = insert.length - 1; i > insertIndex; i--) {
            insert[i] = insert[i - 1]; //shifting from right
        }
        insert[insertIndex] = element; //index freedUp

        System.out.print("After:  ");
        for (int x : insert)
            System.out.print(x + ",");
        System.out.println("\n");

        // ------------------------------

        // 03 - Deleting an Element
        System.out.println("=== Deleting Elements ===");
        int deleteElement[] = {30, 40, 60, 80, 90, 100};

        System.out.print("Before: ");
        for (int x : deleteElement)
            System.out.print(x + ",");
        System.out.println("");

        int deleteIndex = 5;

        for (int i = deleteIndex; i < deleteElement.length - 1; i++) {
            deleteElement[i] = deleteElement[i + 1]; //shifting left
        }
        deleteElement[deleteElement.length - 1] = 0; //stores 0 to the last index deleted

        System.out.print("After:  ");
        for (int x : deleteElement)
            System.out.print(x + ",");
        System.out.println("\n");

        // ------------------------------

        // 04 - Swapping Elements
        System.out.println("=== Swapping Elements ===");
        int swapElement[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int swap = 2;

        System.out.print("Before: ");
        for (int x :swapElement)
            System.out.print(x + ",");
        System.out.println("");

        if (swapElement[swap] < swapElement[swap + 1]) {
            int store = swapElement[swap]; //save current element
            swapElement[swap] = swapElement[swap + 1]; //put current next to the next position
            swapElement[swap + 1] = store; //saved element next to the neighbor position
        }

        System.out.print("After:  ");
        for (int x : swapElement)
            System.out.print(x + ",");
        System.out.println("");

        //------------------------------------
    }
}