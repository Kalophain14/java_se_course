/*
A Class Can have 3 Things:
- Variables
- Method, Interfaces
- Inner Classes

Access Modifiers = Java has four access modifiers that control visibility of
                   classes, methods, and variables:

	•	public – accessible from anywhere
	•	protected – accessible within the same package, plus subclasses (even in other packages)
	•	default (no modifier) – accessible only within the same package
	•	private – accessible only within the same class

 */

class Example {
    public int a;      // accessible everywhere
    protected int b;   // accessible in package + subclasses
    int c;              // default: accessible in package only
    private int d;      // accessible only in this class
}

public class AccessModifiers {

    public static void main(String[] args) {
        // Access Modifiers
    }
}
