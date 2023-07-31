import java.util.*;
public class Half_numbers_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            int numb=1;
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
