import java.util.Arrays;

public class StrBuilder {
    public static void main(String[] args) {

        //Syntax
        //StringBuilder build = new StringBuilder();
        String name = "Neha Gautam";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.split(" ")));
        StringPalindrome("abcdcba");
    }

    public static void StringPalindrome(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("true");
            return;
        }

        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
