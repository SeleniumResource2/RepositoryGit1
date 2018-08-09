package Wdpack;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PrintCaption_Sports {
	
	@Test
	public void ChromeAccess() throws InterruptedException{
		System.out.println("Printing caption for Basketball on chrome browser");
		System.out.println("=================================================");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\Desktop\\Selenium\\TestNG\\src\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lifetime.life/");
		driver.manage().window().maximize();
			
		WebElement sports = driver.findElement(By.xpath("//*[@id='primaryNav']/li//following::a[contains(@href, 'sports')]"));
		sports.click();
				
		WebElement basketball = driver.findElement(By.xpath("//a[contains(@href, 'basketball.html')]"));
		basketball.click();
				
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[contains(@class, 'col-xs-12')]/h4")).getText();
		System.out.println("Text displayed is : " + text);
		driver.quit();
				
	}
	
	@Test
	public void IEAccess() throws InterruptedException{
		System.out.println("                                             ");
		
		System.out.println("Printing caption for Basketball on IE browser");
		System.out.println("=============================================");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\manju\\Desktop\\Selenium\\TestNG\\src\\Library\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.lifetime.life/");
		driver.manage().window().maximize();
			
		WebElement sports = driver.findElement(By.xpath("//*[@id='primaryNav']/li//following::a[contains(@href, 'sports')]"));
		sports.click();
				
		WebElement basketball = driver.findElement(By.xpath("//a[contains(@href, 'basketball.html')]"));
		basketball.click();
				
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[contains(@class, 'col-xs-12')]/h4")).getText();
		System.out.println("Text displayed is : " + text);
		driver.quit();
		
	}

}
