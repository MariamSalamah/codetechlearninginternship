//module 16
//Write a code on  pass Array as Methods Arguments in Java
public class PassArrayAsMethodsArguments {
    public static void printArray(int [] arr){
        for (int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main (String [] args){
        printArray(new int [] {1,3,7});
    }
}
