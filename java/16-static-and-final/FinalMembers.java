/*
Final keyword = constant a value that can't be changed

Final variables
Final method
Final class

Final/Constant you can initialize them inside a
- when you declare them final int MIN = 1;
- static block
- inside a method
*/

// Final variables
class Finalkeyword {

    static final int NORMAL;
    final int MIN = 1;
    int MAX;

    // initialize in static block
    static {
        NORMAL = 5;
    }

    // initialize inside a method
    void My(){
        MAX = 100;
    }
}

// Final method
class Super {
    final void method(){
        System.out.println("Super Method");
    }
}

class Sub extends Super {
    // can't be overriden as it is a final method
//    void method(){
//        System.out.println("Sub Method Override");
//    }
    void method2(){
        System.out.println("Sub Method 2");
    }
}

public class FinalMembers {
    public static void main(String[] args) {
        // Final Members
        Finalkeyword obj = new Finalkeyword();

        Super obj1 = new Super();
        obj1.method();

        Sub obj2 = new Sub();
        obj2.method();
        obj2.method2();

    }
}
