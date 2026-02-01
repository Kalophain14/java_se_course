/* ReadingFromKeyboard
Class Scanner
Int = nextInt(); = reads an interger
Float = nextFloat(); = reads floats
Double = nextDouble(); = reads double
Line = nextLine(); = reads a sentence
Next = next(); = reads a word (james)
Byte = nextByte(); = reads byte
Line = nextShort(); = reads short
Line = nextLong(); = reads long numbers
Line = nextBoolean(); = reads whether its true or false

Line = hasNextFloat(); = confirms whether the next value is float or not
Line = hasnextInt(); = confirms whether the next value is int or not
*/

import java.util.Scanner;

/*public class Reading{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println(sum);
            }
}*/

public class Scanning {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        //String conc = name1 + " " + name2;

        System.out.println(name1 + " " + name2 + " ");
    }
}