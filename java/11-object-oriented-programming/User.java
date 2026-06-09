public class User {

    //Constructor
    String username;
    String email;
    int age;

    User(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }

    //constructor overload
    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    //constructor method with 3 arguements
    User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }

    //constructor that accept no arguments
    User(){
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }
}
