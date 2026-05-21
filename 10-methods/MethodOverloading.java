public class MethodOverloading {

    //Methodoverloading
    static int max(int x, int y) {
        return x > y ? x : y;
    }

    static float max(float x, float y) {
        return x > y ? x : y;
    }

    static int max(int x, int y, int z) {
        return x > y ? (x > z ? x : z) : (y > z ? y : z);
    }

    //doubleOverload
    static double add(double a, double b) {
        return a + b;
    }
    static double add(double a, double b, double c) {
        return a + b + c;
    }

    //StringOverload
    static String bakePizza(String bread){
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese){
        return bread + cheese + " cheese";
    }

    public static void main(String[] args) {
        /*
         MethodOverloading
         - Methods that share the same name
         - with different parameters
         - signature = name + parameters
         - You can have as many as parameters as you want
         */

            System.out.println(max(39, 55, 89));
            System.out.println(add(5, 5, 100));
            System.out.println(bakePizza("Italian"));
            System.out.println(bakePizza("Italian Bread" + " " + "Mozzarella"));
    }
}