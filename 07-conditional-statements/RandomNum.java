import java.util.Random;

public class RandomNum {

    public static void main(String[] args) {
        
        Random random = new Random();
        
        int num;
        num = random.nextInt(1, 6);
        //inputting random numbers the last number 6 doesn't get included
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
