package SeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser	
		driver.manage().window().maximize();
		
		//driver.get("https://www.google.com");//enters the url in the browser opened
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.212244178.719811789.1561821874-642289800.1561821874");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("login_page");
		
		//driver.findElement(By.name("fldLoginUserId")).sendKeys("abcuser101");
		
		driver.findElement(By.cssSelector("[scr='/gif/continue_new1.gif?v=1'][alt='continue'][style='margin-right:18px;']")).click();
		
		Alert abc = driver.switchTo().alert();
		
		abc.accept();
		abc.dismiss();
		System.out.println(abc.getText());
		
		
		

	}

}
