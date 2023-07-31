
//Merge two sorted arrays

package Array_and_ArrayList;
import java.util.*;
public class mergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int j = 0; j< n; j++) {
            arr2[j] = sc.nextInt();
        }
        sc.close();
        int[] arr = new int[m+n];
        for(int i=0;i<m;i++)
        {
           arr[i]=arr1[i];
        }
        for(int i=m;i<n+m;i++)
        {
           arr[i]=arr2[i-m];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
