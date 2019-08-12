package SeleniumConcepts;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser	
		driver.manage().window().maximize();
		
		//driver.get("https://www.google.com");//enters the url in the browser opened
		
		driver.get("https://www.naukri.com/");
		
		Set<String> allwin = driver.getWindowHandles();
		
		System.out.println(allwin);
		
		for(String handle: allwin)
		{
			driver.switchTo().window(handle);
			String title = driver.getTitle();
			System.out.println(title +" "+handle);
			if(title.equals("Amazon"))
			{
				driver.close();
			}
				
		}
		
		


	}

}
