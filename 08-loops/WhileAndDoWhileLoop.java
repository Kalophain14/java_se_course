import java.util.Scanner;

/**
 * ============================================================
 *  TOPIC: while Loop  vs  do-while Loop
 * ============================================================
 *
 *  WHILE LOOP                        DO-WHILE LOOP
 *  (condition checked FIRST)         (body runs FIRST, then check)
 *
 *        ┌──────────┐                      ┌──────────┐
 *        │  START   │                      │  START   │
 *        └────┬─────┘                      └────┬─────┘
 *             │                                 │
 *        ┌────▼─────┐                      ┌────▼─────┐
 *   ┌───►│condition?│                      │ Process  │◄──┐
 *   │    └──┬────┬──┘                      └────┬─────┘   │
 *   │     f │  t │                              │         │
 *   │       │ ┌──▼──────┐                  ┌────▼─────┐   │
 *   │       │ │ Process │──────────────────►│condition?│   │
 *   │       │ └─────────┘                  └──┬────┬──┘   │
 *   └───────┘                               f │  t │      │
 *        ┌──▼──────┐                          │    └───────┘
 *        │   END   │                      ┌───▼──┐
 *        └─────────┘                      │  END │
 *                                         └──────┘
 *
 *  SYNTAX:
 *    while (condition) {        do {
 *        // statements              // statements  ← runs at least once
 *    }                          } while (condition);
 *
 *  KEY DIFFERENCE:
 *  while    → condition checked first → body may run 0 or more times
 *  do-while → body runs first at least once → then condition decides if it continues (e.g. food menu)
 * ============================================================
 */
public class WhileAndDoWhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // EXERCISE 1 | While Loop – Name Validation
        System.out.println("\n[ Exercise 1: While Loop – Name Validation ]");
        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Your name is: " + name);


        // EXERCISE 2 | While Loop – Quit Game
        System.out.println("\n[ Exercise 2: While Loop – Quit Game ]");
        String response = "";

        while (!response.equals("Q")) {
            System.out.println("You are playing a game.");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }
        scanner.nextLine(); // consume leftover newline after next()
        System.out.println("You have quit the game: " + response);


        // EXERCISE 3 | While Loop – Age Validation
        System.out.println("\n[ Exercise 3: While Loop – Age Validation ]");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        while (age < 0) {
            System.out.println("Age cannot be negative.");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }
        System.out.println("You are " + age + " years old.");


        // EXERCISE 4 | Do-While Loop – Age Validation
        System.out.println("\n[ Exercise 4: Do-While Loop – Age Validation ]");
        int ageVal;

        do {
            System.out.print("Enter your age: ");
            ageVal = scanner.nextInt();
            if (ageVal < 0) System.out.println("Age cannot be negative.");
        } while (ageVal < 0);

        System.out.println("You are " + ageVal + " years old.");


        // EXERCISE 5 | While Loop – Pick a Number (1–10)
        System.out.println("\n[ Exercise 5: While Loop – Pick a Number (1–10) ]");
        int number = 0;

        while (number < 1 || number > 10) {
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
        }
        System.out.println("You picked: " + number);

        scanner.close();
    }
}