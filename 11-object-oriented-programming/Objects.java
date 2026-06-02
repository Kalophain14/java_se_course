public class Objects {
    public static void main(String[] args) {
        
        
        /*
        Object = an entity that holds (attributes) //variable name, food etc
                 and can perform actions(methods) sleep(), eat()
                 It is a reference data type
                 Using the new keyword as a reference pointer
                 .(attributes) let u access the attributes of the methods in constructor
         */
        
        Car car1 = new Car(); //use case of using a method as an object
        Car car2 = new Car();

        /*
        car.isRunning = true; //you can modify within the running

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println("The vehicle price is " + car.price);
        System.out.println("The car is now running? " + car.isRunning);
        System.out.println(car.color);

        //Running the methods within the methods
        System.out.println(car.isRunning);
        car.run();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
        car.drive();
        */

        System.out.println("Car1 model is " + car1.model);
        System.out.println("Car2 mode is " + car2.model);
    }
}