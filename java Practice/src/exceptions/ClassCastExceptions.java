package exceptions;

public class ClassCastExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog("black");  
		Animal animal = new Animal("White");  
		animal = dog;  
		animal.show("My dog");  
		  
		Animal animal1 = new Animal("White");  
//		Dog d = (Dog)animal1;  
		dog =(Dog) animal1;
	}

}
