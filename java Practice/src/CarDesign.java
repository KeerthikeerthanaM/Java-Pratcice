
class car {
	final String name = "BMW";
	final int year = 2020;
	final int warrantyYear = 2;
	final String carModel = "BMW13";
	final int capacity = 150;
	static String color;
	public double price;

	public car(double price) {
		// this.color=color;
		this.price = price;
	}
//
//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static void changeColor(String carColor) {
		color = carColor;

	}

	public String toString() {
		return "Car Name= " + name + ". Manufacturing year is " + year + ". The warranty period is " + warrantyYear
				+ " Years. The car model is " + carModel + " .Car color" + " is: " + color + ".Car Price is: " + price
				+ ".Capacity is: " + capacity;

	}

}

public class CarDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car b = new car(200000);
		b.changeColor("White");
		System.out.println(b);

	}

}
