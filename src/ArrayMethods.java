import java.util.Arrays;

//module 15
//Write a code on Array Methods in Java
public class ArrayMethods {
    public static void main(String [] args){
        int [] arrayNumbers = {6,1,7,2,4,5,3};
        System.out.println("Array before sorting : ");
        for (int i = 0 ; i<= arrayNumbers.length-1 ; i++){
            System.out.print(arrayNumbers[i]);

        }
        System.out.println();
        Arrays.sort(arrayNumbers);

        System.out.println("Array after sorting : ");
        for (int i = 0 ; i<= arrayNumbers.length-1 ; i++){
            System.out.print(arrayNumbers[i]);
        }


    }
}
