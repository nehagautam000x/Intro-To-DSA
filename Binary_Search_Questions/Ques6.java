// First and Last Occurence of an element

package Binary_Search_Questions;

import java.util.*;
public class Ques6 {
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
        int[] ans = {-1,-1};
        ans[0] = Occurence(arr, target, true);
        if(ans[0]!=-1)
            ans[1] = Occurence(arr, target, false);
        System.out.println(Arrays.toString(ans));
    }
    public static int Occurence(int[] arr, int target, boolean detect)
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
                if(detect)
                     end = mid-1;
                else
                    start = mid+1;
            }
        }
        return ans;
    }
}
