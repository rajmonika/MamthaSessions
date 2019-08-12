package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

import JavaConcepts.Employee;

public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Selenium");
		hm.put(102, "Java");
		hm.put(103, "QTP");
		hm.put(104, "Ruby");
		hm.put(null, "Python");
		hm.put(105, null);
		
		System.out.println("Value at key 104 is: "+hm.get(104));
		
		for(Entry<Integer, String> m : hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(hm);
		
		hm.remove(103);
		System.out.println(hm);
		
		
		//HashMap<Integer, String> emp = new HashMap<Integer, String>();
		
		//Employee e1 = new Employee("Tom", 25, "Admin");
		//Employee e2 = new Employee("Jerry",27, "Dev");
		
		//emp.put(1, e1);
		//emp.put(2, e2);

	}

}
