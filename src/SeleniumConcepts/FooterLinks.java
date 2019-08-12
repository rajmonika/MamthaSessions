package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver(); //launches the browser	
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com");//enters the url in the browser opened
			
			WebElement footer = driver.findElement(By.xpath("//div[@class='fbar']"));
			
			List<WebElement> links = footer.findElements(By.tagName("a"));
			
			for(WebElement l : links)
			{
				if(!l.getText().equals(""))
				{
					System.out.println(l.getText());
				}
			}
			

	}

}
