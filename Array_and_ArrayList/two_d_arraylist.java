package Array_and_ArrayList;

import java.util.*;

public class two_d_arraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        //Initilization
        for (int i = 0; i <size ; i++) {
            list.add(new ArrayList<>());
        }

        //Adding elements to the newly created list inside a list
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
        sc.close();
    }
}
