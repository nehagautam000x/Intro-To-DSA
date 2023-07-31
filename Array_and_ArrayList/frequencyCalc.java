package Array_and_ArrayList;
import java.util.*;
public class frequencyCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        boolean[] visited = new boolean[size];
        for (int i = 0; i < size; i++) {
            int count=0;
            if(visited[i]==true)
                continue;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j])
                {
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+ " " + count);
        }
    }
}


