package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser		
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		//WebElement ele1 = driver.findElement(By.linkText("Electronics"));
		
		//WebElement ele2 = driver.findElement(By.linkText("iPhone"));
		
		action.moveToElement(driver.findElement(By.linkText("Electronics"))).build().perform();
		
		Thread.sleep(2000);
		
		//ele2.click();
		driver.findElement(By.linkText("iPhone")).click();


	}

}
