package TestPackage;

import DemoPackage.DemoAccessModifiers;
import DemoPackage.DemoAccessModifiers2;

// NOT a subclass, just a plain class in a different package
public class TestAccess {
    public static void main(String[] args) {
        DemoAccessModifiers obj = new DemoAccessModifiers();
        DemoAccessModifiers2 obj2 = new DemoAccessModifiers2();

        // System.out.println(obj.a); // Compile error: 'a' has default access, not visible outside DemoPackage
        // System.out.println(obj.b); // Compile error: 'b' is private, only visible inside DemoAccessModifiers
        // System.out.println(obj.c); // Compile error: 'c' is protected — TestAccess isn't a subclass, so no access

        System.out.println(obj.d);   // Works fine — 'd' is public
        obj.display();               // Works fine — display() is public method

        obj2.show();   // Works: show() itself is public, even though it uses
        // protected/default fields internally
    }
}