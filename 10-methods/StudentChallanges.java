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

    /*Find Max Element in an Array*/

    static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
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

        //HCG Method Calling
        System.out.println("The highest number is: " + HCG(50,15));

        //MaxArray Calling
        int[] arr = {3, 7, 1, 6, 12, 129};
        System.out.println("Maximum number: " + maxArray(arr));
    }
}


