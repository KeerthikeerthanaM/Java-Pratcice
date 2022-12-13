import java.util.Scanner;

public class starPattern {
	public static void main(String args[])
	{
//		int n=4;
//		for(int i=0;i<n;i++)
//		{
//			for(int j=n-i;j>1;j--)
//			{
//				System.out.print(" ");
//			}
//			
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		System.out.println("--------");
		
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=i;j<=n;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//		}
//		int n=8;
//		for(int i=0;i<n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				
//			if(i%2!=0)
//			{
//				System.out.print("7 ");
//			}
////			else
////			{
////				System.out.print(" ");
////			}
//			
//			}
//			System.out.println();
//			}
		int n=8;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			for(int j=n-i;j>1;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
				{
				System.out.print(a+" ");
				}
			}
			System.out.println();
		}
	
	
	}

}
