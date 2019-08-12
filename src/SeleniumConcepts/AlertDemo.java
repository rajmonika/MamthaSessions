package SeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		 
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver(); //launches the browser	
				
			driver.manage().window().maximize();
			
			driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");//enters the url in the browser opened
			
			/*driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
			
			System.out.println(driver.switchTo().alert().getText());
			
			Thread.sleep(2000);
			
			driver.switchTo().alert().accept();
			
			driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]")).click();
			
			Thread.sleep(2000);
			
			driver.switchTo().alert().dismiss(); */
			
			driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
			
			Thread.sleep(3000);
			Alert alert = driver.switchTo().alert();
			alert.sendKeys("testing");
			
			Thread.sleep(3000);
			
			alert.accept();
			
			//Actions act = new Actions(driver);
			
			//act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();
			
		

	}

}
