/*

Conditional Statements


FLOW CHARTS
                START
                  |
                  v
            +---------------+
            |  IF condition |
            +---------------+
              /           \
            true          false
             /               \
            v                 v
     +-------------+   +-------------+
     |   process   |   |   process   |
     +-------------+   +-------------+
              \           /
               \         /
                v       v
                  +-----+
                  | END |
                  +-----+


in coding

// if and else condition

if (condition){
 do something;
}
else {
if above is false do this instead
}

Nested if

if (condition {
if (condition)
{

}
else
{

}
                }
else
{
 if (condition)
 {

 }
}

 */

public class IEConditions {

    public static void main(String[] args) {

        System.out.println("                START");
        System.out.println("                  |");
        System.out.println("                  v");
        System.out.println("            +---------------+");
        System.out.println("            |  IF condition |");
        System.out.println("            +---------------+");
        System.out.println("              /           \\");
        System.out.println("            true          false");
        System.out.println("             /               \\");
        System.out.println("            v                 v");
        System.out.println("     +-------------+   +-------------+");
        System.out.println("     |   process   |   |   process   |");
        System.out.println("     +-------------+   +-------------+");
        System.out.println("              \\           /");
        System.out.println("               \\         /");
        System.out.println("                v       v");
        System.out.println("                  +-----+");
        System.out.println("                  | END |");
        System.out.println("                  +-----+");



        int x = 5;
        if (x > 0){
            System.out.println("Positive");
        }
        else  if (x < 0){
            System.out.println("Negative");
        }



        /* Nested if */

                System.out.println("                    START");
                System.out.println("                      |");
                System.out.println("                      v");
                System.out.println("              +-----------------+");
                System.out.println("              |  IF condition1  |");
                System.out.println("              +-----------------+");
                System.out.println("                /           \\");
                System.out.println("             true           false");
                System.out.println("              /                \\");
                System.out.println("             v                  v");
                System.out.println("     +-----------------+     +-------------+");
                System.out.println("     |  IF condition2  |     |   process C |");
                System.out.println("     +-----------------+     +-------------+");
                System.out.println("        /           \\");
                System.out.println("     true           false");
                System.out.println("      /               \\");
                System.out.println("     v                 v");
                System.out.println("+-------------+   +-------------+");
                System.out.println("|  process A  |   |  process B  |");
                System.out.println("+-------------+   +-------------+");
                System.out.println("        \\           /");
                System.out.println("         \\         /");
                System.out.println("          v       v");
                System.out.println("            +-----------+");
                System.out.println("            |    END    |");
                System.out.println("            +-----------+");

                int a = 5, b = 6, c = 20;

                if (a > b && a > c){
                    System.out.println(a);
                } else if (b <= c) {
                    System.out.println(c);
                } else if (a > b && a <= c){
                    System.out.println(b);
                } else {
                    System.out.println(a);
                }

    }
}