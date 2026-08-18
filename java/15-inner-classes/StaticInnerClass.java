interface Test1{
    void meth1();
    void meth2();
}

class Test2 implements Test1{
    //override abstract interference class
    @Override
    public void meth1() {
        System.out.println("Hello");
    }

    @Override
    public void meth2() {
        System.out.println("Hey you");
    }
}

public class StaticInnerClass {

    public static void main(String[] args) {
        // Static Inner Class

        Test2 t2 = new Test2();
        t2.meth1();
        t2.meth2();
    }
}
