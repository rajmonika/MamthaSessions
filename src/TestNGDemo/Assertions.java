package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Assertions {
	
	WebDriver driver;
	
	@BeforeMethod
	public void SetUp()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();

	}
	
	@Test
	public void googleTitle()
	{
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		Assert.assertNotEquals(title, "Google","title matched");
	}
	
	@Ignore
	@Test
	public void googleLogo()
	{
		boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(b,"Logo is present");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.close();
	}

}
