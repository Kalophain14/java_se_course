/*
Operators & Expression

Increment/Decrememt
post ++
post --
++ pre
-- pre

#Arithmetic operation
PRESCEDENCE Follows
BODMAS
1. B = brackets()
   OF
2. D = Division /
3. M = Multiplication *
4. A = Addition +
5. S = Subraction -

Can be applied on any data type except boolean(true/false)
* multiply
/ division
% modular(remainder)
+ addition
-  substract

#bitwise
&
~
^
:
>>
<<
>>>>

#Relational
< less than
> greater than
>= great than or equal to
<= less than or equal to
== equal to
!= not equal to

#logical
&& and
|| or
! not

in regards to data type predescence
short + short = int
byte + short = int
float + int = float
long + float = float
char + string = int
char + int = int
float + double = double
long + double = double


 */

public class ArithmeticPr
{
    public static void main(String[] args)
    {
        float a = 18.3f, b = 2f;
        float c = (float)a / b; //type casting (float)
        float res = a % b;

        /*
        conversion has to be integer
        byte a = 10;
        short b = 20;
        int c = a + b;
         */

        System.out.println(c);
        System.out.println(res);
    }
}

