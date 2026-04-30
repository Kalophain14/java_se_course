public class StudentChallanges
{
    /*Find Prime number*/
    static boolean isPrime(int n)
    {
        for(int i =2;i<n;i++)
        {
            if(n%i==0)
                return false;
        } return true;
    }

    /*Find HighestCommonNumbers of 2 numbers*/

    static int HCG(int m, int n)
    {
        while (m != n) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m;
            }
        }
        return n;
    }

    /* Using the methods*/
    public static void main(String[] args)
    {
        //PrimeMethod Calling
        if(isPrime(100)){
            System.out.println("prime Number");
        }
        else{
            System.out.println("not a prime Number");
        }

        //HCG MethodCalling
        System.out.println("The highest number is: " + HCG(50,15));
    }
}


