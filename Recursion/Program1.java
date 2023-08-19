// Print the number from n to 1

import java.util.*;
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.close();
        PrintNum(n);
    }
    public static void PrintNum(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        PrintNum(n-1);
    }
}
