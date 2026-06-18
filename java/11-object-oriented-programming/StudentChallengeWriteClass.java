public class StudentChallengeWriteClass {

    String name;
    String grade;
    int age;

    StudentChallengeWriteClass(String name, String grade, int age){
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public static void main(String[] args) {
        // Student Challenge - Write a Class 1
        StudentChallengeWriteClass obj = new StudentChallengeWriteClass("Baby", "Grade 9", 30 );
        StudentChallengeWriteClass obj2 = new StudentChallengeWriteClass("Khensani", "Grade 10", 14);

        System.out.println("First Student: "+ obj.name);
        System.out.println("First Student: "+ obj.grade);
        System.out.println("First Student: "+ obj.age);

        System.out.println("Second Student: " + obj2.name);
        System.out.println("Second Student: " + obj2.grade);
        System.out.println("Second Student: " + obj2.age);
    }
}