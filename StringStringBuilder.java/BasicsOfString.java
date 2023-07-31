// import java.util.*;
public class BasicsOfString {
    public static void main(String[] args) {
        String name="Neha Gautam";
        System.out.println(name.charAt(2)); //to acces the character at particular index of the string
    }
}


// String pool --> It is a separate memory structure inside the heap
// Comparison of Strings in two ways:-
// i) By using (==) operator  -->> If the reference variables points to the same value/ object then it return true otherwise false

// ii) By using .equals function((When you only need to check value))  -->>  checks different objects of same value outside the pool but in heap
