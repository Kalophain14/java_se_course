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


        //02 - Searching through an element

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your key");

        int key = sc.nextInt();


        for(int a = 0; a < num.length; a++) {
            if(num[a] == key){
                System.out.println(a);
                System.exit(0); //exiting the task after a key is found
            }
        }
        System.out.println("Not found");
    }
}
