//module 4
//Write a code in Java using Logical Operators
//Write a code in Java using Conditional Operators
public class LogicalAndConditionalOperators {
    public static void main (String [] args){
        boolean a = false ;
        boolean b = true ;
        System.out.println("Logical Operators");
        System.out.println(" a && b " + (a&&b));
        System.out.println(" a || b " + (a||b));
        System.out.println(" !a " + (!a));

        System.out.println("Conditional Operators");
        int x , y ;
        y = 10 ;
        x = (y==1) ? 15 : 5 ;
        System.out.println(" x =  " + x);
        x = (y==10) ? 15 : 5 ;
        System.out.println(" x =  " + x);

    }
}
