public class WhatIsInheritance {

    public static class Circle {
        private double radius;

        // Constructors
        public Circle() {
            this.radius = 10.0;
        }
        public Circle(double radius) {
            this.radius = radius;
        }

        // Getter Radius
        public double getRadius() {
            return radius;
        }

        //Methods
        public double area() {
            return Math.PI * radius * radius;
        }
        public double perimeter() {
            return 2 * Math.PI * radius;
        }
    }

    //Inheritance extension
    public static class Cylinder extends Circle {
        private double height; //adding new feature

        // Constructors
        public Cylinder() {
            super(); // Calls the Circle() constructor (sets radius to 10)
            this.height = 5.0;
        }
        public Cylinder(double radius, double height) {
            super(radius); // Sets
            this.height = height;
        }

        // Volume method
        public double volume() {
            return area() * height;
        }
    }


    public static void main(String[] args) {
        /* What is Inheritance
                = is the process of acquiring the features of an existing class to a new class
                = A child inheriting their mother and fathers features DNA, Height etc

                What are you acquiring
                = Properties (Variables etc)
                = Methods/Functions
         */
                // Creating the objects using your default constructors
                Circle C1 = new Circle();
                Cylinder C2 = new Cylinder(5.0, 12.0);

                System.out.println("--- Circle 1 Properties ---");
                System.out.println("Radius: " + C1.getRadius());
                System.out.printf("Area: %.2f\n", C1.area());
                System.out.printf("Perimeter (Circumference): %.2f\n", C1.perimeter());
                System.out.println();

                System.out.println("--- Cylinder 2 Properties ---");
                // Inherits getRadius() and area() from Circle
                System.out.println("Base Radius: " + C2.getRadius());
                System.out.printf("Base Area: %.2f\n", C2.area());
                System.out.printf("Volume: %.2f\n", C2.volume());
    }
}
