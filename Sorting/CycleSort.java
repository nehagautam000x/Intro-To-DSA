// Cycle Sort

// Pattern or Trick : When you are given numbers in the range from 1 to N 

import java.util.*;
public class CycleSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        int i=0;
        while(i<size)
        {
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex])
            {
                int temp = arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}