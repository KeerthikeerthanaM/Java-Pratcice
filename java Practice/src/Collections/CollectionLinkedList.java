package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<>();
		ll.add("Hello");
		ll.add("Raj");
		ll.add("Good");
		ll.add("Morning!!!");

		System.out.println(ll);

		ll.remove(2);
		System.out.println(ll);

		ll.set(2, "Happyyy");
		System.out.println(ll);

		/*---using for loop---*/

		for (int i = 0; i < ll.size(); i++) // Normal for loop
		{
			System.out.print(ll.get(i) + " ");
		}

		System.out.println();

		/*---using for each loop---*/
		for (String s : ll) // For each loop
		{
			System.out.print(s + " ");
		}

		/*---using iterator---*/

		LinkedList<String> llist = new LinkedList<>();
		llist.add("alice");
		llist.add("ram");
		llist.add("jiggy");

		Iterator<String> itr = llist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
