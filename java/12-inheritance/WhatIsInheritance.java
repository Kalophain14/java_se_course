public class WhatIsInheritance {

    //Super aka Parent Class
    public static class Circle {

        // properties
        private double radius;

        // constructors
        public Circle() {
            this.radius = 10.0;
        }
        public Circle(double radius) {
            this.radius = radius;
        }

        // getter Radius
        public double getRadius() {
            return radius;
        }

        // methods
        public double area() {
            return Math.PI * radius * radius;
        }
        public double perimeter() {
            return 2 * Math.PI * radius;
        }
    }

    //Inheritance aka Child Class Extends from Circle
    public static class Cylinder extends Circle {

        // properties
        private double height; //adding new feature

        // constructor calling superClass
        public Cylinder() {
            super(); // Calls the Circle() constructor (sets radius to 10)
            this.height = 5.0;
        }
        public Cylinder(double radius, double height) {
            super(radius); // Sets the radius in the superClass
            this.height = height;
        }

        // volume calculates method
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
                // object creation from the superClass and Inheritance
                Circle C1 = new Circle();
                Cylinder C2 = new Cylinder(5.0, 12.0);

                System.out.println("=== Circle 1 Properties ===");
                System.out.println("Radius: " + C1.getRadius());
                System.out.printf("Area: %.2f\n", C1.area());
                System.out.printf("Perimeter (Circumference): %.2f\n", C1.perimeter());
                System.out.println();

                System.out.println("=== Cylinder 2 Properties ===");
                // Inherits getRadius() and area() from Circle
                System.out.println("Base Radius: " + C2.getRadius());
                System.out.printf("Base Area: %.2f\n", C2.area());
                System.out.printf("Volume: %.2f\n", C2.volume());
    }
}
