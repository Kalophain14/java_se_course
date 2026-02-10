/*public class Demo {
    static double perc(double num, int percentage) {
        double res = num*percentage/100;
        return res;
    }
    public static void main(String[] args) {
        double x = perc(530, 23);
        System.out.println("Result is: "+x);
    }
}*/

class Demo {
    static boolean check(int grade) {
        if(grade >=70) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int x = 195;
        if(check(x) == true)
        {
            System.out.println("Congrats!");
        }
        else
        {
            System.out.println("Sorry you failed");
        }
    }
}