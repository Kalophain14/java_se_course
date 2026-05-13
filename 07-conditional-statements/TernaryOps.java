import java.util.Scanner;

public class TernaryOps {
    public static void main(String[] args) {
        /*
        Ternary Operator ? = Return 1 of 2 values if a condition is true

        ==FORMULA==
        Variable = (condition) ? ifTrueValue : ifFalseValue;

        if (score >= 90) {
            System.out.println("You passed");
        } else  {
            System.out.println("You failed");
        }*/

        //Ternary Operator
        int score = 70;
        String passOrPassed = (score >= 80) ? "Pass" : "Fail";
        System.out.println("You have managed to " + passOrPassed + " you're exam.");


        int age;

        System.out.println("Enter your age: ");
        Scanner input = new Scanner(System.in);
        age = input.nextInt();

        String oldOrYoung = (age <= 13 || age >= 21 ) ? "Adult": "Teenager";
        System.out.println("You are " + oldOrYoung);

        input.close();

        System.out.println("==================End===================");
    }
}