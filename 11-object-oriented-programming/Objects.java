public class Objects {
    public static void main(String[] args) {
        
        
        /*
        Object = an entity that holds (attributes) //variable name, food etc
                 and can perform actions(methods) sleep(), eat()
                 It is a reference data type
         */
        
        Car car = new Car(); //use case of using a method as an object
        Car car2 = new Car();

        car.isRunning = true; //you can modify within the running

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);
        System.out.println(car.color);

        //Running the methods within the methods
        car.run();
        car.stop();
        car.drive();
    }
}