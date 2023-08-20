// Number is pallindrome or not

import java.util.*;
public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int ans = pallindrome(n);
        if(ans==n)
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static int pallindrome(int n)
    {
        if(n<10)
            return n;
        int power = (int)(Math.log10(n))+1;
        return (n%10)*(int)(Math.pow(10,power-1))+pallindrome(n/10);
    }
}
