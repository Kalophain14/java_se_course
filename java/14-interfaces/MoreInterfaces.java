package MoreInterfaces;


interface Member{
    void callback();
}

class Store{
    // Array to store num of members
    Member mem [] = new Member[100];
    int count = 0;

    // Register method
    void registerMember(Member m){
        mem[count++] = m;
    }

    // For every member who signs up get a discount
    void inviteSale(Member m){
        for(int i=0;i<count;i++){
            mem[i].callback();
        }
    }
}

class Customer implements Member {
    // Constructor
    String name;
    Customer(String n){
        name = n;
    }

    // Method Override Interface
    @Override
    public void callback() {
        System.out.println("Customer callback");
    }
}

public class MoreInterfaces{
    public static void main(String[] args) {

        Store checkers = new Store();
        Customer newcustomer = new Customer(args[0]);

        checkers.registerMember(newcustomer);
        checkers.inviteSale(newcustomer);

        newcustomer.callback();
    }
}