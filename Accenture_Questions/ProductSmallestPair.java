package Accenture_Questions;

import java.util.*;
public class ProductSmallestPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        int res = productSmallestPair(sum, arr);
        System.out.println(res);
    }
    public static int productSmallestPair(int sum, int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(arr.length==0 || arr.length<2)
            return -1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                 if(i!=j && arr[i]+arr[j]<=sum)
            {
                list.add(arr[i]*arr[j]);
            }
            }
        }
        // System.out.println(list);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)<min)
                min=list.get(i);
        }
        return min;
    }
}
