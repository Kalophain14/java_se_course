public class ParameterPassingInJava {

    /*Primitive passing by value
    * int, double, boolean, short
    * copies the actual value into the method parameters
    * */
    static int add(int x, int y) {
        int z;
        z = x + y;
        return z;
    }

    /*String/Objects Method - passing by object referencing
    * When you pass a String or any Object
    * Java passes memory address aka reference of the object
    * */
    static String welcome(String n) {
        return "Welcome Mr/Miss " + n;
    }
    public static void main(String[] args) {

        /*Primitive Method Calling*/
        int a = 20, b = 50, c;
        c = add(a, b);
        System.out.println(c); // prints 15

        /*String Passing Calling*/
        String name = "Victor";
        String message = welcome(name);
        System.out.println(message); // prints Welcome Mr/Miss Victor
    }
}