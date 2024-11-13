//module 13
//Write a code on Access and Non Access Modifiers in Java
public class CarAccessNonAccessModifiers {
    public String color = "black";
    int mileage = 20;
    protected void display (){
        System.out.println("color : " + color + " mile age : " + mileage);

    }
    public void ownerDetails(){
        System.out.println("This car is brought by : ");
    }

    public static void main (String [] args){
        CarAccessNonAccessModifiers car1 = new CarAccessNonAccessModifiers();
        car1.display();
    }
}
