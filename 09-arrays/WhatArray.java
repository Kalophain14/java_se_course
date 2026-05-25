/*


Array = a collection of values of the same data type
 */

import java.util.Arrays;
import java.util.Scanner;

public class WhatArray {
    public static void main(String[] args) {
        /* String[] fruits = {"Apple", "Banana", "Kiwi", "Orange"};

        //fruits [0] = "Pinapple"; //Changing value inside an array
        //int numFruits = fruits.length; //Getting the length
        //Arrays.sort(fruits); //Alphabetically
        //Arrays.fill(fruits, "Apple");

        //System.out.println(fruits[0]);
        //System.out.println(numFruits);

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println();

        //For Each Loop
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
        */

        Scanner sc = new Scanner(System.in);
        String [] foods = new String[3];
        int size;

        System.out.print("What number of food do you want?: ");
        size = sc.nextInt();
        sc.nextLine();

        foods = new String[size]; //User sets number

        for (int i = 0; i < foods.length; i++) {
            System.out.println("Enter your favourite food: ");
            foods[i] = sc.nextLine();
        }

        for (String food : foods) {
            System.out.println(food);
        }
    }
}