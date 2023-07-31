

public class StringOperations {
    public static void main(String[] args) {
        System.out.println('a'+'b');  //195
        System.out.println("a"+"b");  //ab
        System.out.println('a'+3);  //100
        System.out.println((char)('a'+3));  //d
        System.out.println("a"+1);   //a1
        System.err.println('a'+"a");  //aa

        
    }
}

//NOTE:-->
// (+) operator is only defined for the primitives and when it is with the String
// If we try to concatenate other datatypes like array or array list it will produce error. And if in between there is string somewhere concatenated then it will not generate error.