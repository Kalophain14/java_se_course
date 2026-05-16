/*
Break = Lets you pause from the value and STOP
Continue = Lets you SKIP the value and continue
 */

public class BreakContinue {
    public static void main(String [] args){
        for (int i = 0; i <= 10 ; i+=1) {
            if (i == 2) {
                continue;
            }
            System.out.println("Counting from: " + i  + " ");
        }
    }
}