import java.util.Scanner;
import java.util.Locale;

public class TempConverter {
    public static void main(String[] args) {
        System.out.println("===Temperature Converter===");

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperature: ");
        temp = input.nextDouble();

        System.out.println("Convert to Celsius or Fahrenheit? (C or F) :");
        unit = input.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("The temperature is %.1f° %s", newTemp, unit);

        input.close();
    }
}