/*
Format Specifiers

% = %d %s %e %f %
arguments_index = choosing which argument to use first %1d, %4d
flags = -, +, 0, " space", (if there are an empty places give 0) works well with width.
width = printing a number width e.g print int 5 places
precision = 6.2 after 6 places and take 2 digits
conversion:
char = c
int = d, o, x
float = f ,e ,g
String = s

 */


public class Formatted {
    public static void main(String[] args) {

        int x =10;
        float y=123.37f;
        char z = 'a';
        String a = "baby";

        //System.out.printf("%d %f %c %s", x,y,z,a); //conversation
        //System.out.printf("%1$d %2$f %1$d", x,y); //arguments index
        // System.out.printf("%5d", x); //width
        //System.out.printf("%05d", x); //flags - prints 0 if there's an empty spaces 00010
        //System.out.printf("%(5d", x); //bracket flags puts brackets only if number is negative (10)
        //System.out.printf("%6.2f", y); //after 6 places prints 2 digits after the dot./comman,
        System.out.format("%20s",a); //you can use format/printf
    }
}