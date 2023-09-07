// Order Agnostic Binary Search(When we don't know the order in which the array is sorted)

package Binary_Search_Questions;

import java.util.*;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        System.out.println(binarySearch(arr,target));
    }
    public static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        if(arr[start]<arr[end])
        {
            while(start<=end)
            {
                int mid = start + (end-start)/2;
                if(arr[mid]==target)
                    return mid;
                else if(arr[mid]<target)
                    start = mid+1;
                else
                    end = mid-1;
            }
        }
        else{
            while(start<=end)
            {   
                int mid = start + (end-start)/2;
                if(arr[mid]==target)
                    return mid;
                else if(arr[mid]<target)
                    end = mid-1;
                else
                    start = mid+1;
            }
        }
        return -1;
    }
}
