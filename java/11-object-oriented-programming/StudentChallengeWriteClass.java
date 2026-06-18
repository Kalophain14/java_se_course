import java.util.Scanner;

public class StudentChallengeWriteClass {

    //Properties Student
    int roll;
    String name;
    String course;
    int mark_1,mark_2,mark_3;


    /*
    Constructor
    StudentChallengeWriteClass(String roll, String name, String grade, int age){
        this.roll;
        this.name = name;
        this.grade = grade;
        this.age = age;
    }*/

    //Methods
    public int total(){
        return mark_1+mark_2+mark_3;
    }
    public double average(){
        return (float)total()/3;
    }
    public String grade(){
        if(average() >= 60)
            return "Passed A";
        else
            return "Failed B";
    }
    public String details(){
        return "\nRoll no: " + roll + "\nName: " + name + "\nCourse: " + course + "\n";
    }


    public static void main(String[] args) {
        StudentChallengeWriteClass obj = new StudentChallengeWriteClass();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll: ");
        obj.roll = sc.nextInt();

        sc.nextLine(); //clearing leftover
        System.out.print("Enter name: ");
        obj.name = sc.nextLine();

        System.out.print("Enter course: ");
        obj.course = sc.nextLine();

        System.out.print("Enter mark 1: ");
        obj.mark_1 = sc.nextInt();

        System.out.print("Enter mark 2: ");
        obj.mark_2 = sc.nextInt();

        System.out.print("Enter mark 3: ");
        obj.mark_3 = sc.nextInt();

        System.out.println();
        System.out.println("Total Score: " + obj.total());
        System.out.printf("Average: %.2f%n", obj.average());
        System.out.println("Student details: " + obj.details());

        sc.close();
    }
}