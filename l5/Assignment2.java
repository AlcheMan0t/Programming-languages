package Lecture5s;



public class Lecture5s {

	static class egg{

		void SHcat() {

			System.out.println(category);

		}

		int category;

		public egg() {

		}

		public egg(int c) {

			category=c;

		}

		void EGG() {

			System.out.println("Each egg has an albumen and a yolk");

		}

		void print() {

			System.out.println("The egg is a nutritional product");

		}

	}

	static class ostrich_egg extends egg{

		public ostrich_egg(int c) {

			super(c);

			System.out.println("");

		}

		void EGG() {

			System.out.println("The albumen and yolk of an OSTRICH egg are the largest");

		}

	}



	public static void main(String[] args) {

		egg henEgg = new egg();

		ostrich_egg ostrichEgg = new ostrich_egg(1);



		henEgg.EGG();

		henEgg.print();



		ostrichEgg.EGG();

		ostrichEgg.print();

		ostrichEgg.SHcat();

	}



}
