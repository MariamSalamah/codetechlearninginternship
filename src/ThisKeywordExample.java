//module 18
//Write a code on THIS Keyword in Java
public class ThisKeywordExample {
    int num = 10;
    ThisKeywordExample(){
        System.out.println("Example on this keyword");
    }
    ThisKeywordExample(int num){
        this();
        this.num = num;
    }
    public void greet (){
        System.out.println("Welcome to codetech learning");
    }
    public void print (){
      int num = 7;
        this.greet();
        System.out.println("Local Variable is " + num);
        System.out.println("Instance Variable is " + this.num);



    }


    public static void main (String [] args){
      ThisKeywordExample object1 = new ThisKeywordExample();
      object1.print();
        System.out.println();
      ThisKeywordExample object2 = new ThisKeywordExample(24);
      object2.print();

    }
}
