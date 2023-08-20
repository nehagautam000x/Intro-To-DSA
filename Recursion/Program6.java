// Some Concept to be learn to understand recursion
import java.util.*;
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        fun(n);
    }
    public static void fun(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        // fun(n--);            ----------> will give stack overflow error as it pass the value first then subtract
        fun(--n);             // -----> It subtract the value the pass it
    }
}
