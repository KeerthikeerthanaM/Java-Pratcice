import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n=3;
//		int m[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		int d1=0;
//		int d2=0;
//		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				if (i == j) {
//					d1 += m[i][j];
//				}
//
//			}
//		}
//		System.out.println(d1);
//		
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				if((i+j)==(n-1))
//				{
//					d2+=m[i][j];
//				}
//			}
//		}
//		System.out.println(d2);
//		int d=d1+d2;
//		
//		
//		System.out.println("The sum of the diagonal is "+ d);
		
//		 Scanner in = new Scanner(System.in);
//         System.out.println("Enter the number of rows of the matrix");
//         int a = in.nextInt();
//         System.out.println("Enter the number of columns of the matrix");
//         int b = in.nextInt();
//
//         // Declare the matrix
//         int m[][] = new int[a][b];
//
//         // Read the matrix values
//         System.out.println("Enter the elements of the matrix");
//         for (int i = 0; i < a; i++)
//             for (int j = 0; j < b; j++)
//                 m[i][j] = in.nextInt();
//
//         // Display the elements of the matrix
//         System.out.println("Elements of the matrix are");
//         for (int i = 0; i < a; i++) {
//             for (int j = 0; j < b; j++)
//                 System.out.print(m[i][j] + "  ");
//             System.out.println();
		
		
	
		int n=5;
		int m[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
	    int d1=0;
		int d2=0;
		
		for (int i = 0; i < n; i += 2) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					d1 +=m[i][j];
				}

			}
		}
		System.out.println("The right diagonals value is: "+d1);
		
		for(int i=1;i<n;i+=2)                               //column skip...i=1,j=1
		{
			for(int j=1;j<n;j+=2)
			{
				if((i+j)==(n-1))
					{ 
						d2+=m[i][j];
					}
				
				
			}
		}
		System.out.println("The left diagonals value is: "+d2);
		int d=d1-d2;
		
		
		System.out.println("The difference of the diagonal is "+ d);

	}

}
