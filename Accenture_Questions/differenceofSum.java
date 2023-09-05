package Accenture_Questions;

import java.util.*;
public class differenceofSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        int res = DifferenceofSum(n,m);
        System.out.println(res);        
    }
    public static int DifferenceofSum(int n, int m)
    {
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=m;i++)
        {
            if(i%n!=0)
                sum1+=i;
            else
                sum2+=i;
        }
        return sum1-sum2;
    }
}
