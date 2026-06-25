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
    public void setSubID(String sbID) {
        this.subID = sbID;
    }

    public void setSubName(String subName) {
        if (subName == null)
            this.subName = "";
        else
            this.subName = subName.toUpperCase();
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

//    //Method
//    public isQualified(){
//        return marksObtained >= maxMarks/10*4;
//    }

    // Default Constructor
    public ArrayOfObjectsChallenge() {
    }

    // Parameterized Constructor
    public ArrayOfObjectsChallenge(String subID,
                                   String subName,
                                   int maxMarks,
                                   int marksObtained ) {
        setSubID(subID);
        setSubName(subName);
        setMaxMarks(maxMarks);
        setMarksObtained(marksObtained);
    }

    public static void main(String[] args) {
        ArrayOfObjectsChallenge obj = new ArrayOfObjectsChallenge();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Sub ID: ");
        String inputSubID = input.nextLine();
        obj.setSubID(inputSubID);

        System.out.print("Enter Sub Name: ");
        obj.setSubName(input.nextLine());

        System.out.print("Enter Max Marks: ");
        obj.setMaxMarks(input.nextInt());

        System.out.print("Enter Marks Obtained: ");
        obj.setMarksObtained(input.nextInt());

        System.out.println("\n--- Student Details ---");
        System.out.println("Student ID: " + obj.getSubID());
        System.out.println("Student Name: " + obj.getSubName());
        System.out.println("Student Max Marks: " + obj.getMaxMarks());
        System.out.println("Student Marks Obtained: " + obj.getMarksObtained());


        input.close();
    }
}