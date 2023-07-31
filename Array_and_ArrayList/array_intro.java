package Array_and_ArrayList;
import java.util.*;
public class array_intro {
    public static void change(int[] arr)
    {
        arr[0]=99;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //This is array of primitives

        System.out.print("Enter the size of the array:-> ");

        //taking the size of the array from the user
        int size = sc.nextInt();

        //Initilization and decalaration of the array 
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++) // variable_name.length -> will give the size of the array
        {
            arr[i]=sc.nextInt();
        }

        //printing the array values through for loop
        for(int i=0;i<arr.length;i++) 
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //printing the values of the array through "FOR EACH" loop
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        //printing the array values with just one line in list format
        System.out.println(Arrays.toString(arr));

        //Array of objects
        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
        }

        //Changing the value of array through a function change
        change(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
