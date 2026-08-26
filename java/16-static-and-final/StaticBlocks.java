package StaticBlocks;

class Test{
    static {
        System.out.println("static block");
    }
    static {
        System.out.println("static block 2");
    }
}

public class StaticBlocks{
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("Main Class");
    }
}