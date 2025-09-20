import java.util.*;
public class PrimeNums
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check:");
        int num = sc.nextInt();
        PrimeNums obj = new PrimeNums();
        if(obj.isPrime(num))
            System.out.println("Prime Number.");
        else
            System.out.println("Not Prime Number.");
    }
    boolean isPrime(int num)
    {
        int c = 0;
        for(int i=1; i<=num; i++)
            if(num%i==0)
                ++c;
        return c == 2;
    }
}
