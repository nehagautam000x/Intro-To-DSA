// Sum of n natural numbers

import java.util.*;
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int res = Sum(n);
        System.out.println(res);
    }
    public static int Sum(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n+Sum(n-1);
    }
}
