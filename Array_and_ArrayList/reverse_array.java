package Array_and_ArrayList;
import java.util.*;
public class reverse_array {
    //by using temporary variable
    public static int[] reverseArray(int[] arr)
    {
        int temp;
        for (int i = 0; i < arr.length/2; i++) {      //This function changes the original array 
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }

    //by using another list 
    public static int[] revArray(int[] arr)
    {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {     //This function doesn't make any changes to the original array
            newArr[i]=arr[arr.length-1-i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        
        int[] res = reverseArray(arr);
        System.out.println(Arrays.toString(res));

        int[] res2 = revArray(arr);
        System.out.println(Arrays.toString(res2));
        sc.close();
    }
}
