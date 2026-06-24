import java.util.Scanner;

public class Customer {

    // Private properties
    private String customId;
    private String name;
    private String address;
    private String email;
    private long phone; // Kept as long, but stripped the leading 0 in main

    // Getters (Fixed naming convention for address and email)
    public String getCustomId() {
        return customId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() { // Fixed
        return address;
    }

    public String getEmail() { // Fixed
        return email;
    }

    public long getPhone() {
        return phone;
    }

    // Setters
    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            System.out.println("Invalid name");
        else
            this.name = name;
    }

    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty())
            System.out.println("Invalid address");
        else
            this.address = address;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty())
            System.out.println("Invalid email");
        else
            this.email = email;
    }

    public void setPhone(long phone) {
        if (phone <= 0L)
            System.out.println("Invalid phone");
        else
            this.phone = phone;
    }

    // Constructor
    public Customer(String customId, String name, String address, String email, long phone)
    {
        this.customId = customId; //this as as its not set
        setName(name);
        setAddress(address);
        setEmail(email);
        setPhone(phone);
    }

    //Method
    public Customer()
    {

    }

    public static void main(String[] args) {

        Customer obj = new Customer();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Customer ID: ");
        obj.customId = input.nextLine();
        
        System.out.print("Enter name: ");
        obj.name = input.nextLine();

        System.out.print("Enter address: ");
        obj.address = input.nextLine();

        System.out.print("Enter email: ");
        obj.email = input.nextLine();

        System.out.print("Enter phone: ");
        obj.phone = input.nextLong();

        System.out.println();
        System.out.println("==Customer Details==");
        System.out.println("Customer ID: " + obj.customId);
        System.out.println("Customer Name: " + obj.getName());
        System.out.println("Customer Address: " + obj.getAddress());
        System.out.println("Customer Email: " + obj.getEmail());
        System.out.println("Customer Phone Number: " + obj.getPhone());

        input.close();
    }
}
