import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] fruits = {"Burger", "Pizza", "Kota", "Orange"};
        boolean isFound = false;
        String target;

        System.out.print("Enter your favourite fruit: "); //User input
        target = sc.nextLine();

        for (int i = 0; i < fruits.length; i++){
            if (fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("Element not found in the array");
        }

        sc.close();
    }
}