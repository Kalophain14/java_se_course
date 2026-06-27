import java.util.Scanner;

public class ArrayOfObjectsChallenge {

    // Properties
    private String subID;
    private String subName;
    private int maxMarks;
    private int marksObtained;

    // Getters
    public String getSubID() { return subID; }
    public String getSubName() { return subName; }
    public int getMaxMarks() { return maxMarks; }
    public int getMarksObtained() { return marksObtained; }

    // Setters
    public void setSubID(String subID) {
        this.subID = subID;
    }

    public void setSubName(String subName) {
        if (subName == null)
            this.subName = "";
        else
            this.subName = subName;
    }

    public void setMaxMarks(int maxMarks) {
        if (maxMarks <= 0)
            this.maxMarks = 1;
        else
            this.maxMarks = maxMarks;
    }

    public void setMarksObtained(int marksObtained) {
        if (marksObtained <= 0)
            this.marksObtained = 1;
        else
            this.marksObtained = marksObtained;
    }

    // Default Constructor
    public ArrayOfObjectsChallenge() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        ArrayOfObjectsChallenge[] subs = new ArrayOfObjectsChallenge[3];

        //loop to gather details of the user
        //Creates 3 students chart and retrieve data as user enter it
        for (int i = 0; i < subs.length; i++) {
            System.out.println("\n--- Entering Details for Subject " + (i + 1) + " ---");

            subs[i] = new ArrayOfObjectsChallenge();

            System.out.print("Enter Sub ID: ");
            String inputSubID = input.nextLine();
            subs[i].setSubID(inputSubID);

            System.out.print("Enter Sub Name: ");
            subs[i].setSubName(input.nextLine());

            System.out.print("Enter Max Marks: ");
            subs[i].setMaxMarks(input.nextInt());

            System.out.print("Enter Marks Obtained: ");
            subs[i].setMarksObtained(input.nextInt());

            input.nextLine();
        }

        //looping through the details and accessing it
        System.out.println("\n==Student details==");

        for (int i = 0; i < subs.length; i++) {
            System.out.println("\nSubject " + (i + 1) + ":");
            System.out.println("Student ID: " + subs[i].getSubID());
            System.out.println("Student Name: " + subs[i].getSubName());
            System.out.println("Student Max Marks: " + subs[i].getMaxMarks());
            System.out.println("Student Marks Obtained: " + subs[i].getMarksObtained());
        }
        input.close();
    }
}