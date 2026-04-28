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

    /* Using the methods*/
    public static void main(String[] args)

    
    {
        if(isPrime(100)){
            System.out.println("prime Num");
        }
        else{
            System.out.println("not a prime Num");
        }
    }
}
