package Collections;

import java.util.Arrays;
import java.util.Comparator;


public class CollectionComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "Go", "Banana", "Carrots", "Apple", "Watermelon", "Cat" };
		System.out.println("Before sorting:");
		for (String s : names) {

			System.out.println(s);
		}
		System.out.println("********************************************");
		System.out.println("After sorting:");

		Arrays.sort(names);
		for (String s : names) {

			System.out.println(s);
		}
		System.out.println();
		Comparator com = new CompareatorDemo(); // refer compareatorDemo class for comparison operationn
		System.out.println("***********After ascending  order  sorting*******************");
		Arrays.sort(names, com);

		for (String s : names) {

			System.out.println(s);
		}
		
		
//		int a[]= {12,345,6,9853,34,34568};
//		for(int arr:a)
//		{
//			System.out.println(arr);
//		}
//		
//		System.out.println("After sorting ");
//		Arrays.sort(a);
//		for(int arr:a)
//		{
//			System.out.println(arr);
//		}
		
		

	}

}
