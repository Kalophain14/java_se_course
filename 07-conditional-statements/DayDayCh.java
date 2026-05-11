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
        
        Scanner input = new Scanner(System.in);
        int age;

        System.out.println("Enter your age: ");
        age = input.nextInt();

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

        input.close();
    }
}
