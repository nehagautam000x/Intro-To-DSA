
//Function OverLoading occurs when the program has two function with same name but with different arguments or with different type of arguments or with different return type of the function or method
// It decides at the compile time which function is to be called or run

package functions;

public class functionOverloading {
    public static void main(String[] args) {
        int a=12;
        int b=13;
        int c=90;
        System.out.println(add2(a,b));
        System.out.println(add2(a,b,c));
    }
    public static int add2(int a, int b)
    {
        return a+b;
    }
    public static int add2(int a, int b, int c)
    {
        return a+b+c;
    }
}
