package DemoPackage;

public class DemoAccessModifiers {
    int a = 10;              // default
    private int b = 20;      // private
    protected int c = 30;    // protected
    public int d = 40;       // public

    public void display() {
        System.out.println("Sum of all num is: " + (a + b + c + d));
    }
}