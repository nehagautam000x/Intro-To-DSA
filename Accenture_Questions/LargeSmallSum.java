package Accenture_Questions;

import java.util.*;
public class LargeSmallSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        int res = largeSmallSum(arr);
        System.out.println(res);
    }
    public static int largeSmallSum(int[] arr)
    {
        int sum=0;
        if(arr.length%2==0)
        {
            sum+=arr[arr.length-4];
            sum+=arr[3];
        }
        if(arr.length%2!=0)
        {
            sum+=arr[arr.length-3];
            sum+=arr[3];
        }
        return sum;
    }
}
