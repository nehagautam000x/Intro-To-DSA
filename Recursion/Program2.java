// Factorial of a number

import java.util.*;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int res = fact(n);
        System.out.println(res);
    }
    public static int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
}
