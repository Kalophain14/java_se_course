public class HowToWriteAClass {

    //Rectangle Class
    class Rectangle{
        //Properties of the method
        double width;
        double height;

        //Behaviors as method
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }


        //Account Class
        class Account {
            //Properties of the class
            public long accountNumber;
            public double accountBalance;
            public String name;

            //behaviors as methods
            public void deposit(double amount) {
                accountNumber += amount;
                accountBalance += amount;
            }
            public void withdraw(double amount) {
                accountNumber -= amount;
            }
        }
    }

    public static void main(String[] args) {
        /*
        How to Write a Class

        Properties as variable of the methods
        Behaviors as method of inside the class
         */
    }
}
