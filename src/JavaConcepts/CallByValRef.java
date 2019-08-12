package JavaConcepts;

public class CallByValRef {
	
	int p, q; //Global variables

	public int Sum(int a, int b)
	{
		a = 30;
		b = 40;
		int c = a+b;
		System.out.println("Call by ref: "+c);
		return c;
	}
	
	public void swap(CallByValRef t)
	{
		int temp;
		temp = t.p; //temp = 50
		t.p = t.q; // p = 60
		t.q = temp; // q = 50
	}
	public static void main(String[] args) {
 
		CallByValRef obj1 = new CallByValRef();
		int x = 10;
		int y = 20;
		obj1.Sum(x, y);
		
		obj1.p = 50;
		obj1.q = 60;
		System.out.println("Value of P before swap: "+obj1.p); //After Swap
		System.out.println("Value of q before swap: "+obj1.q);
		
		obj1.swap(obj1);
		
		System.out.println("Value of P after swap: "+obj1.p); //After Swap
		System.out.println("Value of q after swap: "+obj1.q);
		
	}

}
