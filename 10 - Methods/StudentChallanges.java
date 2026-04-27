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

    public static void main(String[] args)
    {
        if(isPrime(100)){
            System.out.println("it is a prime Num");
        }
        else{
            System.out.println("is not a prime Num");
        }
    }
}