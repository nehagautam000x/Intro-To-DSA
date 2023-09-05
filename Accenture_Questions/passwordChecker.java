package Accenture_Questions;

import java.util.*;
public class passwordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int res = PasswordChecker(str);
        System.out.println(res);
    }
    public static int PasswordChecker(String str)
    {
        int num=0;
        int cap=0;
        if(str.length()<4)
            return 0;
        if(str.charAt(0)>='0' && str.charAt(0)<='9')
            return 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ' || str.charAt(i)=='/')
                return 0;
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
                num++;
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                cap++;
        }
        if(num>0 && cap>0)
            return 1;
        else 
            return 0;
    }
}
