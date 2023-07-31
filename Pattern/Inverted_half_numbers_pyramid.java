import java.util.*;
public class Inverted_half_numbers_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            int numb=1;
            for(int j=i;j<=row;j++)
            {
                System.out.print(numb + " ");
                numb++;
            }
            System.out.println();
        }
        sc.close();
    }
}
