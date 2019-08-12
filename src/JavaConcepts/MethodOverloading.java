package JavaConcepts;

public class MethodOverloading {
	
	public void sum()  //No Parameters
	{
		System.out.println("Sum Method - Zero Parameters");
	}
	
	public void sum(int i)  //One I/P Parameter
	{
		System.out.println("Sum Method - One Parameter of type int");
	}
	
	public void sum(String s) 
	{
		System.out.println("Sum Method - One Parameter of type String");
	}
	
	public void sum(int p, int q)  //Two I/P Parameters
	{
		System.out.println("Sum Method - Two Input Parameters");
	}

	public static void main(String[] args) {
	
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(5);
		obj.sum(2, 4);
		obj.sum("Hello");

	}

}
