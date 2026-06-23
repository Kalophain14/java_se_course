public class TypesOfProperties {

    /*
     * Types of properties
     * 
     * 1. Read and Writeable = it is used when you can read
     * = write the properties (get & set are used)
     * 
     * 2. Read only = get method allowed you cant change the value
     * = an example is an account number it cant be changed
     * 
     * 3. Write only = set method allowed you cant change the properties
     * = Produce (set) & consumer (get)
     * = Paying an account, you cant see the value of the balance after payment
     * = You can see acc, name and owner of the account no
     */

    String name;
    int age;
    boolean isEnrolled;

    public TypesOfProperties(String name, int age, boolean isEnrolled) {

        this.age = age;
        this.name = name;
        this.isEnrolled = isEnrolled;
    }

    public static void main(String[] args) {

        TypesOfProperties obj = new TypesOfProperties("John", 20, true);

        System.out.println("Student name: " + obj.name + " Student age: " + obj.age);
    }
}
