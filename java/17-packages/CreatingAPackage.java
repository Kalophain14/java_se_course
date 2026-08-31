package mypack1;

class Package {
    // Properties
    public String name;
    public int price;

    // Constructors
    public Package (String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Method
    public void Package () {
        System.out.println("Package " + this.name + ", " + this.price);
    }
}

public class CreatingAPackage {

    public static void main(String[] args) {
        // Creating a Package
        Package p1 = new Package("P1", 100);
        p1.Package ();
    }
}