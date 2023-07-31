package Array_and_ArrayList;
import java.util.*;
public class reverse_arrayList {

    //by using an extra ArrayList
    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list)
    {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i <list.size(); i++) {
            newList.add(list.get(list.size()-1-i));
        }
        return newList;
    }

    //by using temp variable
    public static ArrayList<Integer> revArrayList(ArrayList<Integer> list)
    {
        int temp;
        for (int i = 0; i <list.size()/2; i++) {
            temp=list.get(i);
            list.set(i,list.get(list.size()-1-i));
            list.set(list.size()-1-i,temp);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int size = sc.nextInt();
        for (int i = 0; i <size ; i++) {
            list.add(sc.nextInt());
        }
        ArrayList<Integer> res = reverseArrayList(list); 
        System.out.println(res);

        ArrayList<Integer> res2 = revArrayList(list); 
        System.out.println(res2);

         //by using collection
         Collections.reverse(list);
         System.out.println(list);
        sc.close();
    }
}
