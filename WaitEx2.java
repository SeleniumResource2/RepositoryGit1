package GreensWD;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitEx2 {
	
	static WebDriver driver;
	public static void main(String[] args) throws AWTException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\Desktop\\Selenium\\TestNG\\src\\Library\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.lifetime.life/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement locations = driver.findElement(By.xpath("//a[text()='Locations']"));
	
	Actions acc = new Actions(driver);
	acc.moveToElement(locations).perform();
	locations.click();
	WebElement AllLoc = driver.findElement(By.xpath("//a[text()='All Locations']"));
	
	acc.moveToElement(AllLoc).perform();
	AllLoc.click();
	
	driver.findElement(By.id("locationInput")).sendKeys("NY USA", Keys.ENTER);

	WebElement GardenCity = driver.findElement(By.xpath("//span[text()='21.1 mi']"));
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.textToBePresentInElement(GardenCity, "21.1 mi"));
	
	driver.findElement(By.xpath("(//div//a[text()='Join'])[4]")).click();
	
	driver.quit();
	
}
}