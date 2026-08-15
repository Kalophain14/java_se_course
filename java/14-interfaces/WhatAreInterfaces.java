package WhatAreInterfaces;

/*
Interface is used to achieve only Polymorphism
Interfaces are abstract, you can't create an object of the reference
You can only create the reference of the interface class
The subclasses don't extend rather implements to the superClass
 */

interface SuperTest1{
    void meth1();
    void meth2();
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
    }
}
