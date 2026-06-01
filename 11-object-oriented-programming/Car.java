public class Car {
    String color = "White";
    String model = "Hyundai i20";
    int year = 2026;
    double price = 220021.99;
    boolean isRunning = false;

    public void run()
    {
            System.out.println("Vroom Vroom Gone Kanje");
    }

    void stop() {
        System.out.println("You know stop");
    }

    void drive()
    {
        System.out.println("You drive a " + color + " " + model);
    }
}