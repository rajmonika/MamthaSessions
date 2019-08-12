package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathTypes {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser		
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='nav-a'][contains(text(),'Amazon Pay')]")).click();
		
		driver.findElement(By.xpath("//a[@class='nav-a'][contains(text(),'Today's Deals')]")).click();
	}

}
