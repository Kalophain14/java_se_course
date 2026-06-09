import java.util.Scanner;

public class SubstriDive {
    public static void main(String [] args){
        /*
        .substring() = A method used to extract a portion of a string
        .substring(star, end)
         */

        Scanner input = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.println("Enter your email: ");
        email = input.nextLine();

        if (email.contains("@")) {
            username = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("You're username is: " + username);
            System.out.println("You're domain is: " + domain);
        } else {
            System.out.println("Email must contain @");
        }
        input.close();
    }
}