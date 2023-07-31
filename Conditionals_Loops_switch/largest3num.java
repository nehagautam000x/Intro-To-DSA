package Conditionals_Loops_switch;
import java.util.*;
public class largest3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();
        int max = num1;
        if(max>num2)
            max=num2;
        if(max>num3)
            max=num3;
        System.out.println("The maximum number is:- "+ max);

        
    }
}
