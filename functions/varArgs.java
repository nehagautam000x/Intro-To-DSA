// Varibale Length Arguments

package functions;
import java.util.*;
public class varArgs {
    public static void main(String[] args) {
        fun();
        multiple(2,3,"Neha","Rohit","Kunal","Aparna");
    }

    //It is used for variable length arguments means when we don't the exact no of srguments to be passed into the method or function
    public static void fun(int ...v) 
    {
        System.out.println(Arrays.toString(v));
    }

    // In this function the variable length Argument should be at the last not in the middle and not at the first
    public static void multiple(int a, int b, String ...v)
    {
        System.out.println(a + " "+ b+ " "+ Arrays.toString(v));
    }

}
