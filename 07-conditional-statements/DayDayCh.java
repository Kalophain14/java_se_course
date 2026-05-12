/* Conditional Statements = They return boolean values TRUE / FALSE

Relational Operation
< Less than
<= Less than and equals to
> Greater than
>= Greater than and equals to
== Equals to
!= Not equals to

Logical Operator
&& = And (Both must be true)
|| = Or (At least one true)
^ = XOR (Only one true)
! = Not (Reverse value) e.g a < b which is true but it becomes false

/*
========================================
        TRUTH TABLE (A, B)
========================================

A       B       A&&B    A||B    !A
-----------------------------------------
true    true    true    true    false
true    false   false   true    false
false   true    false   true    true
false   false   false   false   true

*/

import java.util.Scanner;

public class DayDayCh {

    public static void main(String[] args) {

        boolean[] values = {true, false};

        System.out.println("==============================================");
        System.out.println("A\tB\tA&&B\tA||B\t!A");
        System.out.println("==============================================");

        for (boolean A : values) {
            for (boolean B : values) {

                System.out.println(
                        A + "\t" +
                                B + "\t" +
                                (A && B) + "\t" +
                                (A || B) + "\t" +
                                (!A)
                );
            }
        }

        System.out.println("==============================================");



        //If-Else Statements dived
        Scanner input = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent; //True/False

        System.out.println("Enter your name: ");
        name = input.nextLine();

        System.out.println("Enter your age: ");
        age = input.nextInt();

        System.out.print("Are you a student true/false?: ");
        isStudent = input.nextBoolean();
        
        //Program 1: Name
        if (name.isEmpty()){
            System.out.println("You didnt enter your name");
        } else{
            System.out.println("Hello " + name);
        }

        //Program 2: Age Validation
        if(age >= 65){
            System.out.println("You are a senior.");
        }
        else if(age >= 18){
            System.out.println("You are a teenager.");
        } else if (age < 0) {
            System.out.println("You haven't been born yet!");
        } else if (age == 0) {
            System.out.println("You are a baby.");
        } else {
            System.out.println("You are a child");
        }
        
        //Program 3: Student
        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are a fraud 🤣");
        }

        input.close();
    }
}
