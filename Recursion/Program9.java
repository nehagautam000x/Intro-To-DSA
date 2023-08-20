// Count number of zeros

// import java.util.*;
// public class Program9 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.close();
//         int res = count(n);
//         System.out.println(res);
//     }
//     public static int count(int n)
//     {
//         int num = 0;
//         if(n==0)
//             return 0;
//         int rem = n%10;
//         if(rem==0)
//            num++;
//         return num + count(n/10);
//     }
// }


// 2nd method

import java.util.*;
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();   
        System.out.println(count(n));
    }
    public static int count(int n)
    {
        return helper(n,0);
    }
    public static int helper(int n, int c)
    {
        if(n==0)
            return c;
        int rem = n%10;
        if(rem==0)
            return helper(n/10, c+1);
        return helper(n/10, c);
    }
}