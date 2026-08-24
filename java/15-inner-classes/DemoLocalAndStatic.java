package DemoLocalAndStatic;

class Outer{
    int x = 5;
    static int y = 20;

    static class Math{
        public void show(){
            System.out.println("Value of y is: " + y);
        }
    }
}

public class DemoLocalAndStatic {
    public static void main(String[] args) {
        // Demo - Local and Static Inner Classes

        Outer.Math obj = new Outer.Math();
        obj.show();
    }
}
