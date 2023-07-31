//Arrays list is a dynamic array which is used when we don't know the size of the array

package Array_and_ArrayList;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        //to take input fromt the user
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }

        //to display the output "METHOD:->1"
        System.out.println(list);
        //to display the output "METHOD:->2"
        for (int i = 0; i <size; i++) {
            System.out.println(list.get(i));
        }
        //to display the output "METHOD:->3"
        for(int num:list)
        {
            System.out.println(num);
        }
        sc.close();
    }
}
