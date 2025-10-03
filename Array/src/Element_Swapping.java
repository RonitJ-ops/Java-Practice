import java.util.*;
public class Element_Swapping
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        System.out.println("Enter elements:");
        for(i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter index of elements to swap: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Swapped array: ");
        swap(arr, a, b);
    }
    static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        System.out.println(Arrays.toString(arr));
    }
}