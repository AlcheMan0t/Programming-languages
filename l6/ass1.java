package class77;

interface Two_D_Shape {

    // Constant

    float PI = 3.14f;



    // Methods

    void parameters();

    float area();

    float perimeter();

}

interface Three_D_Shape {

    // Method

    float volume();

}

class Triangle implements Two_D_Shape

{

	private float sideA, sideB, sideC,height;

	public Triangle (float sideA,float sideB,float sideC,float height)

	{

		this.sideA=sideA;

		this.sideB=sideB;

		this.sideC=sideC;

		this.height=height;

		System.out.println("A new triangle has been created");

	}



	@Override

	public void parameters() {

		// TODO Auto-generated method stub

		

	}



	@Override

	public float area() {

		// TODO Auto-generated method stub

		return 0;

	}



	@Override

	public float perimeter() {

		// TODO Auto-generated method stub

		return 0;

	}

	

	public boolean rectangular()

	{

		return Math.pow(sideA,2)+Math.pow(sideB, 2)==Math.pow(sideC, 2);

	}

}

class Sphere implements Two_D_Shape, Three_D_Shape

{

	private double radius;

	public Sphere (double radius)

	{

		this.radius=radius;

		System.out.println("A new sphere has been created");

	}



	@Override

	public float volume() {

		// TODO Auto-generated method stub

		return 0;

	}



	@Override

	public void parameters() {

		// TODO Auto-generated method stub

		

	}



	@Override

	public float area() {

		// TODO Auto-generated method stub

		return 0;

	}



	@Override

	public float perimeter() {

		// TODO Auto-generated method stub

		return 0;

	}

	

}

public class ass1 {



	public static void main(String[] args) {

		Triangle T1=new Triangle(3,5,6,3);

		Sphere B1=new Sphere(4);

		Two_D_Shape T2=new Triangle(8,2,10,16);

		Two_D_Shape B2=new Sphere(3);

		Three_D_Shape B3=new Sphere(7);

		

		T1.parameters();

        System.out.println("Area of T1: " + T1.area());

        System.out.println("Perimeter of T1: " + T1.perimeter());

        System.out.println("Is T1 rectangular? " + T1.rectangular());

        System.out.println("Volume of B1: " + B1.volume());



        T2.parameters();

        System.out.println("Area of T2: " + T2.area());

        System.out.println("Perimeter of T2: " + T2.perimeter());



        B2.parameters();

        System.out.println("Area of B2: " + B2.area());

        System.out.println("Perimeter of B2: " + B2.perimeter());



        System.out.println("Volume of B3: " + B3.volume());

	}



}
