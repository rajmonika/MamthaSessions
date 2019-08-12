package TestNGDemo;

import org.testng.annotations.Test;

public class DependsDemo {
	
	@Test
	public void LoginTest()
	{
		System.out.println("Login Test");
		//int i = 5/0;
	}
	
	@Test (dependsOnMethods = "LoginTest")
	public void HomePageTest()
	{
		System.out.println("Home Page Test");
	}
	
	@Test
	public void SearchPageTest()
	{
		System.out.println("Search page test");
	}
	
	@Test(dependsOnMethods = "SearchPageTest") 
	public void ProductPage()
	{
		System.out.println("Product page test");
	}


}
