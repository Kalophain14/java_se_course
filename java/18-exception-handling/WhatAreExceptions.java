/*
What Are Exceptions??

Syntax Errors =
int x, y;
x = 10 -> no semicolon (;)
Z = x + y; -> Z isn't initialized.

Logical Errors =
int A[] = new int[5];
for(int i = 0; i<A.length; i++)
{
    A[i] = -1;
    System.out.println(A[i]);
}

Runtime Errors = Users often make errors and encounter an exception
Syntax & Logical Errors = are always faced by the programmers
Runtime Errors = are always faced by the users aka Exceptions
*/

public class WhatAreExceptions {

    public static void main(String[] args) {

        int A[] = new int[5];
        for (int i = 0; i < A.length; i++) {
            A[i] = i * 10;
            System.out.println(A[i]);
        }

        // ---- Example 1: Exception WITHOUT handling ----
        // Uncommenting the line below crashes the program at runtime,
        // even though the code is syntactically and logically correct.
        // System.out.println(A[10]); // ArrayIndexOutOfBoundsException

        // ---- Example 2: Exception WITH handling (try-catch) ----
        try {
            System.out.println("Trying to access A[10]...");
            System.out.println(A[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This runs whether or not an exception occurred.");
        }

        // ---- Example 3: Another common runtime exception ----
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        System.out.println("Program continues running normally after handled exceptions.");
    }
}