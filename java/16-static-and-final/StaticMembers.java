/*
Static keyword is used for representing metadata
They are the best for representing the information of a class
Not about the objects
All the objects can share the static information
 */

class MercFour {
    static long price = 100_000; // base price, shared by all cars

    static double onRoadPrice(String city) {
        switch (city) {
            case "PLK":
                return price + price * 0.1;
            case "CPT":
                return price + price * 0.9;
            default:
                System.out.println("Unknown city: " + city);
                return 0;
        }
    }
}

public class StaticMembers {
    public static void main(String[] args) {
        // No instances needed — static members belong to the class itself
        System.out.println("PLK on-road price: " + MercFour.onRoadPrice("PLK"));
        System.out.println("CPT on-road price: " + MercFour.onRoadPrice("CPT"));
        System.out.println("Base price (static field): " + MercFour.price);
    }
}

