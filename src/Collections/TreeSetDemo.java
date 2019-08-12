package Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
   
		Set s = new TreeSet();
		s.add(1990);
		s.add(2000);
		s.add(2000);
		s.add(12);
		s.add(1000);
		s.add(1990);
		s.add(7);
		s.add(499);
		s.add(12);
		//s.add("Hello"); //Similar data type values to be added otherwise ClassCastException
		
		System.out.println("Elements of Tree Set are: "+s);
		
		//O/P - Removes dupes, prints values sorted in ascending order
		

	}

}
