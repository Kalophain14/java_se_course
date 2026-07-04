public class ConstructorsInInheritance {


    public static class Parent
    {
        public Parent()
        {
            System.out.println("Parent Constructor");
        }
    }

    public static class Child extends Parent
    {
        public Child()
        {
            System.out.println("Child Constructor");
        }
    }

    public static class Grandchild extends Child
    {
        public Grandchild()
        {
            System.out.println("Grandchild Constructor");
        }
    }

    public static void main(String[] args) {
        // Constructors in Inheritance

        //Parent obj = new Parent();
        //Child child = new Child();
        Grandchild grandchild = new Grandchild();
    }
}
