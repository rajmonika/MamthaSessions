package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FirstDemoTestNG {
	
	WebDriver driver;
  
	@Test (priority=2)
  public void f() throws Exception 
	{
	  driver.findElement(By.id("vfb-6-0")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("vfb-6-1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("vfb-6-2")).click();
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement cb : checkbox)
		{
			System.out.println(cb.getAttribute("id"));
		}
	}

	@Test (priority=1)
	public void radiobutton() throws Exception
		{
			driver.findElement(By.id("vfb-7-1")).click(); //RB1
			Thread.sleep(3000);
			WebElement rb3 = driver.findElement(By.id("vfb-7-3")); //RB3
			rb3.click();
			driver.findElement(By.id("vfb-7-2")).click(); //Radio button 2
			
			if(rb3.isSelected())
			{
				System.out.println("Radio btn 3 is Selected");
			}
			else
			{
				System.out.println("Radio btn 3 is NOT Selected");
			}
		}
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		driver.manage().window().maximize();

  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(4000);
	  
	  driver.close();
  }

}
