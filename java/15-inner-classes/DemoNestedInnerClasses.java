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

public class DemoNestedInnerClasses {

    public static void main(String[] args) {
        // Demo - Nested Inner Classes
    }
}
