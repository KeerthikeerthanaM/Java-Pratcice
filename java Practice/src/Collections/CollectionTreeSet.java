package Collections;

import java.util.TreeSet;

public class CollectionTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts=new TreeSet<>();
		ts.add("zoe");                                  //It print ascending order(i.e.,A to Z)
		ts.add("Go");
		ts.add("A");
		ts.add("Book");
		ts.add("Air");
		
		System.out.println(ts);
		
		
		TreeSet<Integer> ts1=new TreeSet<>();
		ts1.add(23);                                  //It print ascending order(i.e.,1 to n.....)
		ts1.add(456);
		ts1.add(2);
		ts1.add(1);
		ts1.add(19);
		
		System.out.println(ts1);

	}

}
