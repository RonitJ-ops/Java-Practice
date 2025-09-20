import java.util.Scanner;
public class MenuBased extends Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Menu:\nPress 1 for Armstrong number check.\nPress 2 for Prime number check.\nPress 3 to open calculator.");
        System.out.println("Enter choice:");
        ch = sc.nextInt();
        MenuBased obj = new MenuBased();
        switch(ch)
        {
            case 1:
            {
                System.out.println("Enter number to check for Armstrong:");
                int num = sc.nextInt();
                if (obj.isArmstrong(num))
                    System.out.println("Armstrong number.");
                else
                    System.out.println("Not an Armstrong number.");
                break;
            }
            case 2:
            {
                System.out.println("Enter number to check for Prime:");
                int num = sc.nextInt();
                if(obj.isPrime(num))
                    System.out.println("Prime number.");
                else
                    System.out.println("Not a Prime number");
                break;
            }
            case 3:
            {
                System.out.println("Opening Calculator...");
                //Calculator ob = new Calculator();
                Calculator.main(new String[] {""});
                break;
            }
        }
    }
    boolean isArmstrong(int num)
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
    boolean isPrime(int num)
    {
        int c = 0;
        for(int i=1; i<=num; i++)
            if(num%i==0)
                ++c;
        return c == 2;
    }
}
