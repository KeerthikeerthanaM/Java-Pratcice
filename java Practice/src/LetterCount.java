import java.util.Scanner;
import java.util.HashMap;

public class LetterCount {
	public static void main(String args[])
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the string ");
//		String s=sc.nextLine();
//		
//		System.out.println("Enter the character to find occurence ");
//		char c=sc.next().charAt(0);
//		
//		int count=0;
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)==c)
//				count++;
//		}
//		System.out.println("The occurence of the string "+s+ " contains "+c+" is: "+count);
//		
	
		
//using hashMap
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string ");
		String s = sc.nextLine();
		HashMap<Character, Integer> hm = new HashMap();
		
		char[] c = s.toCharArray();
		for (char ch : c) {
			if (hm.containsKey(ch))
				hm.put(ch,hm.get(ch)+1);
			else
				hm.put(ch, 1);

		}
		System.out.println(hm);
	}

}
