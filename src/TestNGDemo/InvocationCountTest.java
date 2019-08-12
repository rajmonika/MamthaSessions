package TestNGDemo;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test (invocationCount = 100, invocationTimeOut = 1)
	public void sum()
	{
		int a =10;
		int b = 20;
		int c = a+b;
		System.out.println("Sum is: "+c);
	}
	
	@Test (invocationTimeOut = 1) //execute within 2 secs then come out of the loop
	public void infiniteLoop()
	{
		int i=1;
		while(i==1)
		{
			System.out.println("Value of i is: "+i);
		}
	}

}
