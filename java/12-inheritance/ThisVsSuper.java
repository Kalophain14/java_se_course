public class ThisVsSuper {

    int length;
    int breadth;
    int x = 10;

    ThisVsSuper(int l, int b) {
        length = l;
        breadth = b;
    }

    void display(){
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }

    //Super
    class Circle extends ThisVsSuper {
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
        
        ThisVsSuper test = new ThisVsSuper(10, 5);
        test.display();


    }
}
