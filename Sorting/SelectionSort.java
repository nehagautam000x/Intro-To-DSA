// Selection sort
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<size;i++)
        {
            int updatedLast=arr.length-1-i;
            int maxIndex = getMax(arr,0,updatedLast);
            swap(arr,maxIndex,updatedLast);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int getMax(int[] arr,int start,int last)
    {
        int max = start;
        for(int i=start;i<=last;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[] arr, int first, int last)
    {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
