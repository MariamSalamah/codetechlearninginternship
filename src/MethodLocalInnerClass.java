//module 19
//Write an Example Code for  Method- Local  Inner Classes in Java
public class MethodLocalInnerClass{
    int number = 20;
    public void methodDemo(){
        class InnerDemo{
            public void displayMessage(){
                System.out.println("This is method-local inner class and the num variable is " + number);
            }
        }
        InnerDemo object1 = new InnerDemo();
        object1.displayMessage();
    }
    public static void main(String [] args) {
        MethodLocalInnerClass object2 =  new MethodLocalInnerClass();
        object2.methodDemo();
    }
}