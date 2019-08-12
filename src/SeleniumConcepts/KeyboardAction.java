package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser		
		
		driver.get("https://www.seleniumhq.org/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement link = driver.findElement(By.id("menu_projects"));
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(link).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
		
		
		Thread.sleep(2000);
		driver.close();
		
		/*GOOGLE SEARCH PAGE
		 * 
		 * WebElement textbox = driver.findElement(By.name("q"));
		
		Actions action = new Actions(driver);
		
		Action act = action.keyDown(textbox, Keys.SHIFT).sendKeys("selenium").keyUp(textbox, Keys.SHIFT).build();
			
		Thread.sleep(2000);
		act.perform();
		*/


	}

}
