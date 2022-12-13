import java.util.Scanner;

public class Datatype {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter integer:");
		int num=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter string:");
		String name=sc.nextLine();
		
		System.out.println("Enter double value:");
		double d=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter a float value:");
		float f=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter boolean:");
		boolean bool=sc.nextBoolean();
		sc.nextLine();
		
		int a=3,b=4,c;
		c=a+b+a++ +b++ + ++a + ++b;
		System.out.println(c);
		
		

	}

}
