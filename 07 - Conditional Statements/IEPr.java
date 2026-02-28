import java.util.Scanner;

public class IEPr {
    public static void main(String[] args)
    {
        /* int a = 5, b = 3, c = 2;

        if(a > b && a > c){
            System.out.println(a);
        } else if (b>c){
            System.out.println(b);
        } else {
            System.out.println(c);
        } */

        //StudentChallenges

        // number is odd or even
        int a;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        a = input.nextInt();

        if( a % 2 == 0 ) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Find person is young or not young
        int age = 18;

        if (age >= 30){
            System.out.println("Not young");
        } else if (age < 30){
            System.out.println("Young");
        }

        //grades for given marks
        int marks = 100;

        if (marks >= 50){
            System.out.println("Excellent");
        } else if (marks < 60){
            System.out.println("Good");
        } else  {
            System.out.println("Failed");
        }
    }
}

