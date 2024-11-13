//package codetechinternship;
//module 17
//Write a code on Constructor in Java
//Write a code on Parametrized Constructor in Java

public class ConstructorClass{
    int x ;
    ConstructorClass(){
        x = 10;
    }
    ConstructorClass(int i){
        x = i;
    }

    public static void main(String [] args){
        ConstructorClass c1 = new ConstructorClass();
        ConstructorClass c2 = new ConstructorClass();
        System.out.println(c1.x +" " + c2.x);

        ConstructorClass c3 = new ConstructorClass(20);
        ConstructorClass c4 = new ConstructorClass(30);
        System.out.println(c3.x +" " + c4.x);
    }
}