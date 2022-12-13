package exceptions;

public class Animal {
	
	void sleep()
	{
		System.out.println("Animal is sleeping");
	}
	
	String color; 
	
	Animal(String color){  
	this.color = color;  
	}  
	void eat(String name) {  
	System.out.println(name + " is eating .....");  
	}  
	void show(String name) {  
	System.out.println(name + " is of " + color + " Color");  
	} 

}
