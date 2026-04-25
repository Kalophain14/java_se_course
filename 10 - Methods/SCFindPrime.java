public class SCFindPrime
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

    public static void main(String[] args)
    {
        if(isPrime(19))
            System.out.println("it is a primeNumber");
        else
            System.out.println("is not a primeNumber");
    }
}