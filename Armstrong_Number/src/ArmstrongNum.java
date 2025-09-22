import java.util.*;
public class ArmstrongNum
{
    static int num = 0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check:");
        num = sc.nextInt();
        if(isArmstrong())
            System.out.println("Armstrong number.");
        else
            System.out.println("Not an Armstrong number.");
    }
    static boolean isArmstrong()
    {
        int n = num;
        int rem = 0, sum = 0, c = 0;
        c = (n+"").length();
        while(n!=0)
        {
            rem = n%10;
            sum += (int)Math.pow(rem,c);
            n /= 10;
        }
        return sum==num;
    }
}
