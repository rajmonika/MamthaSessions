package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser		
		
		//driver.get("https://www.google.com");//enters the url in the browser opened
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total no. of links on the page are: "+links.size());
		
		int count = 0;
		
		for(WebElement l : links)
		{
			if(!l.getText().equals(" "))
			{
				System.out.println(l.getText());
				count = count + 1;
			}
		}

		System.out.println("Total no. of links with text are: "+ count);
	}

}
