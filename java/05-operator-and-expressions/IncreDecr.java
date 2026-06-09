/*
increment ++
decrement --

post incr ++ (x++)
post decr -- (x--)

++ pre incr (++x)
-- pre decr (--x)

byte x = 4;
x++; // increase the value by 1
sout(x);

float x = 5.5;
x--; // decrease the value by 1
sout(x);

int x = 5;
++x; increse the value by 1 and add it to

char x = 'A';
--x
sout(x);

 */

public class IncreDecr
{
    public static void main(String[] args)
    {
        int x = 26, y = 4, z;
        z = 2*x++ + 3 * ++y; //x = 2*26 + 3*5 (4 becomes 5 after ++4)
        System.out.println(z);
    }
}