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
        int age;

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter your age");
        age = input2.nextInt();

        if (age >= 14 && age <= 55){
            System.out.println("Not young");
        } else if (age < 30){
            System.out.println("Young");
        }

        //grades for given marks
        int marks;

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter your marks");
        marks = input3.nextInt();

        if (marks >= 50){
            System.out.println("Excellent");
        } else if (marks >= 50){
            System.out.println("Good");
        } else  {
            System.out.println("Failed");
        }
    }
}

