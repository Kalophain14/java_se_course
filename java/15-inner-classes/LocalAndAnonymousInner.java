package LocalAndAnonymousInner;

//LocalInnerClass
class Outer{

    void Display(){
        // A class within a method
        class localInner{
            void InnerDisplay(){
                System.out.println("Hello");
            }
        }
        localInner i = new localInner();
        i.InnerDisplay();
    }
}


// Anonymous Class
abstract class My{
    abstract void display();
}

// The objects of the abstract class becomes a class
// then overriding the method inside the class
// therefore becomes anonymous class
class AnonymousOuter{
    public void AnonymousMeth(){
        My m = new My() {
            @Override
            void display()
            {
                System.out.println("Hello");
            }
        };
        m.display();
    }
}

public class LocalAndAnonymousInner {
    public static void main(String[] args) {
    //
        AnonymousOuter o = new AnonymousOuter();
        o.AnonymousMeth();
    }
}