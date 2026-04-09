/*

Arrays

What is an array = a collection of similar data elements int, double, etc
- You cant store different data types in array for example x = [2, 4, 4, 6, 10]
- any array has a length of an array

 */

import java.util.Scanner;

public class OneDimensionalArrays {

    public static void main(String[] args) {

        // Ways to declare an array

        // reference   object created in heap
        int num[] = new int[5]; //creating an empty array without knowing the values
        //storing data in the array per index
        num[0] = 2;
        num[1] = 4;
        num[2] = 6;
        num[3] = 8;
        num[4] = 10;

        int numA[] = {40, 20, 60, 8, 10}; //creating an array knowing the values

        int numB[]; //declare a reference
        numB = new int[10]; //creating an object after


        // Challenges

        //Length of an Array forward and backward
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }

        //using for each loop easiest way to access the array
        // using a for each loop only in forward directions
        for(int x: numA){
            System.out.println(x);
        }

        //reverse
        for(int a = num.length -1; a>=0; a--){
            System.out.println(num[a]);
        }
    }
}
