import java.util.Scanner;
public class BInSearch
{
    static int[] arr;
    public static void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int len = sc.nextInt();
        System.out.println("Enter sorted array:");
        int i;
        arr = new int[len];
        for(i = 0; i < len; i++)
            arr[i] = sc.nextInt();
    }
    static int Search(int t)
    {
        int start = 0, end = arr.length-1, mid;
        while(start <= end)
        {
            mid = start + (end - start)/2;
            if(t == arr[mid])
                return mid;
            else if(t > arr[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        input();
        System.out.println("Enter the number to search: ");
        int x = sc.nextInt();
        System.out.println("Element found at index: " + Search(x));
    }
}