package TestNGDemo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestNGDemo.TestNGListeners.class)
public class TestNGListenerDemo {
	
	WebDriver driver;
	
	@Test
	public void test1()
	{
		System.out.println("This is test method 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("This is test method 2");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.google.com");		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		driver.findElement(By.name("search")).click();
        
	}

	
	@Test
	public void test3()
	{
		System.out.println("This is test method 3");
	}

	
	@Test
	public void test4()
	{
		System.out.println("This is test method 4");
	}


}
