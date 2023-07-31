package Array_and_ArrayList;
import java.util.*;
public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        // int max=arr[0];
        // int min=arr[0];
        Arrays.sort(arr);
        System.out.println("Maximum =" + arr[size-1]);
        System.out.println("Minimum =" + arr[0]);
        // for(int i=1;i<size;i++)
        // {
        //     if(arr[i]>max)
        //     {
        //         max=arr[i];
        //     }
        // }
    }
}
