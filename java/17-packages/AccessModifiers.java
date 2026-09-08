/**
 * ============================================================
 *                  JAVA ACCESS MODIFIERS — NOTES
 * ============================================================
 *
 * A CLASS CAN CONTAIN:
 *   - Variables
 *   - Methods / Interfaces
 *   - Inner Classes
 *
 * ------------------------------------------------------------
 * WHAT ACCESS MODIFIERS ARE
 * ------------------------------------------------------------
 * Java has four access modifiers that control visibility of
 * classes, methods, and variables:
 *
 *   public     -> accessible from anywhere
 *   protected  -> accessible within the same package,
 *                 plus subclasses (even in other packages)
 *   (default)  -> accessible only within the same package
 *                 (no modifier keyword used)
 *   private    -> accessible only within the same class
 *
 * ------------------------------------------------------------
 * VISIBILITY TABLE
 * ------------------------------------------------------------
 * Modifier     | Class | Package | Subclass(diff pkg) | World
 * ------------------------------------------------------------
 * private      |  Yes  |   No    |        No           |  No
 * (default)    |  Yes  |   Yes   |        No           |  No
 * protected    |  Yes  |   Yes   |        Yes          |  No
 * public       |  Yes  |   Yes   |        Yes          |  Yes
 * ------------------------------------------------------------
 *
 * QUICK RECAP:
 *   private   -> only inside the same class
 *   (default) -> same class + same package (no keyword needed)
 *   protected -> same class + package + subclasses anywhere
 *   public    -> accessible from everywhere
 *
 * RULE OF THUMB: start with 'private', widen only when needed.
 *
 * ------------------------------------------------------------
 * HOW ACCESS IS GIVEN (GUIDELINES)
 * ------------------------------------------------------------
 *   Fields       -> almost always private. Expose via getters/setters.
 *   Methods      -> public for the class's real API;
 *                   private for internal helper logic;
 *                   protected if subclasses need to override/use it.
 *   Constructors -> private is a common trick to force object
 *                   creation through a factory method.
 *   Classes      -> public if other packages need to use it;
 *                   default if only used internally within the package.
 *
 * ------------------------------------------------------------
 * NOTE ON THIS FILE
 * ------------------------------------------------------------
 * Only ONE top-level class per .java file can be public, and it
 * MUST match the filename. So here, "AccessModifiers" is the
 * public class with main(), and every other class below is
 * default (package-private) just so this all compiles together.
 * In real projects each of these would live in its own file.
 * ============================================================
 */


// ------------------------------------------------------------
// EXAMPLE 1: Access modifiers inside a class (encapsulation)
// ------------------------------------------------------------
class BankAccount {
    private double balance;        // only this class can touch it directly
    protected String accountType;  // this class, package, and subclasses
    String bankName;               // default: this class and package only
    public String accountId;       // anyone, anywhere

    private void logTransaction() {
        // internal helper, hidden from outside code
        System.out.println("Transaction logged.");
    }

    // Method exposed API
    public void deposit(double amt) {
        balance += amt;
        logTransaction(); // Access
    }

    // Getter Accessing to the Variable
    public double getBalance() {
        return balance;
    }
}
// Idea: encapsulation — keep internal details (balance) private,
// expose only what other code needs (deposit()).
// This protects the object's state from being changed carelessly.


// ------------------------------------------------------------
// EXAMPLE 2: private field + public getter (safe read access)
// ------------------------------------------------------------
class Person {
    private String name; // hidden from outside

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter as a controlled access point
    public String getName() {
        return name;
    }
}


// ------------------------------------------------------------
// EXAMPLE 3: protected access + inheritance
// ------------------------------------------------------------
class Animal {
    protected String sound = "generic sound";

    protected void makeSound() {
        System.out.println("Animal makes: " + sound);
    }
}

class Dog extends Animal {
    public void bark() {
        sound = "Woof";    // OK: protected, accessed via inheritance
        makeSound();
    }
}


// ------------------------------------------------------------
// EXAMPLE 4: default (package-private) access
// ------------------------------------------------------------
class MathHelper {
    // default access: only visible within this package
    static int square(int x) {
        return x * x;
    }
}

class Calculator {
    public int calcSquare(int x) {
        return MathHelper.square(x); // OK, same package
    }
}


// ------------------------------------------------------------
// EXAMPLE 5: private constructor + factory method
// ------------------------------------------------------------
class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor stops "new Singleton()" from outside
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}


// ------------------------------------------------------------
// MAIN CLASS
// ------------------------------------------------------------
public class AccessModifiers {
    public static void main(String[] args) {

        // Example 1: encapsulation
        BankAccount acc = new BankAccount();
        acc.deposit(100.0);
        System.out.println("Balance: " + acc.getBalance());
        // acc.balance = 500; // Compile error: balance is private

        // Example 2: private field via getter
        Person p = new Person("Alice");
        System.out.println("Name: " + p.getName());
        // System.out.println(p.name); // Compile error: name is private

        // Example 3: protected + inheritance
        Dog d = new Dog();
        d.bark();

        // Example 4: default access
        Calculator c = new Calculator();
        System.out.println("Square: " + c.calcSquare(5));
        // MathHelper is only usable here because we're in the same package

        // Example 5: private constructor / singleton
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("Same instance? " + (s1 == s2));
        // Singleton s3 = new Singleton(); // Compile error: constructor is private
    }
}