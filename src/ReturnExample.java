//module 14
//Write a code on Return Keyword
public class ReturnExample {
    public static int returnEmployeeId(){
        int employeeid = 3678;
        return employeeid;
    }
    public static void main(String [] args){
        int eID = returnEmployeeId();
        System.out.println("Id is : " + eID);
    }
}
