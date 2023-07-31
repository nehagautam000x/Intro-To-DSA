package Array_and_ArrayList;
import java.util.*;
public class removeDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        dupRemove(arr);
    }
    public static void dupRemove(int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(list.contains(arr[i]))
                continue;
            else
                list.add(arr[i]);
        }
        System.out.println(list);
    }
}
