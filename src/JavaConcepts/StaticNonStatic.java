package JavaConcepts;

public class StaticNonStatic {

	String name = "Tom"; //Non Static Global Variable
	
	static int age = 25; //Static Global variable
	
	public static void sum()
	{
		int a =10;
		int b = 20;
		int c = a + b;
		System.out.println("Value of Sum method is:"+ c);
	}
	
	public void multiply()
	{
		int m = 10;
		int n = 100;
		int p = m * n;
		System.out.println("Value of multiply method is:"+ p);
	}
	
	
	public static void main(String[] args) {
	
		//1. Direct Calling of Static Variable & Methods
		
		sum();
		System.out.println("Age is: "+age);
		
		System.out.println("----");
		
		//2. Using Class name
		StaticNonStatic.sum();
		System.out.println("Printing age by Class name: "+StaticNonStatic.age);
		
		System.out.println("----");
		
        //3. To call Non Static Variables and methods
		StaticNonStatic obj = new StaticNonStatic();
		System.out.println("Value of Non static global variable: "+ obj.name);
		obj.multiply();
		
				
	}

}
