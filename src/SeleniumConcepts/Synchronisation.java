package SeleniumConcepts;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronisation {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser		


		//Implicit Wait - Applied for all the objects available in the automation script
		                 //parameter is TimeOut - can be secs,mins, hours, days etc
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit Wait - Used only for a particular object. Achieved using 'WebDriverWait' class x
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("abcd")));
		
		//Fluent Wait - Same as Explicit wait but with an extra periodic check time and Exception ignorance
		
		FluentWait fwait = new FluentWait(driver);
		fwait.withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		

	}

}

