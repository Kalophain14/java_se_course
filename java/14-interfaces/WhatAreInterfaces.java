package WhatAreInterfaces;

/*
Interface is used to achieve only Polymorphism
Interface is a collection of Abstract class
Interface can also implement from public classes
Interfaces are abstract, you can't create an object of the reference
You can only create the reference of the interface class
The subclasses don't extend rather implements to the superClass

Rules:
You can't make the method final/private abstract
an identifier must be in uppercase int X = 10 (static + final)
Methods are abstract no bodies
They can have a method that is static and has a body
An interface can extends from another Interface
You can have a default method, this helps to modify the interface without disturbing the classes written

interface SuperTest1 {
    final static int X = 10
    void meth1();
    void meth2();
    public static void meth3(){
    System.out.println("Meth3 interface);
    }
}
*/

interface SuperTest1{
    final static int X = 10;
    void meth1();
    void meth2();
    public static void meth3(){
        System.out.println("Meth3 SuperTest1");
    }
}

class SubTest2 implements SuperTest1{
    public void meth1(){
        System.out.println("meth1 Override");
    }
    public void meth2(){
        System.out.println("meth2 Override");
    }
    public void meth3(){
        System.out.println("New Method from SubClass");
    }
}

public class WhatAreInterfaces {
    public static void main(String[] args) {
        // Cant call 3rd method as you are using the reference of superclass
        System.out.println("==Reference Superclass & Object Subclass==");
        SuperTest1 test1 = new SubTest2();
        test1.meth1();
        test1.meth2();
        System.out.println();

        // Reference and Object same class
        System.out.println("==Reference and Object Subclass==");
        SubTest2 test2 = new SubTest2();
        test2.meth1();
        test2.meth2();
        test2.meth3();
        System.out.println(SuperTest1.X);
        SuperTest1.meth3();
    }
}
