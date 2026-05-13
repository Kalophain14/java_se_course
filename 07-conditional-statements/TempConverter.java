import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        System.out.println("===Temperature Converter===");

        Scanner input = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperature: ");
        temp = input.nextDouble();

        System.out.println("Convert to Celsius or Fahrenheit? (C or F) :");
        unit = input.next().toUpperCase();

        //Check Conditions for the temperature
        newTemp = (unit.equals("C")) ? (temp -32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.println("The temperature is " + newTemp);

        input.close();
    }

}