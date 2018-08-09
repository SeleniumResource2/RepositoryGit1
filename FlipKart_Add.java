package Wdpack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FlipKart_Add {
	
	public static void main(String[] args) {
		access(2);
	}
	
	public static void access(int Product){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\Desktop\\Selenium\\TestNG\\src\\Library\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("button._2AkmmA _29YdH8)]")).click();
		
		driver.findElement(By.className("LM6RPg")).sendKeys("phone 6", Keys.ENTER);
		/*driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='bhgxx2 col-12-12']/following::div[@class='_3wU53n']")).click();*/
		
		/*List<WebElement> parentElement=driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		
		int totalPrdt = parentElement.size();
		//System.out.println("Total items are : " +  totalPrdt);
		for(int i = 0; i<totalPrdt; i++){
			
			WebElement name = parentElement.get(i);
			System.out.println("Mobile Name is: " + i + " ==> " + name.getText());
			
			if(name.equals(Product)){

				parentElement.get(i).click();
				break;
			}
		}*/
	
		
}
}
