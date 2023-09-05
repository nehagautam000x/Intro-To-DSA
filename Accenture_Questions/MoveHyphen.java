
import java.util.*;
public class MoveHyphen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = moveHyphen(str);
        System.out.println(res);
    }
    public static String moveHyphen(String str)
    {
        String strRes = "";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='-');
                strRes+=str.charAt(i);
        }
    }
}
