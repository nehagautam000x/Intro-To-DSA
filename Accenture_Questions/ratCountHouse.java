package Accenture_Questions;
import java.util.*;
public class ratCountHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int amt = r*unit;
        int ans = RatCountHouse(amt, arr);
        System.out.println(ans);
    }
    public static int RatCountHouse(int amt, int[] arr)
    {
        int count=0;
        int sum=0;
        if(arr.length==0 || arr == null)
            return -1;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            count++;
            if(sum>=amt)
            {
                return count;
            }
        }
        return 0;
    }
}
