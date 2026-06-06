public class Car {
    String color = "White";
    String model = "Hyundai i20";
    int year = 2026;
    double price = 2021.99;
    boolean isRunning = true;

    public void run()
    {
        isRunning = true;
        System.out.println("Vroom Vroom Gone Kanje");
    }

    void stop() {
        isRunning = false;
        System.out.println("You have to stop the car");
    }

    void drive()
    {
        isRunning = true;
        System.out.println("You drive a " + color + " " + model);
    }
}