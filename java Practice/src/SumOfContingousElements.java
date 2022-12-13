import java.util.Scanner;

public class SumOfContingousElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 2, 6, 3, 2 };

		System.out.println("Enter the element u want to divide");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
        int sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++)
		{
			sum = arr[i] + arr[i + 1];

			if ((sum %d)==0)
			{
			    count++;
			}
			System.out.println(sum);

		}
		System.out.println("The number of count is : " + count);

	}

}
