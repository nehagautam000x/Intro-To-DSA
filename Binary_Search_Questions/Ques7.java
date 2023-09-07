// count of an element in a sorted array

package Binary_Search_Questions;

import java.util.*;
public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        int last = occurrence(arr, target, false);
        int first = occurrence(arr, target, true);
        System.out.println((last-first)+1);
    }
    public static int occurrence(int[] arr, int target, boolean index)
    {
        int ans = -1;
        int start =0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(target>arr[mid])
                start = mid+1;
            else if(target<arr[mid])
                end = mid-1;
            else{
                ans = mid;
                if(index)
                     end = mid-1;
                else
                    start = mid+1;
            }
        }
        return ans;
    }
}

