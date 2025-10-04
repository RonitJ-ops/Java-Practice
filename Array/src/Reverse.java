import java.util.*;

public class Reverse
{
    static int[] arr;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        rev();
        System.out.println("Reversed array: " + Arrays.toString(arr));
        sc.close();
    }

    static void rev()
    {
        int temp;
        int n = arr.length - 1;
        for (int j = 0; j < arr.length / 2; j++)
        {
            temp = arr[j];
            arr[j] = arr[n - j];
            arr[n - j] = temp;
        }
    }
}