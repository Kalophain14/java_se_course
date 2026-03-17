publc class JavaNotes {
    public static void main(String[] args) {

/* Chapter 3: Getters and setters
3.1 Getters and setters allows to use the private variables to safeguard information,
that way the information can always be changed when you use a setter.

Prioritise less accessibility which helps safe or not allow changes to the first variable as pleased

Methods
getVariableName() //gets the variable and return the value of the variable
setVariableName() //sets the value of variable
*/
        public class Person {
            private String name;

            public String getName() {//can only be accessed using this method
                if (name.length() > 5) //if name isnt greater than 5 it is too small
                    return "name a too small";
                else
                    return name;
            }

            public void setName(String name) { //can only set or changed using this setter
                if (name != null && name.length() > 2) //only sets a new name if it is more than two words
                    this.name = name;
            }
        }


/*
Chapter 4: Reference Data Types
Dereferencing follows the memory address stored in a reference,
to the place in memory where the actual object resides.
When an object has been found, the requested method is called (toString in this case).
*/

        // 4.1 Dereferencing


        Object obj = new Object(); //referencing
        String text = obj.toString() //obj dereferenced

        // When a reference has the value null, dereferencing results in a NullPointerException:

        Object obj = null; // indicates there is no value or no memory
        obj.toString(); //Throws a NullpointerException when this statement is executed.

        // 4.2 Instantiating a reference type

        Object obj = new Object();

        /* Key notes
        Object = is a reference type
        obj = is the variable which is to store the new reference and memory
        Object() = is the call to a constructor of Object

        Space in memory gets allocated for the object
        The constructor Object() is called to initialise that memory space.
        The memory address is stored in the new variable obj, so that it references the newly created object
         */

        //Chapter 9

        /*
        Section 9.1 Using underscore to improve readability


        //All primitive numbers
        byte color = 1_2_3;
        short yearsAnnoDomini= 2_016;
        int socialSecurityNumber = 999_99_9999;
        long creditCardNumber = 1234_5678_9012_3456L;
        float piFourDecimals = 3.14_15F;
        double piTenDecimals = 3.14_15_92_65_35;

        // Binary prefixes

        short binary= 0b0_1_0_1; // 0b prefix --> binary literal
        int octal = 07_7_7_7_7_7_7_7_0; // 0 prefix --> octal literal
        long hexBytes = 0xFF_EC_DE_5E; // 0x prefix --> hexadecimal literal
        int age = 100; // no prefix --> decimal literal
         */

    }
}