package Collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   Map<String,Integer> m=new HashMap<String, Integer>();
	   m.put("Alice",100);
	   m.put("Madhan",101);
	   m.put("Google",102);
	   
//	   for(Map.Entry map:m.entrySet())
//	   {
//		   System.out.println(map.getValue()+" "+map.getKey());
//		   if(map.getKey().equals("Madhan"))
//		   {
//			   System.out.println(map.getValue());
//		   }
//		   if(map.getKey().equals("Madhan"))
//		   {
//			  map.setValue(200);
//		   }
//	
//	   }

 System.out.println(m);
	   
	  

	}

}
