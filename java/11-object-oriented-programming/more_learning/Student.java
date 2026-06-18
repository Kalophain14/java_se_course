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


    // Constructor that spells out Happy New Year
    String message;
    int year;

    Student(String message, int year) {
        this.message = message;
        this.year = year;
        greet();
    }

    // Method to print the greeting
    void greet() {
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║  " + this.message + "  ║");
        System.out.println("║        Year: " + this.year + "         ║");
        System.out.println("╚════════════════════════════════╝");
    }
}
