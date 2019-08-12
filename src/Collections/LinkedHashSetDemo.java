package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
    
		 Set<String> s = new LinkedHashSet<String>();
		 
		 s.add("ABC");
		 s.add("ABC");
		 s.add("ABC");
		 s.add("Hey");
		 s.add("Hey");
		 s.add("pqr");
		 s.add("xyz");
		 s.add("xyz");
		 
		 System.out.println("Values in the Set are: "+s); 
		 
		 //O/P -- Removes dupes, prints in order as stored

	}

}
