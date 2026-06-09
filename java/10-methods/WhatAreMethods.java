/*
What Are Methods?
- They are like functions
- They are members of a class that gives functionality to the class e.g
length(), indexOf(), equals(), Substring()
- They can also return a void, integer, string etc
- Methods are unfamiliar with variables called on another methods
- You can always use arguements to pass
- Three types of Methods
Methods that only prints
Methods that uses arguements and prints
Methods that takes input and return a value which will be stored for a print out

Skeleton of a method
returnType methodName (Parameters List){
      //Signature of a method
      //return something
}
*/


import java.util.Scanner;

public class WhatAreMethods {
    //Calling the Method
    public static void main(String[] args) {
        System.out.println("===Method Calling===");

        //Methods that prints Call
        happyBirthday();

        //Methods input Print Call
        int age =  30;
        String name = "Khensani";
        birthdayGirl(name, age);

        //Methods takes input and return value stored
        int a = 150; int b = 200;
        System.out.println("Maximum Number is " + maximum(a,b));

        //GettingFulName
        String fullName = getFullName("Khensani", "Simelani");
        System.out.println(fullName);

        //AgeMethod Call
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if(ageCheck(age)){
            System.out.println("You can enter groove");
        } else  {
            System.out.println("You are young go home to your family");
        }
    }

    /*
    Definition of a Method
    Formal parameters only change but they dont affect actual parameters
    */
    //Method that only prints
    static void happyBirthday(){
        System.out.println("Happy Birthday");
    }

    //Methods that takes input and print value
    static void birthdayGirl(String name, int age){
        System.out.printf("Happy Birthday %s you are now %d years old\n", name, age);
    }

    //Methods that takes input as arguments and return value + value to be stored
    static int maximum(int x, int y)
    {
        if (x > y)
            return x;
        else
            return y;
    }

    static String getFullName(String first, String last){
        return first + " " + last;
    }

    static boolean ageCheck(int age){
        if (age > 21 && age < 50)
            return true;
        else
            return false;
    }
}
