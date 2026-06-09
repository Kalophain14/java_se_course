// Part 1

public class StringPr {
    public static void main(String[] args) {
        String str = new String("   netbeans");

        //*length
        //int len = str.length();
        //System.out.println(len);

        //*Upper | Lower
        //String str2 = str.toLowerCase();
        //String str3 = str2.toUpperCase();
        //System.out.println(str3);

        //*trim*
        //System.out.println(str);
        //str = str.trim();
        //System.out.println(str);

        //*substring
        //String str2 = str.substring(8, 13);
        //System.out.println(str2);

        //*replace*
        //String str2 = str.replace("e", "k");
        //System.out.println(str2);

        //*startsWith
        //String str2 = str.startsWith("netbeans");
        //System.out.println(str2);

        //*endsWith
        //String str2 = str.endsWith("b");
        // System.out.println(str2);

        //*charAt
        //String str2 = str.charAt("a");
        //String str3 = str.indexOf("ab") / ("a, 6 ");
        //System.out.println(str2);

        //*startsWith*
        //String str1 = "www.udemy.co.in";
        //System.out.println(str1.lastIndexOf("."));

        //*equals()
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println(str1 == str2); // true as they hold the same reference of object
        System.out.println(str1.equals(str2));

        System.out.println(str1 == str3); //false because hold different address as the string is created in heap
        System.out.println(str1.equals(str3));

        //*compareTo
        String str4 = "Java";
        String str5 = new String("Jav");
        System.out.println(str4.compareTo(str5));
        System.out.println(str4.compareTo(str5));

        //ignoreCase + Concatenate
        String str6 = "Java is strict";
        String str7 = " Java is awesome";
        System.out.println(str6.concat(str7));

        //*valueOf
        String str8 = "Java";
        System.out.println(str8.matches(str7));

    }
}
