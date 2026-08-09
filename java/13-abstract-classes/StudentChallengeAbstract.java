package StudentChallangeAbstract;

abstract class Shape {
    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape {
    double radius;

    // Constructors Access
    Circle(double radius) {
        this.radius = radius;
    }

    // Methods override
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    // Constructors Access
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Methods override
    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public double area() {
        return length * breadth;
    }
}

public class StudentChallengeAbstract {
    public static void main(String[] args) {
        // Polymorphism Calling
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("===Circle===");
        System.out.println("Perimeter: " + circle.perimeter());
        System.out.println("Area: " + circle.area());

        System.out.println("===Rectangle===");
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Area: " + rectangle.area());
    }
}
