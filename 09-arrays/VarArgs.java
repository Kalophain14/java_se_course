public class VarArgs {
    public static void main(String[] args) {
        /*
        Vararguments = allow a method to accept a varying # of arguements
        makes method more flexible, no need for overloaded methods
        Java will pack arguements into an array
        (ellipsis)
         */

        double result = average(1, 2, 3, 4, 6, 7, 8, 9, 10); //accepting any number of arguments
        System.out.printf("The Average of this numbers is: %.2f ", result);
    }

    static double average (double ... numbers){ //the .... indicates ellipsis array
        double sum = 0;

        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}