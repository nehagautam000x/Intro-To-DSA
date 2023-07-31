package Array_and_ArrayList;
import java.util.*;
public class Now {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
            ArrayList<Integer> list=new ArrayList<>();
            for (int j = 0; j < size; j++)
            {
                list.add(arr[j]);
            }
            for (int k = 0; k < size; k++)
            {
                for (int f = 0; f < size; f++)
                {
                    if (arr[k]==arr[f])
                    {
                        list.remove(arr[k]);
                    }
                }
            }


    }
}

