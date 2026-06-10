public class Constructors {

    public static void main(String[] args) {
        /* Constructors = A special method to initialize objects
                          You can pass arguments to a constructor
                          and set up initial values
                          We use the THIS keyword to access the reference
         */
        
        Student student1 = new Student("David", 30, 78.9);
        Student student2 = new Student("Khensani", 14, 98.9);
        Student student3 = new Student("Lethabo", 33, 88.4);

        /*
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.grade);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.age);
        System.out.println(student2.grade);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.grade);
        System.out.println(student3.isEnrolled);
        */

        // Mix it with a method to call
        student1.study();
        student2.study();
        student3.study();
    }
}
