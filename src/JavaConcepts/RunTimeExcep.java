package JavaConcepts;

public class RunTimeExcep {

	public static void main(String[] args) {

		int a = 0;
		int b = 2;
		
		try
		{ 
			System.out.println("Value of division is: "+b/a);
		}
		
		catch (ArithmeticException ae)
		{
		  System.out.println("Exception message is: "+ae.getMessage());
		}
		
		
		{
			System.out.println("Exception occurred - End of Program");
		}
		
		
	}

}
