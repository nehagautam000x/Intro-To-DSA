// Product of the digits

import java.util.*;
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       sc.close();
       int res = digitSum(num);
       System.out.println(res);
    }
    public static int digitSum(int n)
    {
        if(n%10 == n)
            return n;
        return (n%10)*digitSum(n/10);
    }
}