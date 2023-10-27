package assignment;

public class asss6 {
	static class Animal{
		public String name;
		public Animal() {
			name="";
		}
		public Animal (String n) {
			name=n;
		}
		public void onomatopoeia() {
			System.out.println("There is no onomatopoeia for" + name);
		}
	}
	static class Dog extends Animal{
		public Dog(String n) {
			super(n);
		}
		public void onomatopoeia() {
			System.out.println(name + " says Woof");
		}
	}

	static class Lion extends Animal{
		public Lion(String n) {
			super(n);
		}
		public void onomatopoeia() {
			System.out.println(name + " says Roar");
		}
	}

	static class Frog extends Animal{
		public Frog(String n) {
			super(n);
		}
		public void onomatopoeia() {
			System.out.println(name + " says Ribbit");
		}
	}
	static class SARA_MOUNTAIN_DOG extends Dog{
        public SARA_MOUNTAIN_DOG(String n) {
            super(n);
        }
        public void onomatopoeia() {
            System.out.println(name + " says Bark!");
        }
    }

	public static void main(String[] args) {
		Dog dog = new Dog("Dog");
        dog.onomatopoeia();

        Lion lion = new Lion("Lion");
        lion.onomatopoeia();

        Frog frog = new Frog("Frog");
        frog.onomatopoeia();
        
        SARA_MOUNTAIN_DOG sara_dog = new SARA_MOUNTAIN_DOG("Sara Mountain Dog");
        sara_dog.onomatopoeia();
	}

}
