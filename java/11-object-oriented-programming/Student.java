public class Student {
    String name = "David";
    int age;
    double grade;
    boolean isEnrolled;

    Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println("Are studying? " + this.name);
    }
}
