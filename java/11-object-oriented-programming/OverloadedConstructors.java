public class OverloadedConstructors {

    public static void main(String[] args) {
        /*
         Overloading Constructors = They allow a class to have multiple cosntructors of the same name
                                  = Whilst taking different arguments, they need different parameter list
                                  = You can always initiate them using different objects
                                  = The same as Method overloading
         */

        User user1 = new User("John");
        User user2 = new User("David", "age@gmail.com");
        User user3 = new User("Lethabo", "Lt@gmail.com", 30);
        User user4 = new User();

        System.out.println("==1 arguemnts==");
        System.out.println(user1.username);

        System.out.println("==2 arguments==");
        System.out.println(user2.username);
        System.out.println(user2.email);

        System.out.println("==3 arguments==");
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println("===Accepts no argumemt==");
        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
