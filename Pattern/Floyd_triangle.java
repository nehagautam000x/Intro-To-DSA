import java.util.*;
public class Floyd_triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int numb=1;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(numb + " ");
                numb++;
            }
            System.out.println();
        }
        sc.close();
    }
}
