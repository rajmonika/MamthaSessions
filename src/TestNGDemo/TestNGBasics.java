package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"})
public class TestNGBasics {
	
	//Pre conditions ---starting with @before --- executed before the main test case
	
	@BeforeSuite
	public void setUp()
	{
		System.out.println("@before suite - Setting System Properties");
	}
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("@before test - Launching the Browser");
	}
	
	@BeforeClass
	public void enterURL()
	{
		System.out.println("@before Class - Entering the URL");
	}

	@BeforeMethod
	public void Login()
	{
		System.out.println("@before Method --- Login into application");
	}
	
	//Test cases --- starts with @test
	@Test
	public void TitleTest()
	{
		System.out.println("@ test --- Test case - Google title test");
	}
	
	@Test
	public void SearchTest()
	{
		System.out.println("@ test --- Test case - Search data test");
	}
	
	@Test
	public void LogoCheck()
	{
		System.out.println("@ test --- Test case - Google Logo check");
	}
	
	@AfterMethod
	public void Logout()
	{
		System.out.println("@after Method --- Logout of the application");
	}
	
	@AfterClass
	public void refresh()
	{
		System.out.println("@after Class - Refreshing the page");
	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("@after test - Closing the Browser");
	}
	
	@AfterSuite
	public void DeleteCookies()
	{
		System.out.println("@after suite - Deleting the Cookies");
	}
	

	
	
}
