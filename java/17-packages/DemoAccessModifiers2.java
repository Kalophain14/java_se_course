package DemoPackage;

public class DemoAccessModifiers2 {

    DemoPackage.DemoAccessModifiers e = new DemoPackage.DemoAccessModifiers();

    public void show() {
        System.out.println("Showing DemoAccessModifiers2..." + (e.a + e.c + e.d));
        // System.out.println(e.b); // Compile error: 'b' is private to DemoAccessModifiers,
        //                             not accessible even from same-package classes
    }
}