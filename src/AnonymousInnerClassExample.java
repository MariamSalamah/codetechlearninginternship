//module 19
//AnonymousInnerClass
abstract class AnonymousInnerClass{
    public abstract void display();
}


public class AnonymousInnerClassExample {
    public static void main (String [] args){
        AnonymousInnerClass object1 = new AnonymousInnerClass() {
            @Override
            public void display() {
                System.out.println("This is an Anonymous Inner class");
            }
        };
        object1.display();
    }
}
