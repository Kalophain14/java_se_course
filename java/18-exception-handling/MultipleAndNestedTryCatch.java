import java.util.Scanner;

public class MultipleAndNestedTryCatch {

    public static void main(String[] args) {
        // Multiple and Nested Try Catch
        try {
            Scanner input = new Scanner(System.in);
            System.out.println();
            
            int numerator [] = {10,20,30,40};
            
        }
        
        catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
