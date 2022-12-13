import java.util.Scanner;
public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String course;
		int age;
		
		int x;
		int y;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		name=sc.nextLine();
		System.out.println("Enter your course: ");
		course=sc.nextLine();
		System.out.println("Enter your age: ");
		age=sc.nextInt();
		
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("The value of x is: "+x);
		System.out.println("The value of y is: "+y);
		
		
		System.out.println("The addition is: "+(x+y));
		if(x>y)
		{
			System.out.println("X is greater");
		}
		else
		{
			System.out.println("Y is greater");
		}
		
		
		

	}

}
