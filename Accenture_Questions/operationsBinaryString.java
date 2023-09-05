package Accenture_Questions;

import java.util.*;
public class operationsBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int res = OperationsBinaryString(str);
        System.out.println(res);
    }
    public static int OperationsBinaryString(String str) {
        int ans = str.charAt(0)-'0';
        if(str.length()%2!=1|| str==null || str.charAt(0)=='A' || str.charAt(0)=='B' || str.charAt(0)=='C')
        {
             return -1;
        }
        for(int i=1;i<str.length();i+=2)
        {
            if(str.charAt(i)=='A')
                ans = ans&(str.charAt(i+1)-'0');
            else if(str.charAt(i)=='B')
                ans = ans|(str.charAt(i+1)-'0');
            else
                ans = ans^(str.charAt(i+1)-'0');
        }
        return ans;
    }
}
