package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesMethods {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser		
		
		//driver.get("http://demo.guru99.com/v1/");
		
		//driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath(".//*[@type='submit' or @name='btnReset']")).click();
		
		//driver.findElement(By.xpath(".//*[@type='submit' and @name='btnLogin']")).click();
		
		//driver.findElement(By.xpath(".//label[starts-with(@id,'message')]")); //For identifying on the Xpath locator
		
		//driver.findElement(By.xpath("//td[text()='Password']"));
		
		//driver.findElement(By.xpath("//input[@name='uid']//following::input[2]")).click();
		
		//driver.findElement(By.xpath("//input[@value='RESET']//preceding::input[3]")).sendKeys("abc");
		
		//driver.findElement(By.xpath("//input[@value='LOGIN']//following-sibling::input[1]")).click();
		
		//driver.findElement(By.xpath("//input[@value='RESET']//preceding-sibling::input[1]")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Smart Watches')]//parent::div")).click();
		
		//body[contains(@class,'logo-type-preset4 fixed-header-enabled
		
        //driver.findElement(By.xpath("//a[contains(text(),'Fun')]//descendant::a[1]")).click();
		
		WebElement z = driver.findElement(By.xpath("//a[contains(text(),'HEG Ltd.')]//ancestor::td/following::td[2]"));
		System.out.println(z.getText());
		
	 


	}

}
