import java.util.Random;
public class Main {
     public static void main(String[] args){
    Random random = new Random();
    double number=random.nextDouble() * 100;
    int number2=(int)number;
    System.out.println("The number is: " + number);
    double decimals= number-number2;
    System.out.println("The integer part is: "+ number2 );
    System.out.println("The decimal part is: " + decimals);
    System.out.println("The character for the number "+number2+" is " + (char)number);
}
}
