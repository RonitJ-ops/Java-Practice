import java.util.*;
public class Calculator
{
    static int a, b;
    static char ch;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter operator: ");
        ch = sc.next().charAt(0);
        switch (ch)
        {
            case '+':
                System.out.println(a+" + "+b+" = "+(a+b));
                break;
            case '-':
                System.out.println(a+" - "+b+" = "+(a-b));
                break;
            case '*':
                System.out.println(a+" x "+b+" = "+(a*b));
                break;
            case '/':
                System.out.println(a+" / "+b+" = "+(a/b));
                break;
            case '%':
                System.out.println(a+" % "+b+" = "+(a%b));
                break;
            default:
                System.out.println("Wrong input.");
                System.exit(0);
        }
    }
}