import java.lang.*;
import java.util.*;

class ReadKeyboard {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        /*int a,b;
        System.out.println("Enter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();

        Int c = a-b;
        System.out.println("Sum is "+ c);*/


        sc.useRadix(2);
        int a = sc.nextInt();

        System.out.println(a);
    }
}

