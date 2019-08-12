package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterDemo {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
 
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("window.location='https://www.ebay.com/'");
		
		js.executeScript("document.getElementById('gh-ac').value='Mobile'");
		
		js.executeScript("document.getElementById('gh-btn').click()");
		
		String URL = js.executeScript("return document.URL;").toString();
		System.out.println("URL of the page: "+URL);
		

		String domain = js.executeScript("return document.domain;").toString();
		System.out.println("Domain of the page: "+domain);
		

		String title = js.executeScript("return document.title;").toString();
		System.out.println("Title of the page: "+title);
		
		//Refreshing the page
		js.executeScript("history.go(0)");
		
		//Scrolling to the bottom of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		
		//Scrolling to the top of the page
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(4000);
		
		//Scrolling till particular height --- bottom
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(3000);
		
		//Scrolling till the identified Element
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//h3[@class='s-item__title'][contains(text(),'100% Original Classic Nokia 8800 Factory Unlocked ')]")));
		Thread.sleep(5000);
		
		//Scrolling till particular height --- top
		js.executeScript("window.scrollBy(0,-1500)");
		Thread.sleep(3000);

		//Zoom in
		js.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(3000);
		
		//Zoom out
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(3000);



	}

}
