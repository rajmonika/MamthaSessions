package Collections;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
  
		Hashtable<String, String> h1 = new Hashtable<String, String>();
		h1.put("A", "Steve");
		h1.put("B", "Chris");
		h1.put("C", "Bruce");
		
		System.out.println("Values in HashTable are: "+h1);
		
		//To create a copy
		Hashtable<String, String> h2 = new Hashtable<String, String>();
		h2 = (Hashtable<String, String>) h1.clone();
		System.out.println("Values in H1: "+h1);
		System.out.println("Values in H2: "+h2);
		
		h1.clear();
		System.out.println("Values in H1: "+h1);
		System.out.println("Values in H2: "+h2);
		
		h2.put("B", "Chris");
		h2.put("C", "Bruce");
		h2.put("D", "Chris");
		h2.put("E", "Bruce");
		
		System.out.println("Values in H2: "+h2);
		
		//h2.put(null,"ABC");
		//System.out.println("Values in H2: "+h2);
	}

}
