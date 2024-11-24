//module 22
//Write an example Code on  Time Delay
import java.util.*;
public class TimeDelayExample {
    public static void main (String [] args) {
        try{
            System.out.println(new Date() + "\n");
            Thread.sleep(1000);
            System.out.println(new Date() + "\n");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
