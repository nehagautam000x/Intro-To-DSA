import java.util.*;
public class Inverted_half_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=row;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
