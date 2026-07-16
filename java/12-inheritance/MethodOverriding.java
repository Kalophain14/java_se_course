package MethodOverriding;

    /*
    Method overriding = it is when you re-define
                      = the method in the super class(parent) in the sub class(child)
    Why method overriding
    */

    class Super{
        public void display()
        {
            System.out.println("Super Class");
        }
    }

    class Sub extends Super{
        @Override
        public void display()
        {
            System.out.println("Sub Class borrowed");
        }
    }

    public class MethodOverriding
    {
        public static void main (String[]args){
        // Method Overriding
        Super m = new Super();
        m.display();

        Sub c = new Sub();
        c.display();

        /*
        NB The method will always be called depending
        on the object not reference
         */
        Super su = new Sub(); // Sub class will be called
        su.display();

        }
    }
