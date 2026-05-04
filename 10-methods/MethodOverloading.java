public class MethodOverloading {

    //method overloading
    static int max(int x, int y) {
        return x > y ? x : y;
    }

    static float max(float x, float y) {
        return x > y ? x : y;
    }

    static int max(int x, int y, int z) {
        return x > y ? (x > z ? x : z) : (y > z ? y : z);
    }

    public static void main(String[] args) {
        /*
         Method Overloading
         You can have the same names on the method as long the difference
         - can be the parameter list (int, float etc)
         - data types int max(int x, int y) float(int x, int y)
         You can have as many as parameters as you want
         */

            System.out.println(max(70, 39, 55));
        }
}