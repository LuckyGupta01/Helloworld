package Collections;

import java.util.ArrayList;
import java.util.Iterator;


public class Coll1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("lucky");
		al.add("Kamla");
		al.add("virat");
		al.add("Suresh");
		
		System.out.println(al);
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			String str = (String) itr.next();
			System.out.println(str);
		}
	}

}
