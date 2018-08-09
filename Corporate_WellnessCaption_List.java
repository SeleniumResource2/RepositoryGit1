package Wdpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Corporate_WellnessCaption_List {
	
	@Test
	public void ChromeAccess() throws InterruptedException{
		/*System.out.println("Printing caption for Basketball on chrome browser");
		System.out.println("=================================================");*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\Desktop\\Selenium\\TestNG\\src\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lifetime.life/");
		driver.manage().window().maximize();
			
		WebElement Wellness = driver.findElement(By.xpath("//a[contains(@href, 'wellness.html')]"));
		Wellness.click();
				
		WebElement corporate = driver.findElement(By.xpath("//a[contains(@href, 'corpo')]"));
		corporate.click();
				
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//*[contains(@class, 'md-center')]//ancestor::div[@class='content-section p-t-5 p-b-5']")).getText();
		System.out.println("Text displayed is : " + text);
		
		List<WebElement> ImagesList = driver.findElements(By.xpath("//div[@class='content-section p-t-5 p-b-5']//div[@class='row']//img"));
		
		int count = ImagesList.size();
		System.out.println("Refer count of image size :" + count);
		for (int i = 0; i<count ; i++){
			WebElement logo = ImagesList.get(i);
			String value = logo.getAttribute("src");
			value = value.replace("https://www.lifetime.life/content/dam/ltp/images/corporate/corporate-wellness/", " ");
			value =value.replace(".svg", " ");
			System.out.println("Logos dipslayed are : " + value);
		
		}
		driver.quit();
				
	}
	

}
