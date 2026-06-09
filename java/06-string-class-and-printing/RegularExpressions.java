/*

Regular expression == they give out true if it matches the characters etc else false

*Matching Symbols*
. >  any letter/symbol/character
[abc] > exactly given letters
[abc][vz] > either first or second set
[^abc] > expect abc
[a-z1-7] > a-z or 1-7
A | B > A or B
XZ > exactly XZ
 */


/* public class RegularExpressions {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str.matches("cba"));
    }
}

/*

*Meta characters*
\d > Digits
\D > Not digits
\s > Space
\S > Not space
\w > Alphabets or digit
\W > Neither alphabet or digit

 */

/*public class RegularExpressions{
    public static void main(String[] args) {
        String str2 = " ";
        System.out.println(str2.matches("\\s"));
    }
}

/*
Quantifiers = specifying how many symbols you want

* > 0 or more time (it gives any symbol is true if the string contains certain characters)
[abc]* string can be abcbbbc its true
[a-z]* everything must be in lower alphabet from a - z e.g apple, banana etc

+ > one or more time (1 character has to be there to be true)

? > 0 or 1 time

{X} > X times (this means the length of the string must be exactly of the size
- [a -z] {5} - this means you can write any string but it must be 5 letters not more!
ashdf babye ysyse

{X,Y} > Between X(starting from) and Y(range to) time (minimum and maximum) - user id for example must 8 char

*/

public class RegularExpressions{
    public static void main(String[] args) {
        String str2 = "john45@gmail.com";
        System.out.println(str2.matches("\\w*gmail.com*."));
    }
}

