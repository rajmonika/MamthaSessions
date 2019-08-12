package TestNGDemo;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"})
public class GroupsDemo {

	@Test(groups = {"windows.sanity"})
	public void test1()
	{
		System.out.println("This is test 1");
	}
	
	@Test(groups = {"windows.regression"})
	public void test2()
	{
		System.out.println("This is test 2");
	}
	
	@Test(groups = {"regression"})
	public void test3()
	{
		System.out.println("This is test 3");
	}
	
	@Test(groups = {"regression","smoke"})
	public void test4()
	{
		System.out.println("This is test 4");
	}
	
	@Test
	public void test5()
	{
		System.out.println("This is test 5");
	}
	
	@Test(groups = {"windows.smoke"})
	public void test6()
	{
		System.out.println("This is test 6");
	}
	
}
