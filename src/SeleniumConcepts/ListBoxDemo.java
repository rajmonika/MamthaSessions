package SeleniumConcepts;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListBoxDemo {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser		
		
		//driver.get("https://www.google.com");//enters the url in the browser opened
		
		driver.get("https://www.seleniumeasy.com/test/bootstrap-dual-list-box-demo.html");
		
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(arg0); //index starts from zero
		//driver.switchTo().frame(arg0);
		//driver.switchTo().frame(name/id);
		//Frames are always designed under <iframe> tag
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit wait
		WebDriverWait wt = new WebDriverWait(driver,30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("abcd")));

        //Fluent wait
		FluentWait wt1 = new FluentWait(driver);
		wt1.withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	}

}
