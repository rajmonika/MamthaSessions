package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckBox {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser		
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		//driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&pageType=3984&ru=https%3A%2F%2Fmy.ebay.com%2Fws%2FeBayISAPI.dll%3FMyEbayBeta%26MyEbay%3D%26gbh%3D1%26guest%3D1&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26pageType%3D3984%26ru%3Dhttps%253A%252F%252Fmy.ebay.com%252Fws%252FeBayISAPI.dll%253FMyEbayBeta%2526MyEbay%253D%2526gbh%253D1%2526guest%253D1");
		
		driver.manage().window().maximize();
		
		//Radio button selection
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
		
		
		
		//Checkbox selection
		WebElement CB1 = driver.findElement(By.id("vfb-6-0"));
		WebElement CB3 = driver.findElement(By.id("vfb-6-2"));
		
		CB1.click();
		CB3.click();
		
		if(CB1.isSelected())
		{
			System.out.println("CB1 is Selected");
		}
		else
		{
			System.out.println("CB1 is NOT Selected");
		}
		
		if(CB3.isSelected())
		{
			System.out.println("CB3 is Selected");
		}
		else
		{
			System.out.println("CB3 is NOT Selected");
		}
		
		WebElement tp = driver.findElement(By.linkText("Telecom Project"));
		if(tp.isDisplayed())
		{
			System.out.println("Link DISPLAYED");
		}
		else
		{
			System.out.println("Link NOT DISPLAYED");
		} 
		
		Thread.sleep(5000);
		
		CB1.click();
		CB3.click();
		
		/*WebElement loginbtn = driver.findElement(By.id("ppaFormSbtBtn"));
		if(loginbtn.isEnabled())
		{
			System.out.println("Login button ENABLED");
		}
		else
		{
			System.out.println("Create Account button DISABLED");
		}*/
		
		

	}

}
