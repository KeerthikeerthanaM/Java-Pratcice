import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean prime = true;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		System.out.println(prime);
//		int count=0;
//		
//		if(n<=1)
//		{
//			System.out.println("Entered number is not prime ");
//			return;
//		}
//		for(int i=1;i<=n/2;i++)
//		{
//			if(n%i==0)
//			{
//				count++;
//			}
//		}
//		if(count>1)
//		{
//			System.out.println("The number is not prime");
//		}
//		else
//		{
//			System.out.println("The number is prime");
//		}
	}

}
