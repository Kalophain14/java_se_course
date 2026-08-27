package MyPackage1;

class Demo {
   public void Display(){
       System.out.println("Demo");
   }
}

public class WhatArePackages {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.Display();
    }
}