/* Variables Names - Rules*/

/*
1. Case Sensetive
- int amount or int Amount = two variables cannot have the same name in the same method or class

2. Contains Alphabets, Numbers
- int room1, int world_south
- total$Amount = $ acts as a space between the variable
- String first_Name

3. Starts with Alphabet or _ or $
- it cannot start with _ or $ must start with an alphabet

4. Should not use keywords
- e.g int, true, false
- int this, int else, int float, float transient etc

5. Should not use a class name if class is also in use
(String [] args] String is a class therefore you cant say:

- int String; nooooo

6. No Limit
- int numbers$of$learners$in$class
- int the_Whole_World

7. Follow camelCase
long rollNumber
int hugeGetters
string averageMarkOfClass

*/

public class VariableRules
{
    public static void main(String[] args)
    {
        int huge_Numbers = 120;
        long hugeNumbers = 1245;
        String firstName = "John";

        System.out.println(huge_Numbers);
        System.out.println(hugeNumbers);
        System.out.println(firstName);
    }
}