//module 19
//Write an Example Code for Inner Classes
class OuterDemo{
    private class InnerDemo{
        public void printMessage(){
            System.out.println("This is private inner class");
        }
    }

    public void displayInner(){
        InnerDemo object1 = new InnerDemo();
        object1.printMessage();
    }

}
public class InnerClassExample{

    public static void main(String [] args){
        OuterDemo object2 = new OuterDemo();
        object2.displayInner();
    }
}