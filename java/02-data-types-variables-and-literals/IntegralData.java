/*
CPU example

64 bit
32 bit
16 bit

Binary

Byte = A number can be stored in 7 bit
7 6 5 4 3 2 1 0
0 0 0 0 0 0 0 0 = +
  1 1 1 1 1 1 1 = Largest value
One of the bit is reserved as Sign bit and it decide what kind of data is going to be stored -/+,
0 = +
1 = -

if the first digit is - and the data stored will be -


*/

public class IntegralData {
    public static void main(String[] args) {
        //int x = -5;
        //System.out.println(Integer.toBinaryString(x));
        for (char c = 0x90; c <= 0x097; c++) {
            System.out.println(c + " ");
        }
    }
}