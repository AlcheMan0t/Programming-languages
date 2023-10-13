package myNumber;
public class myNumber {

	private int num;
	public int num2;
	public myNumber() {
		num=0;
		num2=100;
	}
	int getnum() {
		return num;
		
	}
	int getnum2() {
		return num2;
	}
	
	void setNum(int i) {
		num=i;
		num2=10*i;}
	void description() {
		System.out.println("The value of number 1 is: "+ num);
		System.out.println("The value of number 2 is: "+num2);
		
	}
	 float average () {
		return (num+num2)/2;
	}
	public myNumber (int num, int num2) {
		this.num= num;
		this.num2=num2;
	}

	public static void main (String[] args ) {
		myNumber A=new myNumber ();
		System.out.println(A.getnum());
		A.setNum(10);
		System.out.println(A.getnum());
		System.out.println(A.num2);
		System.out.println(A.average());
	}

}
