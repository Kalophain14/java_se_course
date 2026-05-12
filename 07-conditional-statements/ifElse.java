public class ifElse {
    public static void main(String[] args) {

        boolean isStudent = false;
        boolean isInstructor = true;
        double price = 400;

        if (isStudent) {
            if (isInstructor) {
                System.out.println("You get a 20% senior discount");
                System.out.println("You get a 10% student discount");
                price *= 0.7;
            } else {
                System.out.println("You get a 10% student discount");
                price *= 0.9;
            }
        } else {
            if (isInstructor) {
                System.out.println("You get a 20% senior discount");
                price *= 0.8;
            }
        }

        System.out.printf("The price of your subscription is: R%.2f", price);
    }
}