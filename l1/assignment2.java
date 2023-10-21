import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter name :");
    String name = myObj.nextLine();
    System.out.println("Enter salary :");

    Integer salary = myObj.nextInt();
    
    System.out.println("The employee: "+name+ " has a gross salary of: " + salary); 
 double tax=salary * 0.284;
    double personaltax;
    if (salary - tax - 7000 > 0){
        personaltax=(salary-tax-7000)*0.10;
    }
    else {
        personaltax=0;
    }
    System.out.println("State tax is: " + (int)tax);
    System.out.println("Personal tax is :"+(int)personaltax);
  }
}
