public class StudentChallengeWriteClass3 {

    //Class Cylinder

    //properties
    double radius;
    double height;

    public double lidArea(){
        return Math.PI * radius * radius;
    }
    public double circumference(){
        return 2 * Math.PI*radius;
    }
    public double totalSurfaceArea(){
        return 2 * lidArea() + circumference() * height;
    }
    public double volume(){
        return lidArea()*height;
    }

    public static void main(String[] args) {
        StudentChallengeWriteClass3 obj = new StudentChallengeWriteClass3();

        obj.radius = 10;
        obj.height = 7;

        System.out.println("lidArea is: " + obj.lidArea());
        System.out.println("Surface is: " + obj.totalSurfaceArea());
        System.out.println("Volume is: " + obj.volume());
    }
}
