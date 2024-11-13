//module 16
//Write a code on pass Array as Return Value in Java
public class ReturnArray {
    public static void printArray(int [] arr){
        for (int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");}
    }
    public static int[] reverse(int [] arrReversed){
        int [] result = new int [arrReversed.length];
        int len = arrReversed.length;
        for(int i=0 , j = len-1 ; i<len; i++,j-- ){
            result[j] = arrReversed[i];
        }
        return result;
    }

    public static void main (String [] args){
        System.out.println("Array before reverse");
        printArray(new int [] {1,3,7});
        System.out.println();
        System.out.println("Array after reverse");
        printArray(reverse(new int [] {1,3,7}));
    }
}
