public class ThisVsSuper {

    int length;
    int breadth;
    int x = 10;

    // Constructor
    ThisVsSuper(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method
    void display(){
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }

    // Using the Super properties
    static class Circle extends ThisVsSuper {
        int radius;
        int x = 10;

        Circle(int l, int b) {
            super(l, b);
            radius = l;
        }

        void display(){
            System.out.println("Radius: " + this.radius);
            System.out.println("X: " + this.x);
        }
    }

    public static void main(String[] args) {

        // this vs super
        ThisVsSuper test = new ThisVsSuper(10, 30);
        test.display();

        System.out.println();

        Circle test2 = new Circle(30, 20);
        test2.display();
    }
}
