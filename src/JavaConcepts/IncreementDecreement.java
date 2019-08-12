package JavaConcepts;

public class IncreementDecreement {

	public static void main(String[] args) {
		
		
		//Post Increement
		int i = 1;
		int j = i++;
		System.out.println("Value of i is: "+i);
		System.out.println("Value of j is: "+j);
		
		System.out.println("------");
		
		//Pre Increement
		int a = 1;
		int b = ++a;
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
		
		System.out.println("------");

		//Post Decreement
		int m = 2;
		int n = m--;
		System.out.println("Value of m is: "+m);
		System.out.println("Value of n is: "+n);
		
		System.out.println("------");
		
		//Pre Decreement
		int p = 2;
		int q = --p;
		System.out.println("Value of p is: "+p);
		System.out.println("Value of q is: "+q);

	}

}
