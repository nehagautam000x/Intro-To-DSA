package Array_and_ArrayList;
import java.util.*;
public class zerosLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        // for(int i=0;i<size;i++)
        // {
        //     for(int j=0;j<size-1;j++) {
        //         if(arr[i]==0)
        //         {
        //             arr[j+1]=arr[j];
        //             arr[j]=arr[i];
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(arr));
        ArrayList<Integer> ans1=new ArrayList<>();
        ArrayList<Integer> ans2=new ArrayList<>();
        int count=0;
        for(int j=0;j<size;j++)
        {
            if (arr[j]==0)
            {
                count++;
            }
        }
        int z=0;
        for(int k=0;k<size;k++)
        {
            if (k<count)
            {
                ans1.add(0);
            }else if(arr[z]!=0){
                ans2.add(arr[z]);
                           
            }z++;
            
        }
        
        System.out.println(ans1);
        System.out.println(ans2);
        
    }
}
