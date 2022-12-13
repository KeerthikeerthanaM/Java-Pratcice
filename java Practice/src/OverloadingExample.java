class Average {
	Average(int a, int b) {
		int c;
		c = (a + b) / 2;
		System.out.println("The average of 2 no's is: " + c);
	}

	Average(int a, int b, int c) {
		int d;
		d = (a + b + c) / 3;
		System.out.println("The average of 3 no's is: " + d);
	}

}

public class OverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average a = new Average(45, 23);
		Average a1 = new Average(98, 46, 24);

	}

}
