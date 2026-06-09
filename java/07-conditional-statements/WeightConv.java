import java.util.Scanner;

public class WeightConv {
    public static void main(String [] args){

        //Practicing if statements

        //Declare variables

        Scanner input = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        //Welcome message
        System.out.println("===Weight Conversation Program===");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        //Input user choice
        System.out.print("Choose an option: ");
        choice = input.nextInt();

        // Options 1 and 2
        if (choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = input.nextDouble();
            newWeight = weight * 0.43592;
            System.out.printf("Your weight in kgs is: %.2f ", newWeight);
        }
        else if (choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = input.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Your weight in kgs is: %.2f ", newWeight);
        }
        else {
            System.out.println("Subscribe to Virgin Active 😭");
        }
    }
    
}