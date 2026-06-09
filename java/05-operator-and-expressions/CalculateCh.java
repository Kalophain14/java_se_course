import java.util.Scanner;

public class CalculateCh
{
    public static void main(String[] args)
    {
        float base, height, area;
        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();

        area = base*height/2;

        System.out.println("Area of a triangle is " +area);
    }
}