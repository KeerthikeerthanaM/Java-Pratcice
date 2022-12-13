import java.util.Scanner;

public class CreatingMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the matrix");
		int n = sc.nextInt();

		System.out.println("Enter the row size of the matrix");
		int a = sc.nextInt();

		System.out.println("Enter the column size of the matrix");
		int b = sc.nextInt();

		int[][] m = new int[a][b];

		System.out.println("Enter Matrix Data");

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				m[i][j] = sc.nextInt();
			}
		}

		System.out.println("Your Matrix is : ");

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(m[i][j] + "\t");
			}

			System.out.println();
		}

		int d1 = 0;
		int d2 = 0;

		for (int i = 0; i < n; i += 2) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					d1 += m[i][j];
				}

			}
		}
		System.out.println("The right diagonals value is: " + d1);

		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < n; j+=2) {
				if ((i + j) == (n - 1)) {
					d2 += m[i][j];
				}

			}
		}
		System.out.println("The left diagonals value is: " + d2);

		int d = d1 - d2;

		System.out.println("The difference of the diagonal is " + d);

	}

}
