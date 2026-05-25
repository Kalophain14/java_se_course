import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {


         /*for (String fruit : fruits){
            System.out.println(fruit);
        }*/

        Scanner sc = new Scanner(System.in);

        //int [] num = {1, 2, 3, 4, 5, 6, 7};
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