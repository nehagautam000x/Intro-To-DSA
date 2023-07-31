package functions;
import java.util.*;
public class Swap {
    public static void swap(int num1, int num2)
    {
        int temp = num1;
        num1=num2;
        num2=temp;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        swap(num1, num2);
        System.out.println(num1 + " " + num2);
        sc.close();
    }
}



// Notes:- > 
// For Primitives it is just by passing the value  --> this doesn't lead to the change in original variables
// And for Objects it just passing of the "reference variable"  --> This lead to change in original variables

// Point to be noted ---->
// Anything that is initilized outside the block can be used and modify inside the another block as well but but
// anything that is initilized inside the block can't be used outside but can be initilized outside again.