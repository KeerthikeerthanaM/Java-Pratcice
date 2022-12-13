package Collections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add("hello");
		System.out.println(hs);

		HashSet<String> h = new HashSet<String>();
		h.add("Ram");
		h.add("Rahul");
		h.add("Raj");
		h.add("Rakesh");
		System.out.print("The initial set " + h);
		System.out.println();

		h.add("Rahul");
		System.out.print("The set after adding duplicate string " + h);

		/*-----Union,intersection,set difference---*/

		Set<Integer> a = new HashSet<>();
		a.addAll(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println("The set A is: " + a);

		Set<Integer> b = new HashSet<Integer>();
		b.addAll(Arrays.asList(2, 4, 5, 6, 8));
		System.out.println("The set B is: " + b);

		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.println("The set union of A and B is: " + union);

		Set<Integer> intersection = new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.println("The set intersection of A and B is: " + intersection);

		Set<Integer> setDifference = new HashSet<Integer>(a);
		setDifference.removeAll(b);
		System.out.println("The set intersection of A and B is: " + setDifference);

	}

}
