package DemoNestedInnerClasses;

class Outer{
    void Display(){
        // Local Class Inner
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

class Outer2{
    void Displays(){
        class localInners{
            void InnerDisplay(){
                System.out.println("Hello");
            }
        }
        localInners i = new localInners();
        i.InnerDisplay();
    }
}
public class DemoNestedInnerClasses {

    public static void main(String[] args) {
        // Demo - Nested Inner Classes

        Outer obj = new Outer();
        obj.Display();

        Outer2 obj2 = new Outer2();
        obj2.Displays();

    }
}
