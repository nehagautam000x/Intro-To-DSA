package functions;
// import java.util.*;
public class Shadowing {
    static int x=90; //this will be shadowed at line no. 8
    public static void main(String[] args) {
        System.out.println(x);
        int x=40;  //the class variable at line no.4 will be shadowed by this
        System.out.println(x);
        func();
    }
    public static void func()
    {
        System.out.println(x);
    }
}


// Shadowing

// A computer programming phenomenon in which a variable declared in one scope (like decision block, method, or inner class) has the same name as another declaration of the enclosing scope.