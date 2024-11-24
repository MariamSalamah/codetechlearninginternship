//module 21
//Write an example Code on String Class
import java.lang.String;
public class StringClassExample{
    public static void main(String [] args){
        String s = "Hello World";
        String x = new String("Hi");
        System.out.println("Char found at : " + x.charAt(1));
        System.out.println(s.replace("e","a"));
        System.out.println(x.compareTo(s));
        char [] list1 = {'a', 'p' , 'p' , 'l','e'};
        String list2 = "";
        System.out.println(list2.copyValueOf(list1));
        System.out.println(list2.copyValueOf(list1,2,3));
        String str1 = "What a topic!";
        String str2 = new String("You are right.");
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.concat(str2));


    }
}