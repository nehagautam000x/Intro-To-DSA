// Reverse a number


import java.util.*;
public class Program7 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       sc.close();
       int res = reverse(n); 
       System.out.println(res);
    }
    public static int reverse(int n)
    {
       
        if(n<10)
            return n;
        int power = (int)(Math.log10(n))+1;
        return (n%10)*(int)(Math.pow(10,power-1))+reverse(n/10);
    }
}
 