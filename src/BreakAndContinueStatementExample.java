//module 8
//Write a Code in  Java using Break and Continue Statement
// there was a while example also in this module but I did in the past module so
public class BreakAndContinueStatementExample {
    public static void main (String [] args){
        for (int i = 1 ; i <=10 ; i++){
            if(i==4){
                System.out.println("The 4 wouldn't appear beacuse it's continue");
                continue;
            }
            if(i==9){
                System.out.println("Sorry that the program had stopped, and 9 and 10 didn't appear beacuse it's break");
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
