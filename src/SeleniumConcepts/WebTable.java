package SeleniumConcepts;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launches the browser	
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//int rowsNo = driver.findElements(By.xpath("//a[contains(text(),'Symphony')]/parent::td/parent::*")).size();
		//System.out.println("Count of rows: "+rowsNo);
		
		//Thread.sleep(2000);
		
		List<WebElement> colsNo = driver.findElements(By.xpath("//table[contains(@class,'dataTable')]/tbody/tr/td"));
		System.out.println(colsNo.size());
		//int colsNo = driver.findElements(By.xpath("//a[contains(text(),'Symphony')]/parent::td/parent::*/child::*")).size();
		
		/*for(WebElement c: colsNo)
		{
			System.out.println("Count of Columns: "+c.getText());
		}*/
		
		/*String rowData = driver.findElement(By.xpath("//a[contains(text(),'Symphony')]/parent::td/parent::*")).getText();
		System.out.println("Row Data :"+rowData); */
		
		//String colData = driver.findElement(By.xpath("//a[contains(text(),'Symphony')]/parent::td/parent::*/child::*")).getText();
		//System.out.println("Columns Data: "+colData);*/
		
		
		//CurrentPrice = //table[contains(@Class,'dataTable')]/tbody/tr/td[4]
		
		String firstPart = "//table[contains(@class,'dataTable')]/tbody/tr[";
		String secondPart = "]/td[4]";
		
		Set<Double> ts = new TreeSet<Double>();
		
		for (int i=1; i<colsNo.size(); i++)
		{
			String finalPart = firstPart + i + secondPart;
			//System.out.println(finalPart);
			
			String CPrice = driver.findElement(By.xpath(finalPart)).getText();
			Double Price = Double.parseDouble(CPrice);
			//System.out.println(Price);
			ts.add(Price);
			System.out.println(ts);
		}
				
		
		
		


	}

}
