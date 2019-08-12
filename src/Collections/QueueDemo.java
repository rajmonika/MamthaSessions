package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;



public class QueueDemo {

	public static void main(String[] args) {

     Queue<String> q = new PriorityQueue<String>();
      
     q.add("Test1");
     q.add("Test2");
     q.add("Test3");
     
     System.out.println("head: "+q.element());  //returns head of the queue doesn't returns any value if the queue is null
     System.out.println("head: "+q.peek());  //returns head of the queue & returns null value if the queue is empty
     
     System.out.println("***Iterating the queue elements***");
     Iterator itr = q.iterator();
     while(itr.hasNext())
     {
    	 System.out.println(itr.next());
     }
     
     q.remove();
     
     System.out.println("***Iterating the queue elements after removing one Element***");
     Iterator itr1 = q.iterator();
     while(itr1.hasNext())
     {
    	 System.out.println(itr1.next());
     }
     
     q.poll();
     
     System.out.println("***Iterating the queue elements after removing Two Elements***");
     Iterator itr2 = q.iterator();
     while(itr2.hasNext())
     {
    	 System.out.println(itr2.next());
     }
     
     q.remove();
   
     System.out.println("***Iterating the queue elements after removing last Element***");
     Iterator itr3 = q.iterator();
     while(itr3.hasNext())
     {
    	 System.out.println(itr3.next());
     }
     
     q.poll(); 
     
     System.out.println("***Iterating the queue elements after removing last Element***");
     Iterator itr4 = q.iterator();
     while(itr4.hasNext())
     {
    	 System.out.println(itr4.next());
     }
    
     
     
     
     
     
     
	}

}
