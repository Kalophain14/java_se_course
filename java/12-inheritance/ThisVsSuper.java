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
        int x = 30;

        Circle(int l, int b, int h) {
            super(l, b);
            radius = h;
        }

        void display(){
            System.out.println("Super: " + x);
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        // this vs super
        ThisVsSuper test = new ThisVsSuper(10, 14);
        test.display();

        System.out.println();

        Circle c1 = new Circle(15,12,13);
        c1.display();
        System.out.println(c1.length);
    }
}
