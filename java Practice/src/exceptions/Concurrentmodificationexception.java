package exceptions;

import java.util.ArrayList;
import java.util.Iterator;

public class Concurrentmodificationexception {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		Iterator<Integer> ite = list.iterator();
		while (ite.hasNext()) {
			Integer value = ite.next();
			System.out.println("List Value:" + value);
			if (value.equals(3))
				list.remove(value);
		}
                                          //by using hashmap we avoid this error
	}

}