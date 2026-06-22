public class Constructors {

    String title;
    String director;
    int releaseYear;

    // Constructor: name must match the class name, no return type
    Constructors(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    // Instance method (not static) since it uses this.title, this.director, etc.
    void printSummary() {
        System.out.println("This movie " + title + " was directed by " + director + " released in " + releaseYear);
    }

    public static void main(String[] args) {
        /* Constructors = A special method to initialize objects
                          You can pass arguments to a constructor
                          and set up initial values
                          We use the THIS keyword to access the reference
         */

        Student student1 = new Student("David", 22, 78.9);
        Student student2 = new Student("Khensani", 14, 98.9);
        Student student3 = new Student("Lethabo", 22, 35.4);

        Student greeting1 = new Student("🎉 Happy New Year! 🎉", 2025);
        Student greeting2 = new Student("🎊 Happy New Year! 🎊", 2026);
        Student greeting3 = new Student("✨ Happy New Year! ✨", 2027);

        Constructors cinema1 = new Constructors("007", "James Bond", 2026);
        Constructors cinema2 = new Constructors("Superman", "Zack Snyder", 2013);

        cinema1.printSummary();
        cinema2.printSummary();
    }
}