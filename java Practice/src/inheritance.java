class Animal {
	public int leg;
	public boolean bark;

	public Animal(int leg, boolean bark) {
		this.leg = leg;
		this.bark = bark;

	}

	public Animal() {

	}

	public void details() {
		System.out.println("No of legs is: " + leg);
		System.out.println("Is Animal bark: " + bark);
	}

	void run() {
		System.out.println("Fast");
	}

	public void showDetails() {

	}

}

class Dog extends Animal {
	private boolean isPet;

	void run() {
		System.out.println("Slow");
	}

	public Dog(int leg, boolean bark, boolean isPet) {
		super(leg, bark);
		this.isPet = isPet;
	}

	public void showDetails() {
		System.out.println("isPet animal :" + isPet);
	}

	public Dog() {

	}
}

public class inheritance {
	public static void main(String args[]) {
//		Dog i = new Dog(4, true, true);
//		i.run();
//		i.details();
//		i.showDetails();
		
		Animal i = new Dog(4, true, true);
		i.run();
		i.details();
		i.showDetails();

//		Dog d=new Animal();    //It can't be executed because of down casting
//		d.run();

//		Animal a=new Animal();
//		a.run();
//		Dog d=new Dog();
//		d.run();
	}
}
