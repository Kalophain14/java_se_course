/*
 How to Handle Exceptions

# Java Throwable Types

In Java, all throwable objects fall under `Throwable`,
split into **exceptions** and **errors**.

## Checked Exceptions
- Subclasses of `Exception` (excluding `RuntimeException`)
- Must be declared with `throws` or caught at compile time
- Examples: `IOException`, `SQLException`, `ClassNotFoundException`

## Unchecked Exceptions (Runtime Exceptions)
- Subclasses of `RuntimeException`
- No compile-time requirement to catch/declare
- Examples: `NullPointerException`, `ArrayIndexOutOfBoundsException`,
`ArithmeticException`, `IllegalArgumentException`

## Errors
- Subclasses of `Error`
- Represent serious problems not meant to be caught (JVM/system-level issues)
- Examples: `OutOfMemoryError`, `StackOverflowError`

## Hierarchy

```
Throwable
├── Exception
│   ├── RuntimeException (unchecked)
│   └── other Exception subclasses (checked)
└── Error (unchecked)
```

Try = You try to execute
Catch = Caught an error and notified the user
Finally = Finally displayed

*/

public class HowToHandleExceptions {

    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // Arithmetic Exception 10 / 0= Infinite
            System.out.println("The division num: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage()); // / by zero
        }
    }
}
