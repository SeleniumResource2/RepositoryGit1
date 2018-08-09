package Wdpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class MenusList {
	
	@Test
	public void ChromeAccess() {
		System.out.println("Printing menu List on chrome browser");
		System.out.println("====================================");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\Desktop\\Selenium\\TestNG\\src\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lifetime.life/");
		driver.manage().window().maximize();
		
		List<WebElement> menus = driver.findElements(By.xpath("//ul[contains(@class, 'nav nav-neutral')]//a[contains(@class, 'nav-link')]"));
		
		int count = menus.size();
		
		for(int i = 0; i<count-1; i++){
			WebElement value = menus.get(i);
			String text = value.getText();
			
			System.out.println("Menus available are " + text);
		}
		driver.quit();
	}
	
	@Test
	public void IEAccess() {
		System.out.println("Printing menu List on IE browser");
		System.out.println("================================");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\manju\\Desktop\\Selenium\\TestNG\\src\\Library\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.lifetime.life/");
		driver.manage().window().maximize();
		
		List<WebElement> menus = driver.findElements(By.xpath("//ul[contains(@class, 'nav nav-neutral')]//a[contains(@class, 'nav-link')]"));
		
		int count = menus.size();
		
		for(int i = 0; i<count-1; i++){
			WebElement value = menus.get(i);
			String text = value.getText();
			
			System.out.println("Menus available are " + text);
		}
		driver.quit();
	}
	
	

}
