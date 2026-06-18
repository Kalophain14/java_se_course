public class WritingAClassForCircle {

    double radius;

    //Methods that
    // return dont take parameters
    public double area(){

        return Math.PI * radius * radius;
    }
    public double perimeter(){

        return 2 * Math.PI * radius;
    }
    public double circumference(){

        return 2 * radius * Math.PI;
    }

    public static void main(String[] args) {
        //calling out the method
        WritingAClassForCircle obj = new WritingAClassForCircle();
        WritingAClassForCircle obj2 = new WritingAClassForCircle();

        //Properties
       obj.radius = 7;
       obj2.radius = 14;

        System.out.printf("Area is: %.2f%n", obj.area());
        System.out.printf("Circumference: %.2f%n", obj.circumference());
        System.out.printf("Perimeter: %.2f%n", obj.perimeter());


        System.out.println("==new object==");

        System.out.printf("Area2 is: %.2f%n", obj2.area());
        System.out.printf("Circumference2: %.2f%n", obj2.circumference());
        System.out.printf("Perimeter: %.2f%n", obj.perimeter());
    }
}
