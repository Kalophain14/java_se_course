public class WritingAClassForCircle {

    double radius;

    //Methods
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

        System.out.println("Area is: " + obj.area());
        System.out.println("Perimeter: " + obj.perimeter());
        System.out.println("circumference: " + obj.circumference());

        System.out.println("==new object==");

        System.out.println("Area2 is: " + obj2.area());
        System.out.println("Perimeter2: " + obj2.perimeter());
        System.out.println("circumference2: " + obj2.circumference());
    }
}
