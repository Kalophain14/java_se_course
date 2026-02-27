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
    }
}
