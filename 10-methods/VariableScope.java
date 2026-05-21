public class VariableScope {

    static int x = 3; //Class Variable

    public static void main(String[] args) {

        /*
        variable scope = where a variable can be accessed
        - Local = They take first precedence which are declared inside the methods
        - Class = lives within the whole class (e.g main class) any method can access it and use it
         */

        int x = 1; //Local Variable
        System.out.println(x);
        test();
    }

    static void test() {
        int x = 2;
        System.out.println(x);
    }
}