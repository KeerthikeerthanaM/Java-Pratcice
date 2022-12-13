package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add(3);
		al.add("Ram");
		al.add("True");
		al.add(78);
		System.out.println(al);
		al.add(2, "dog");
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.remove(3));
		System.out.println(al);
		System.out.println(al.set(2, 34)); // it replaces the 2nd index with 34....
		System.out.println(al);

		/*---Using for loop---*/
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		int n = 5;
		for (int i = 1; i <= n; i++) {
			al1.add(i);
		}
		System.out.println(al1);
		System.out.println(al1.remove(2));
		System.out.println(al1.removeAll(al1)); // it remove all the elements from the arraylist
		System.out.println(al1);

		/*----Using iterator----*/
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("alice");
		al2.add("ram");
		al2.add("jiggy");

		Iterator<String> itr = al2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
