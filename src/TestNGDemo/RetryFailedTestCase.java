package TestNGDemo;

import org.junit.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGDemo.TestNGListeners.class)
public class RetryFailedTestCase {
	
	@Ignore
	@Test
	public void test5()
	{
		System.out.println("This is test method 1");
	}
	
	@Test(retryAnalyzer = TestNGDemo.RetryAnalyzer.class)
	public void test6()
	{
		System.out.println("This is test method 2");
		Assert.assertTrue(false);
	}

	
	@Test 
	public void test7()
	{
		System.out.println("This is test method 3");
	}

	
	@Test
	public void test8()
	{
		System.out.println("This is test method 4");
	}


}
