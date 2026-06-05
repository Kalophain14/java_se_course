public class Recursion {

    /* reverse recursion
        it prints the output before checking conditions
        it prints and calls again
     */
    static void fun(int n){
        if(n>0){
            System.out.println("Forward rec num is: "+ n);
            fun(n-1);
        }
    }

    /* forward recursion
        it checks the condition and prints again
        it calls condition and print again
     */
    static void fun2(int n){
        if(n>0){
            fun2(n-1);
            System.out.println("Reverse rec num is: "+ n);
        }
    }


    public static void main(String[] args) {
        /*
        Recursion Method = is a method that calls itself until the logic is false
         */

        //Calling recursion method
        fun(3);
        fun2(3);
    }
}
