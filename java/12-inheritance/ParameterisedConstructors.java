public class ParameterisedConstructors {


    public static class Parent
    {
        Parent()
        {
            System.out.println("Non Parameter Parent");
        }

        Parent(int x)
        {
            System.out.println("Parameter Parent Takes: " + x);
        }
    }

    public static class Child extends Parent
    {
        Child()
        {
            System.out.println("Non Parameter Child");
        }

        Child(int y)
        {
            System.out.println("Parameter Child");
        }

        Child(int x, int y)
        {
            super(x);
            System.out.println("Parameter Child Takes: " + y);
        }
    }

    public static class Grandchild extends Child
    {
        Grandchild()
        {
            System.out.println("Non Parameter Grandchild");
        }
        Grandchild(int z)
        {
            System.out.println("Parameter Grandchild");
        }
    }

    public static void main(String[] args) {
        // Constructors in Inheritance

        Child child = new Child(21 ,10);
    }
}
