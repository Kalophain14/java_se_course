/*
What Are Methods?
- They are like functions
- They are members of a class that gives functionality to the class e.g
length(), indexOf(), equals(), Substring()
- They can also return a void, integer, string etc

Skeleton of a method
returnType methodName (Parameters List){
      //Signature of a method
      //return something
}
*/


public class WhatAreMethods {

    //Example method that returns a larger num

    //Definition of a Method
    static int maximum(int x, int y)
    {
        if (x > y)
            return x;
        else
            return y;
    }
    //Calling the Method
    public static void main(String[] args) {

        int a = 20, b = 150, c;
        c = maximum(a,b);
        System.out.println(c);
    }
}
