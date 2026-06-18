public class StudentChallengeWriteClass2 {

    //properties
    double length;
    double width;

    //Methods
    double area(){
        return length * width;
    }

    double perimeter(){
        return  2 * (length + width);
    }

    boolean isSquare(){
        if(length == width )
            return true;
         else
             return false;
    }

    public static void main(String[] args) {
        // Student Challenge - Write a Class Rectangle
        StudentChallengeWriteClass2 obj = new StudentChallengeWriteClass2();
        StudentChallengeWriteClass2 obj2 = new StudentChallengeWriteClass2();

        obj.length = 10.2;
        obj.width = 12.3;

        obj2.length = 4.2;
        obj2.width = 10.2;

        System.out.println("The area of a rectangle: " + obj.area());
        System.out.println("The area of a rectangle: " + obj.perimeter());
        System.out.println("Lenghth "+ obj.isSquare());

        System.out.println("The area of a rectangle: " + obj2.area());
        System.out.println("The area of a rectangle: " + obj2.perimeter());
        System.out.println("Lenghth "+ obj2.isSquare());
    }
}