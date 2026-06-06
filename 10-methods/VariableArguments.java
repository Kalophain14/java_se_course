public class VariableArguments {

    static void show(String...S){
        for (String s : S){
            System.out.println("Start: " + s);

        }
    }
    public static void main(String[] args) {
        // Variable Arguments
        show("Baby", "Khensani", "Paballo");
    }
}
