/*
Switch Cases


int day = 1;
this states where the switch cases directed/starts at

switch(day)
case 1: sout("Mon");
break;
case 2: sout("Tue");
break;
case 3: sout("Wed");
break;
default: sout("Invalid day");
break;


- break is written after each and every case
- it works depending on the value of the variable/expression
- if you dont give break, it prints all the cases until it finds a BREAK STATEMENT
- switch cases takes int, short, char, byte, char and string
- Useful when working on manual driven programmes
- They like buttons easier to use and not heavy
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
        Enhance switch = A replacement to many else if statement
        -> do this

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the day you prefer: ");
        String day = scan.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It is a weekday");
            case "Saturday", "Sunday" ->
                    System.out.println("It is the weekend");
            default -> System.out.println(day + " it isn't a day");
        }
        */

        //Calculator
        Scanner cal = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        num1 = cal.nextDouble();

        System.out.print("Enter an operator (+, -, */, ^): ");
        operator = cal.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = cal.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println(" \"Cannot divide by zero 🤢\" ");
                    validOperation = false;
                }else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator");
                validOperation = false;
            }

        }
        if(validOperation){
            System.out.println(result);
        }

        cal.close();
    }
}




