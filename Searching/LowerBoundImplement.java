package Searching;
// Implement Lower Bound

// https://www.codingninjas.com/studio/problems/lower-bound_8165382?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0


// Solution -1

    public class Solution {
        public static int lowerBound(int []arr, int n, int x) {
            // Write your code here
            int start = 0;
            int end = arr.length-1;
            int ans = n;
            while(start<=end)
            {
                int mid = start + (end-start)/2;
                if(arr[mid]>=x)
                {
                    ans=mid;
                    end=mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
            return ans;
        }
    }

// Solution-2


public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int start = 0;
        int end = arr.length-1;
        // int ans = n;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]>x)
            {
                end=mid-1;
            }
            else if(arr[mid]<x)
            {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}

