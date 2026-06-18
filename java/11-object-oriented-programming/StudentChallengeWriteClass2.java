public class StudentChallengeWriteClass2 {

    //properties
    double length;
    double width;

    //Methods
    public double area(){
        return length * width;
    }

    public double perimeter(){
        return  2 * (length + width);
    }

    public static void main(String[] args) {
        // Student Challenge - Write a Class Rectangle
        StudentChallengeWriteClass2 obj = new StudentChallengeWriteClass2();
        StudentChallengeWriteClass2 obj2 = new StudentChallengeWriteClass2();

        obj.length = 10;
        obj.width = 12;

        obj2.length = 4;
        obj2.width = 10;

        System.out.println("The area of a rectangle: " + obj.area());
        System.out.println("The area of a rectangle: " + obj.perimeter());

        System.out.println("The area of a rectangle: " + obj2.area());
        System.out.println("The area of a rectangle: " + obj2.perimeter());
    }
}
