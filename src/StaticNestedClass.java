//module 20
//StaticNestedClass
public class StaticNestedClass {
    private static class NestedClass {
        public void display(){
            System.out.println("This is a static nested method");
        }

    }

    public static void main(String [] args){
        StaticNestedClass.NestedClass object1 = new StaticNestedClass.NestedClass();
        object1.display();
    }

}
