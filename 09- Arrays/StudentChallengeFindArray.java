import java.util.Scanner;

public class StudentChallengeFindArray {

    public static void main(String[] args) {
        //Student Challenges

        //01 - Finding SUM of all elements
        int num[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};

        int sum = 0;

        for(int i = 0; i < num.length; i++) {
            sum = sum + num[i]; //storing the addition data into sum
        }
        System.out.println("sum of all the data is: " + sum);

        //-----------------------------------------//

        /*
        //02 - Searching through an element
        Scanner sc = new Scanner(System.in); //asking user to enter their key
        System.out.println("Enter your key");
        int key = sc.nextInt();

        for(int a = 0; a < num.length; a++) {
            if(num[a] == key){
                System.out.println("Element index found at :" + a);
                System.exit(0); //exiting the task after a key is found
            }
        }
        System.out.println("Not found");
        */

        //----------------------------------------//

        //03 - Finding a maximum element
        int max = num[0]; //starting from 0 index

        for(int x = 0; x < num.length; x++){ //accessing the length of the array
            if(num[x] > max){
                max = num[x]; //stores the maximum num as it iterate through finding the maximum number
            }
        }
        System.out.println("The maximum number is: " + max);

        //----------------------------------------//

        //04 - Finding second-largest element
        int max1, max2;
        max1 = max2 = num[0]; //starting from 0 index

        for(int x = 0; x < num.length; x++){ //accessing the length of the array
            if(num[x] > max1){ //is num bigger than the maximum number?
                max2 = max1; // saves the current max into max2
                max1 = num[x]; //stores the new maxNum as the largest
            } else if (num[x] > max2){
                max2 = num[x]; //not bigger than max1 but is it bigger than max2? and stores the number
            }
        }
        System.out.println("The sec largest number is: " + max2);
    }
}
