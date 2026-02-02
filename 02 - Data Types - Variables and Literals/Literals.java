/*
Java literals are fixed values that you write directly in your code.
They represent constant data that doesn’t change during program execution.
Here are the main types:

Numeric literals - Numbers you write directly,
like 42 (integer),
3.14 (double),
100L (long), or
2.5f (float)

Character literals - Single characters in single quotes,
like 'A' or '7'

String literals - Text in double quotes, like "Hello World"
Boolean literals - Just true or false
Null literal - The keyword null, representing no value
*/

/*
integer literals have various number system
10 Decimal = 0 1 2 3 4 5 6 7 8 9 (a number is formed by using no 1 - 9 cant exceed)
2 Binary = 0 1 (number formed used 0 & 1)
8 Octal = 0 1 2 3 4 5 6 7 (a number is formed by using no 1 - 7 cant exceed)
16 Hexadecimal = 0 1 2 3 4 5 6 7 8 9 A B C D E F (a number is formed by using no 1 - 9 & A - F cant exceed)

 byte b = 10; decimal
 byte b = 0b1010; binary
 byte b 012; octal
 byte b = 0xA (10) hexadecimal

 */

public class Literals
{
    public static void main(String[] args)
    {
        byte b1 = 10; //decimal
        byte b2 = 0b1010; //binary
        byte b3 = 012; //octal
        byte b4 = 0xA; //hexadecimal

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        //System.out.println("baby" false);

        long l = 128_828_282_823L; //long
        float f = 12_34_53.6F; //float
        double d = 1.2356D; //double


        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        //System.out.println(e);
    }
}
