package Searching;
import java.util.*;
public class leetcode744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char[] arr = new char[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.next().trim().charAt(0);
        }
        System.out.print("Enter the Target number to be searched:- ");
        char target = sc.next().charAt(0);
        sc.close();
        Arrays.sort(arr); //When the array is sorted in ascending order
        System.out.println(LeetCode744(arr,target));
    }
    public static char LeetCode744(char[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target>=arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return arr[start%arr.length];
    }
}
