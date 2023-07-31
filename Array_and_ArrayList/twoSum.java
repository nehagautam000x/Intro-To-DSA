package Array_and_ArrayList;
import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<size;i++)
        {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                if(i!=j)
               {
                    if(arr[i]+arr[j]==target)
                    {
                        list.add(i);
                        list.add(j);
                        System.out.println(list);
                    }
                }
            }  
        }
    }
}
