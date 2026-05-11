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

        //int x,y;
        //System.out.println("Enter 2 numbers");
        //x=sc.nextInt();
        //y=sc.nextInt();

        //sc.useRadix(2);
        //int x=sc.nextInt();

        //int sum = x + y;
        //System.out.println("The binary is" + " " + x);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("What is your GPA: ");
        double gpa = Double.parseDouble(sc.nextLine()); // reads as String, parses safely

        System.out.print("Are you a student? (True/False)");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You're GPA score is " + gpa);

        if(isStudent){
            System.out.println("You're a student");
        } else{
            System.out.println("You're not a student");
        }

        sc.close();
    }
}