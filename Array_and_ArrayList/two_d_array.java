package Array_and_ArrayList;
import java.util.*;
public class two_d_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:->");
        int row =sc.nextInt();
        System.out.print("Enter the number of columns:->");
        int col =sc.nextInt();
        int[][] arr = new int[row][col]; //here it is not necessary to specify column also

        /*
        int[][] arr = {
            {12, 13, 14},
            {45, 56},
            {12, 45 67, 23, 67, 78},
        }
        */
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");  
            }
            System.out.println();
        }

        //printing using "Arrays.toString"
            System.out.println(Arrays.deepToString(arr));
 
        // printing using "FOR EACH" loop
        for(int[] num:arr)
        {
            System.out.println(Arrays.toString(num));
        }
        sc.close();
    }
}
