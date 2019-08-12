package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

	public static void main(String[] args) {

		//8 Locators in Selenium - Id, name, class, Classname, Xpath, LinkText, PartialLinkText, CSS
		
		//Method - findElement(By <locator>)
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\geckodriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser		
		
		//driver.get("https://www.google.com");//enters the url in the browser opened
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		//WebElement gmail = driver.findElement(By.id("gb_70"));
		
		//gmail.click();
		
		//driver.findElement(By.name("identifier")).sendKeys("mamtha");
		
		//driver.findElement(By.linkText("Learn more")).click();
		
		//driver.findElement(By.partialLinkText("more")).click();
		
		//driver.findElement(By.cssSelector("[type='text'][class='db'][tabindex='1']")).sendKeys("abc");
		
		driver.findElement(By.cssSelector("[type='text'][class='nav-input'][tabindex='9']")).sendKeys("mobiles");
		
		
     
	}

}
