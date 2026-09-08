package TestPackage;

import DemoPackage.DemoAccessModifiers;

// NOT a subclass, just a plain class in a different package
public class TestAccess {
    public static void main(String[] args) {
        DemoAccessModifiers obj = new DemoAccessModifiers();

        // System.out.println(obj.a); // Compile error: 'a' has default access, not visible outside DemoPackage
        // System.out.println(obj.b); // Compile error: 'b' is private, only visible inside DemoAccessModifiers
        // System.out.println(obj.c); // Compile error: 'c' is protected — TestAccess isn't a subclass, so no access

        System.out.println(obj.d);   // Works fine — 'd' is public
        obj.display();               // Works fine — display() is public method
    }
}