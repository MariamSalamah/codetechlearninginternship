//module 20
//ANumberAndCharacterClass
public class NumberAndCharacterClass{
    public static void main(String [] args){
        Integer x = 5;
        Integer y = 10;
        Float z = -20.5f;
        Double r = -3000.6;
        Character c = 'c';
        //Number class
        System.out.println(x.equals(y));
        System.out.println(Math.sqrt(x));
        System.out.println(Math.round(5));
        System.out.println(x.compareTo(y));
        //character class
        System.out.println(Character.isLetter(c));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isDigit('#'));


    }
}
