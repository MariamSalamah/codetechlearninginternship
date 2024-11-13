//module 10
//Write a code in java using Class/Static Variables

public class StaticVariables {
    static String sum = "Sum = " ;
    static String diff = "Diff= " ;
    public static void main (String [] args){

        int x = 10;
        int y = 20;
        int s = x + y ;
        int d = y - x ;
        System.out.println(sum+s);
        System.out.println(diff+d);


    }
}
