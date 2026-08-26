class CoffeeMachine {
    // Fields
    private float coffeeqty;
    private float waterqty;
    private float sugarqty;
    private float milkqty;

    static private CoffeeMachine ours = null;

    // Private constructor - prevents external instantiation
    private CoffeeMachine() {
        coffeeqty = 1;
        waterqty = 1;
        sugarqty = 1;
        milkqty = 1;
    }

    // More constructors
    public void fillWater(float qty) {
        waterqty = qty;
    }

    public void fillSugar(float qty) {
        sugarqty = qty;
    }

    public void fillCoffee(float qty) {
        coffeeqty = qty;
    }

    public void fillMilk(float qty) {
        milkqty = qty;
    }

    // Getter - actually uses the fields now
    private float getCoffeeqty() {
        return coffeeqty + waterqty + sugarqty + milkqty;
    }

    // Thread-safe way to get the single instance
    static public synchronized CoffeeMachine getInstance() {
        if (ours == null) {
            ours = new CoffeeMachine();
        }
        return ours;
    }
}

public class SingletonClass {
    public static void main(String[] args) {
        // Singleton Class Uses
        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();
        CoffeeMachine coffeeMachine2 = CoffeeMachine.getInstance();

        coffeeMachine.fillWater(10);
        coffeeMachine.fillSugar(10);

        coffeeMachine2.fillWater(10);
        coffeeMachine2.fillSugar(10);

        System.out.println("CoffeeMachine is " + coffeeMachine);
        System.out.println("CoffeeMachine is " + coffeeMachine2);
        System.out.println(coffeeMachine + "" + coffeeMachine2);

        if (coffeeMachine == coffeeMachine2) {
            System.out.println("CoffeeMachine is the same");
        }
    }
}