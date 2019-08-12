package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ExpandCollapse {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser		
		
		driver.get("https://www.hdfcbank.com/personal/ways-to-bank/bank-online/netbanking");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Credit Card NetBanking")).click();
		Thread.sleep(6000);
		
		//driver.switchTo().alert().dismiss();
		
        /*Actions action = new Actions(driver);
		
		Actions act = action.moveToElement(driver.findElement(By.xpath("//div[@id='accordian1']")).click();
		act.build().perform();*/
		
		

       driver.findElement(By.xpath("//h3[@class='clearfix open']")).click();
       Thread.sleep(3000);
       
       String className = driver.findElement(By.xpath("//div[@id='accordian1']")).getAttribute("class");
       
       if(className.contains("clearfix open active"))
       {
    	   System.out.println("List is expanded");
       }
       else
       {
    	   System.out.println("List in NOT expanded");
       }
       
       Thread.sleep(3000);
       driver.close();
	}

}
