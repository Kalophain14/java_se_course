public class Recursion {

    //reverse recursion
    static void fun(int n){
        if(n>0){
            System.out.println("You're fun rec is: "+ n);
            fun(n-1);
        }
    }

    //forward recursion
    static void fun2(int n){
        if(n>0){
            fun2(n-1);
            System.out.println("You're sec rec num is: "+ n);
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
