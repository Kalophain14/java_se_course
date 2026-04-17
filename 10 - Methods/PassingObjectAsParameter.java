import java.util.Scanner;

public class PassingObjectAsParameter
{
    //Updating array Method
    static void update(int A[]) //passing an empty array as a parameter
    {
        A[0] = 25;
    }

    //Username Extractor Method
    static String userName(String email) {
        int a = email.indexOf('@'); //searches for the name before it reaches @
        String name = email.substring(0, a); //cuts until the @ sign
        return name;
    }

    public static void main(String[] args)
    {
        //Passing Object as Parameter
        System.out.println("===Updating Array===");
        int A[]={2,3,4,5,6};
        update(A);
        System.out.println(A[0]);

        //Username
        System.out.println("===Extracting Username===");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        String result = userName(email);

        System.out.println("Your username is: " + result);

        scanner.close();
    }
}
