package JavaConcepts;


public class CompileTimeExcep {

	public static void main(String[] args) 
	{
		String s = null;
		
		try
		{
		System.out.println(s.length());
		}
		
		catch (Throwable t)
		{
			System.out.println("Exception occurred: "+t.getMessage());
		}
	}

}
