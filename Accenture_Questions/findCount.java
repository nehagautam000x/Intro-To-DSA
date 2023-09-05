package Accenture_Questions;

import java.util.*;
public class findCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int num = sc.nextInt();
        int diff = sc.nextInt();
        sc.close();
        int res = FindCount(arr,num,diff);
        System.out.println(res);
    }
    public static int FindCount(int[] arr, int num, int diff)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(Math.abs(arr[i]-num)<=diff)
                count++;
        }
        return count>0?count:-1;
    }
}
