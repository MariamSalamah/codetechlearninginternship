//module 14
//Write a code on Passing arguments by Value
public class ArgumentsByValue {
    public static void swapping(int n1 , int n2){
        int n3 = n1;
        n1 = n2;
        n2 = n3;
        System.out.println("After Swapping : a = " + n1 + " b = " + n2 );
    }
    public static void main(String [] args){
        int a = 30;
        int b = 40;
        System.out.println("Before Swapping : a = " + a + " b = " + b );
        swapping(a,b);
    }
}
