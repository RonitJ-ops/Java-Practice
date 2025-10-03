import java.util.*;
public class Max
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        System.out.println("Enter elements:");
        for(i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int max = arr[0];
        for(i=0; i<n; i++)
            if(max<arr[i])
                max = arr[i];
        System.out.println("Maximum element = "+max);
    }
}
