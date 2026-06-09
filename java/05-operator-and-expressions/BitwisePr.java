public class BitwisePr {
    public static void main(String[] args)
    {
        //int x = 0b1010;
        //int y = 0b0110;
        //int z;
        //z = x ^ y;

        int x = -0b1000, z = x >>> 2;
        System.out.println(String.format("%s",Integer.toBinaryString(z)));
        System.out.println(String.format("%32s",Integer.toBinaryString(x)));
    }
}