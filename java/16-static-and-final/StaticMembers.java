/*
Static keyword is used for representing metadata
They are the best for representing the information of a class
Not about the objects
All the objects can share the static information
 */

class MercFour {
    static long price = 100_000; // base price, shared by all cars
    double interestRate = 0.2;

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

    void showPrice()
    {
        System.out.println("Price: " + price);
        System.out.println("Interest rate: " + interestRate);
    }
}

public class StaticMembers {
    public static void main(String[] args) {
        // No instances needed — static members belong to the class itself
        // They can be called in the main member as it is static c
        System.out.println("PLK on-road price: " + MercFour.onRoadPrice("PLK"));
        System.out.println("CPT on-road price: " + MercFour.onRoadPrice("CPT"));
        System.out.println("Base price (static field): " + MercFour.price);

        MercFour test = new MercFour();
        test.interestRate = 0.2;
        test.onRoadPrice("PLK");
        test.showPrice();
    }
}

