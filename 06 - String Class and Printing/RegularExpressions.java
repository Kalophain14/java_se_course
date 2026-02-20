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

