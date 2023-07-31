package Searching;
import java.util.*;
public class floorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the Target number to be searched:- ");
        int target = sc.nextInt();
        sc.close();
        Arrays.sort(arr); //When the array is sorted in ascending order
        System.out.println(CeilNumber(arr,target));
    }
    static int CeilNumber(int[] arr, int target)
    {
        int start=0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
