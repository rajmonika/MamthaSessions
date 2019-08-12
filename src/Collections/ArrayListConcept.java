package Collections;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//int a[] = new int [3];    //Static Array --- size fixed
		
		ArrayList ar = new ArrayList(); //Non generic
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		
		System.out.println("Size of the Array List: "+ar.size());
		
		System.out.println("Value at index 3: "+ar.get(3));
		
		ar.add("Test");
		ar.add(12.33);
		ar.add('A');
		ar.add(100);
		
		System.out.println("Size of the Array List: "+ar.size());
		
		for(int i = 0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); //Generic 
		ar1.add(100);
		ar1.add(200);
		//ar1.add("Hello"); //Will give error
		
		ArrayList<String> ar2 = new ArrayList<String>(); //Generic
		ar2.add("Java");
		ar2.add("World");
		//ar2.add(300);
		
		EmployeeArrayList e1 = new EmployeeArrayList("Peter", 25, "QA");
		EmployeeArrayList e2 = new EmployeeArrayList("John", 26, "Dev");
		EmployeeArrayList e3 = new EmployeeArrayList("Steve", 27, "Admin");
		
		ArrayList<EmployeeArrayList> ar3 = new ArrayList<EmployeeArrayList>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
		//AddAll()
		ArrayList<Integer> ar4 = new ArrayList<Integer>(); //Generic 
		ar4.add(700);
		ar4.add(900);
		ar4.add(999);
		
		ar4.addAll(ar1);
		for(int i=0; i<ar4.size(); i++)
		{
			System.out.println("Values of ar4 are: "+ar4.get(i));
		}
		
		ar4.removeAll(ar1);
		for(int i=0; i<ar4.size(); i++)
		{
			System.out.println("Revised Values of ar4 are: "+ar4.get(i));
		}
		
		//RetainAll()
		ArrayList<String> ar5 = new ArrayList<String>(); //Generic
		ar5.add("Java");
		ar5.add("World");
		ar5.add("Selenium");
		ar5.add("QTP");
		ar5.add("Eclipse");
		
		ar5.retainAll(ar2);
		for(int i=0; i<ar5.size(); i++)
		{
			System.out.println("Retained Values of ar5 are: "+ar5.get(i));
		}
		
		
		
		

	}

}
