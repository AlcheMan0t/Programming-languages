import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
    char first = userName.charAt(0);
    System.out.println("The first character is: "+first);
    char last = userName.charAt(userName.length()-1);
    System.out.println("The last character is: "+last);
    char middle = userName.charAt(userName.length()/2);
    System.out.println("The middle character is: "+middle);
    int sum = first+last+middle;
    System.out.println("The sum of these characters is: "+sum);
   if (first>middle && first>last){
       int a = (int)first;
       System.out.println("The highest value has the character: "+first+" with a value of "+a);
   }
   if (middle>first && middle>last){
       int b= (int)middle;
       System.out.println("The highest value has the character: "+middle+" with a value of "+b);
   }
   else {
       int c= (int)last;
       System.out.println("The highest value has the character: "+last+" with a value of "+c);
   }
    }
  }
