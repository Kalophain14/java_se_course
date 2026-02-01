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

public class Reading{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //float b = sc.nextFloat();
        //String a = sc.next(); == one word
        //String a = sc.nextLine(); == whole sentence

        int x,y;
        System.out.println("Enter 2 numbers");
        x=sc.nextInt();
        y=sc.nextInt();

        int sum = x + y;
        System.out.println("The combination of numbers" + " " + sum);
            }
}