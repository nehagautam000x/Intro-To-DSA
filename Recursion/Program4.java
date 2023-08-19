// Sum of the digits

import java.util.*;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       sc.close();
       int res = digitSum(num);
       System.out.println(res);
    }
    public static int digitSum(int n)
    {
        if(n==0)
            return 0;
        return (n%10)+digitSum(n/10);
    }
}