package Collections;
import java.util.Comparator;

public class CompareatorDemo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		/*---for ascending order sorting---*/
		String s1=o1.toString();
		String s2=o2.toString();
		
		if(s1.length()>s2.length())
			return +1;
		else if(s1.length()<s2.length())
			return -1;
		else 
		  return 0;
		
		
		
		//For descending order sorting
//		if(s1.length()>s2.length())
//			return -1;
//		else if(s1.length()<s2.length())
//			return +1;
//		else 
//		  return 0;
	}

}
