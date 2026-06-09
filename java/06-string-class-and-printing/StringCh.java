//String Methods

public class StringCh {
    public static void main(String[] args) {

        // stringMethods Challange
        String str = "programmer@gmail.com";
        int i = str.indexOf('@');
        String username = str.substring(0, i);
        String domain = str.substring(i+1);

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);

        /*Meta challenge*/
        //Binary
        int b = 100010;
        String str2 = String.valueOf(b); //convert int to string
        System.out.println(str2.matches("[01]+"));

        //Hex or decimal
        String str3 = "424AD";
        System.out.println(str3.matches("[0-9A-F]+"));

        //Dates format dd/mm/yyyy
        String str4 = "20/02/2026";
        System.out.println(str4.matches("\\d{2}/\\d{2}/\\d{4}")); //Match exactly 2 digits,then 2 digits,then 4 digits





    }
}

//Regular Expression


 //System.out.println("is the email a gmail account? " + str.matches(".*[gmail]*."));