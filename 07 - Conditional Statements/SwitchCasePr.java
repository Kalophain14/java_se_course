 public class SwitchCasePr {
    public static void main(String[] args)
    {
        String n = "1";

        //If statement
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
    }
}