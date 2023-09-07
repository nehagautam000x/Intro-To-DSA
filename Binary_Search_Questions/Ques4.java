// First Occurence of an element

package Binary_Search_Questions;

import java.util.*;
public class Ques4 {
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
        System.out.println(Occurence(arr, target));
    }
    public static int Occurence(int[] arr, int target)
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
                end = mid-1;
            }
        }
        return ans;
    }
}
