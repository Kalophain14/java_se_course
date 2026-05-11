import java.util.Random;

public class RandomNum {

    public static void main(String[] args) {
        
        Random random = new Random();
        
        double num;
        num = random.nextDouble(1, 101);
        //inputting random numbers the first & last number dont get included
        System.out.println(num);

        boolean isHeads;
        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("The coinflipped is HEADS");
        } else {
            System.out.println("The coinflipped is TAIL");
        }
    }
}
