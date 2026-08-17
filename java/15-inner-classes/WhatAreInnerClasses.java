/* What are Inner Classes

- Inner class can access the members of the outer class
- The outer class cannot access the member of the inner class,
-  only way is to use/create an object referencing the inner class to get access

    Different Types of Inner Classes:
    1. NESTED
    2. LOCAL
    3. ANONYMOUS
    4.  STATIC
    */

// NESTED INNER CLASS
class Outer {
    int x = 10;

    //inner class
    class Inner{
        int y = 20;
        void innerdDisplay(){
            System.out.println(x); //10
            System.out.println(y); //20
        }
    }

    // Void method
    void outerDisplay() {
    Inner i = new Inner(); //object of the inner class
    i.innerdDisplay();
    System.out.println(i.y); //20
    }
}

public class WhatAreInnerClasses {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();

        // Access the inner class out of the outer class
        Outer.Inner i = o.new Inner();
        i.innerdDisplay(); // 10 and 20
    }
}
