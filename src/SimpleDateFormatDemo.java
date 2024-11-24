//module 22
//Write an example Code on Formatting Date and Time

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String [] args){
        //TODO Auto generated method stub

        Date now = new Date();
        System.out.println(now);

        SimpleDateFormat dateNow = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println(dateNow.format(now));

        // display time and date

        String str = String.format("Current Date/Time : %tc" , now);
        System.out.println(str);
        System.out.println();

        // display time and date using $ sign

        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:",now);
        System.out.println();

        // display time and date using < sign

        System.out.printf("%s %tB %<te, %<tY","Due date:",now);

    }
}
