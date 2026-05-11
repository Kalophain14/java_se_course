import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        // area of a rectangle

        double width = 0.0;
        double height = 0.0;
        double area = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = input.nextDouble();

        System.out.print("Enter width: ");
        width = input.nextDouble();

        area = (width*height)/2;
        System.out.println("The area is: " + area + " cm2");

        input.close();
    }
}