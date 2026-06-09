public class Printf {
    public static void main(String[] args) {
        /* 
        printf() = is a method used to format an output
        
        % = flags
        width = 1, 2 etc
        .precision = its the limitation of a digit after the .3f
        specifier-character = f(float), d(integer), s(string) d(double), c(char), b(boolean) etc 
        */

        String name = "James";
        char firstLetter = 'J';
        int age = 30;
        double height = 67.2;
        boolean isEmployed = true;

        System.out.println("====Specifiers====");
        //specifiers
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You're height is %f\n", height);
        System.out.printf("Are you employed? : %b\n ", isEmployed);

        System.out.printf("%s is %d years old", name, age);
        System.out.println(); //newline

        System.out.println("====.precision & Flags====");
        //[.precision] = limitation of digit
        /* [Flags] = adding
        + = output a plus on the number
        , = common grouping separators
        ( = negative number are enclosed () shows a negative number
        space = display a minus if negative, space if positive

        */
        double price1 = 33.42;
        double price2 = 20.22;
        double price3 = -10.32;

        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);

        System.out.println("====Width====");
        /* [Width]
        0 = zero padding
        +num = right shift
        -num = left shift
        */

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 789;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%04d\n", id4);

    }
}