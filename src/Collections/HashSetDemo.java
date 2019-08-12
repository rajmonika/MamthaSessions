package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		 /* Set s = new HashSet();
		 
		 s.add("ABC");
		 s.add("ABC");
		 s.add("ABC");
		 s.add(123);
		 s.add(123);
		 s.add(456);
		 s.add("xyz");
		 s.add("xyz");
		 
		 System.out.println("Values in the Set are: "+s); 
		 //O/P - No dupes, not printed in order */
		
		HashDemo h = new HashDemo("Pineapple");   //1st element in the HashSet
		HashDemo h2 = new HashDemo("Grapes");  //2nd element in hashset
		HashDemo h3 = new HashDemo("Orange");   //3rd element in the HashSet
		HashDemo h4 = new HashDemo("Apple");  //4th element in hashset
		
		HashSet<HashDemo> d = new HashSet<HashDemo>();
		d.add(h);
		d.add(h2);
		d.add(h3);
		d.add(h4);
		
		//System.out.println(d); ---
		
		System.out.println("Printing values from HashDemo constructor:");
	Iterator<HashDemo> it = d.iterator();
		while(it.hasNext()) {
			HashDemo hd = it.next();
			System.out.println(hd.fruits);
			
		} 
		
		
	/////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("************************************");

		HashSet a = new HashSet();     //initialization of non-generic HashSet collection
		a.add("Apple");
		a.add("Apple");
		a.add("Banana");
		a.add("Grapes");
		a.add("Grapes");
		a.add("  ");
		a.add("**");
		
		System.out.println(" "+a); //Observer the o/p the set does not maintain the order in which it was added.
									// duplicate values are printed only once.
		
		System.out.println("The size of the hash set  "+a.size());  //duplicates are not counted 
		//System.out.println("The value at index 1 is  " +a);
		
			//	forEach(String b : a);
		a.remove("  ");
		a.remove("**");
	    System.out.println(a);

	}

}
