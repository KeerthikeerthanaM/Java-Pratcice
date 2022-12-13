
public class methodExample {
//	static int add(int a, int b) {
//		int c;
//		c = a + b;
//		return c;
//	}
	 static int a;
	 static int b;
	
	static int add()
	{
		return a+b;
	}

	public static void main(String args[]) {

//		int sum = add(3, 4);
//		System.out.println(sum);
//		System.out.println(add(9, 3));
//		System.out.println(add(5, 8));
//		System.out.println(add(10, 3));
//		System.out.println(add(5, 3));
		
		
		methodExample m=new methodExample();
		m.a=4;
		m.b=5;
		System.out.println("Sum is: "+ add());
	   
		
	}

	

}
