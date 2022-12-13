package exceptions;

class Dog extends Animal {
	Dog(String color) {
		super(color);

	}

	void eat(String name) {
		System.out.println(name + " is eating ....");
	}
}
