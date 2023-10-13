
public class Vehicle {
static class Car {
	private String type;
	private int no_seats;
	private String fuel;
	private String body_color;
	Car(){
		type="";
		no_seats=0;
		fuel="";
		body_color="";
		
	}
	Car (String type, int seats , String fuel, String body_color){
		this.type=type;
		this.no_seats=seats;
		this.fuel=fuel;
		this.body_color=body_color;
		
	}
	public String getType() {
		return type;
	}
	public void setType (String type) {
		this.type=type;
	}
	public String getColor () {
		return body_color;
	}
	public void setColor() {
		this.body_color=body_color;
	}
	public String getSeats() {
		return no_seats;
	}
	public void setSeats() {
		this.no_seats=no_seats;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel() {
		this.fuel=fuel;
	}
	public void Spec() {
		System.out.println( no_seats);
		System.out.println( type);
		System.out.println( fuel);
		System.out.println( body_color);
	}

	public static void main(String[] args) {
		Car kola= new Car("Mercedes", 4,"95","crn" );
		kola.Spec();
		
		Car kola2=new Car("VW",6,"95","bel");
		kola2.Spec();
if (kola.no_seats > kola2.no_seats) {
	System.out.println("The first car has more seats");
}
	else {
		System.out.println("The second car has more seats");
	}

	}
}

}
