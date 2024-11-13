//module 6
//Write an Example Code on Switch Statement
public class SwitchExample {
    public static void main (String [] args){
        char grade = 'A';
        switch(grade){
            case 'F' :
                System.out.println("Fail");
                break;
            case 'D' :
                System.out.println("Fair");
                break;
            case 'C' :
                System.out.println("Good");
                break;
            case 'B' :
                System.out.println("Very Good");
                break;
            case 'A' :
                System.out.println("Excellent");
                break;
            default :
                System.out.println("Not match, please try again");
        }
    }
}
