/*
String = collection of characters that forms a sentence

*constructors*
String(char [])
String(byte[])
String(String)

String str = "Java Program";
J a v a   P r o g r  a  m  length is 12
0 1 2 3 4 5 6 7 8 9 10 11

String (char [])
char c [] = {'A' 'B' 'C', 'D'};
String str = new String(c);

String(byte [])
byte b [] = {65, 66, 67, 68}
String str2 = new String(b) //referencing the byte and string into str

String(String)
String str = new String("Java");

once you state new String(java):
- Two objects of Java will be created in heap and in pool occupying the spaces, because there is no reference
- Heap it's a copy that gets created when you use new method
- Pool is the original

*String literals* also occupy space sout = "java"; no need to declare the variable

If its already in pool it cant be created twice as it already exists, a copy will made referencing it
 */

public class StringObject {
    public static void main(String[] args) {
        //String(String)
        String str1 = "Java Programming";
        String str2 = new String("java is awesome");
        System.out.println(str2) ;

        //String(char [])
        char c[] = {'H', 'E', 'L', 'L', 'O'};
        String str3 = new String(c);
        System.out.println(str3);

        //String(byte [])
        byte b[] = {65, 66, 67, 68};
        String str4 = new String(b,0,3); //printing in array from index 0 and item 2 ABC
        System.out.println(str4);

        // Boolean True or False
        String str5 = "Java Programming";
        String str6 = new String("Java");
        System.out.println(str5.equals(str6));


    }
}