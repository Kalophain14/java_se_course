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
            num[i-1] = num[i]; //shifting each element
        }
        num[num.length -1] = temp; //storing the array from the last index rotation completed

        //printing the array after the rotation completed
        for (int x: num)
            System.out.print(x+ ",");
        System.out.println("");
    }
}