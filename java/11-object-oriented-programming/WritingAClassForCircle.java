
public class WritingAClassForCircle {

    //Properties
    static double radius;

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

        WritingAClassForCircle.radius = 7;
        WritingAClassForCircle obj = new WritingAClassForCircle();
        System.out.println("Area is: " + obj.area());
        System.out.println("Perimeter: " + obj.perimeter());
        System.out.println("circumference: " + obj.circumference());
    }
}
