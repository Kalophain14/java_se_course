package mypack1;

class Package2 {
    // Properties
    public String name;
    public int price;

    // Constructors
    public Package2 (String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Method
    public void Package2 () {
        System.out.println("Package " + this.name + ", " + this.price);
    }
}

public class CreatingAPackage2 {

    public static void main(String[] args) {
        // Creating a Package
        Package2 p1 = new Package2("P1", 500);
        p1.Package2 ();
    }
}