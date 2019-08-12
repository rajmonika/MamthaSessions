package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		
		//Add
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("Java");
		ll.add("Test");
		ll.add("Java");
		
		System.out.println("Content of Linked List is: "+ll);
		
		//Add First
		ll.addFirst("Automation");
		System.out.println("Content of Linked List is: "+ll);
		
		//Add Last
		ll.addLast("Manual");
		System.out.println("Content of Linked List is: "+ll);
		
		//Remove
		ll.removeFirst();
		System.out.println("List after removing first element: "+ll);
		
		ll.removeLast();
		System.out.println("List after removing last element: "+ll);
		//ll.remove(2);

		//Get
		System.out.println("Retrieving element using index: "+ll.get(0));
		
		//Set
		ll.set(0, "Eclipse");
		System.out.println("Setting up an element using index: "+ll.get(0));
		System.out.println("Content of Linked List is: "+ll);
		
		//For Loop
		System.out.println("**********Printing using For Loop*********");
		for (int i = 0 ; i <ll.size(); i++)
		{
			System.out.println(ll.get(i));
		}
		
		
		//For each Loop
		
		//for(datatype temp variable : Collection object)
		{
			//sysout(temp variable);
		}
		
		System.out.println("**********Printing using For Each Loop*********");
		for(String str : ll)
		{
			System.out.println(str);
		}
		
		//Iterator
		System.out.println("**********Printing using Iterator *********");
		Iterator<String> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//While Loop
		System.out.println("**********Printing using While Loop *********");
		int num = 0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
	}

}
