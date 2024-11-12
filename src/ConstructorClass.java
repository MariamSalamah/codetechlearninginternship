//package codetechinternship;
public class ConstructorClass {
    int x ;
    ConstructorClass(){
        x = 10;
    }

public static void main(String [] args){
    ConstructorClass c1 = new ConstructorClass();
    ConstructorClass c2 = new ConstructorClass();
    System.out.println(c1.x +" " + c2.x);
}
}