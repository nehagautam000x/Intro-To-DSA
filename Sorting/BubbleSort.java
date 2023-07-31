// Bubble sort  ||  Sinking sort  ||  Exchange sort

import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean swapped;
        sc.close();
        for(int i=0;i<size;i++)
        {
            swapped = false;
            for(int j=1;j<size-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program  i.e. break the program
            if(!swapped)
            {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
