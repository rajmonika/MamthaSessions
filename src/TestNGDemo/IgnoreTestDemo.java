package TestNGDemo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTestDemo {
	
	@Test
	public void test1()
	{
		System.out.println("This is Test 1");
	}
	
	@Ignore
	@Test
	public void test2()
	{
		System.out.println("This is Test 2");
	}

	@Test
	public void test3()
	{
		System.out.println("This is Test 3");
	}

	@Ignore
	@Test
	public void test4()
	{
		System.out.println("This is Test 4");
	}


}
