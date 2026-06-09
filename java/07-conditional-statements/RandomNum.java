import java.util.Random;
import java.util.Scanner;

public class RandomNum {

    public static void main(String[] args) {
        
        Random random = new Random();
        
        int num;
        num = random.nextInt(1, 6);
        //inputting random numbers the last number 6 doesn't get included
        System.out.println(num);

        boolean isHeads;
        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("The coinflipped is HEADS");
        } else {
            System.out.println("The coinflipped is TAIL");
        }
        
        //Math Classes

        System.out.println("This is a Pie: " + Math.PI);

        double result;
        double num2;
        num2 = Math.pow(2, 5); //power/exponents
        //result = Math.abs(-5); //changes - to + num
        //result = Math.sqrt(9); //sqaureroot
        //result = Math.round(3.14); //round a number to the nearest whole integer 3.0
        //result = Math.ceil(3.14); //round up 4.0
        //result = Math.floor(3.99 ); //round down 3.0
        //result = Math.max(10, 3); //maximum number
        result = Math.min(20, 100); //minimum number

        System.out.println("Power of num is: " + num2);
        System.out.println("Math: " + result);

        //Exercise1
        // Hypotenuse c  = Math.sqrt(a^2 + b^2)

        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the len of side A: ");
        a = input.nextDouble();

        System.out.print("Enter the len of side B: ");
        b = input.nextDouble();
        
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The Hypotenus is: " + c + "cm");
        
        input.close();
    }
}
