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

    //Definition of a Method
    //Formal parameters only change but they dont affect actual parameters
    static int maximum(int x, int y)
    {
        if (x > y)
            return x;
        else
            return y;
    }
    //Calling the Method
    public static void main(String[] args) {

        System.out.println("===Maximum Method===");

        //Option 1
        int a = 20, b = 150, c;
        c = maximum(a,b); //actual parameters
        System.out.println("Max Number:" + c);

        //Option 2
        System.out.println(maximum(a,b));

        //Option 3 Using a constructor as an object
        WhatAreMethods wme = new WhatAreMethods();
        System.out.println(wme.maximum(a,b));

    }
}
