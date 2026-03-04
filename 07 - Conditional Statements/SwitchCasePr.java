import java.util.Scanner;

public class SwitchCasePr {
    public static void main(String[] args)
    {
        String n = "1";

        /*If statement
        /* if(n){
            System.out.println("One");
        }
        else if(n==2){
            System.out.println("Two");
        } else if(n==3){
            System.out.println("Three");
        } else {
            System.out.println("Not valid");
        }
*/
        //SwitchCases
        switch(n) {
            case "1":
                System.out.println("One");
            case "2":
                System.out.println("Two");
            case "3":
                System.out.println("Three");
                break;
            default:
                System.out.println("Not valid");
        }

        //domain exercise

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a domain"); //asking user to enter their domain
        String domain = scan.nextLine(); //storing the domain

        String ext = domain.substring(domain.lastIndexOf(".")+1); //gives out the string starting from . going backwards also other characters

        switch(ext){
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organisation");
                break;
            case "gov":
                System.out.println("Government");
                break;
            case "net":
                System.out.println("Network");
                break;
            default:
                System.out.println("Invalid domain");
        }

    }
}