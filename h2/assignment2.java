package domasna2;
public interface Flyer{
	default void takeoff() {
		System.out.println("It takes off");
	}
	default void land() {
		System.out.println("It lands");
	}
	default void fly() {
		System.out.println("It flies");
	}
}
class Airplane implements Flyer{
	public void takeoff () {
		System.out.println("Airplane will take off from Skopje Airport");
	}
	public void land () {
		System.out.println("Airplane has just landed at Ohrid Airport");
	}
	public void fly () {
		System.out.println("Airplane flies approx at 10km above sea level");
	}
}
	class Bird implements Flyer{
		public void takeoff () {
			System.out.println("Bird will take off from the nest");
		}
		public void land () {
			System.out.println("Bird has landed on the nest");
		}
		public void fly () {
			System.out.println("Bird flies above the river");
		}
		void buildnest () {
			System.out.println("The bird has built a nest");
		}
		void layeggs () {
			System.out.println("The bird has layed eggs in the nest");
		}
	}
	class Superman implements Flyer {
		public void takeoff () {
			System.out.println("Superman takes off");
		}
		public void land () {
			System.out.println("Superman has landed");
		}
		public void fly () {
			System.out.println("Superman flies like an airplane");
		}
		void leapbuilding () {
			System.out.println("Superman leaps the building like a piece of cake");
		}
		void stopbullet () {
			System.out.println("Superman is bulletproof");
		}
	}
package domasna2;

public class Test {

	public static void main(String[] args) {
		Airplane plane = new Airplane();
		Bird bird= new Bird();
		Superman superman= new Superman();
		Flyer flyer = new Flyer() {
		};
		flyer.fly();
		flyer.takeoff();
		flyer.land();
		plane.takeoff();
		plane.fly();
		plane.land();
		bird.takeoff();
		bird.fly();
		bird.buildnest();
		bird.land();
		bird.layeggs();
		superman.takeoff();
		superman.fly();
		superman.land();
		superman.leapbuilding();
		superman.stopbullet();

	}

}
