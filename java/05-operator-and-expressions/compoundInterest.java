import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.println("Enter the principal amount: ");
        principal = input.nextDouble();

        System.out.println("Enter the rate in %: ");
        rate = input.nextDouble() / 100; //dividing to get round number

        System.out.println("Enter # compounded per year: ");
        timesCompound = input.nextInt();

        System.out.println("Enter the number of years: ");
        years = input.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompound, timesCompound * years);

        System.out.printf("The amount %.2f requested is: R %.2f in the next %d years", principal, amount, years);


        input.close();
    }

}