package GreensWD;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitEx1 {
	
	static WebDriver driver;
	public static void main(String[] args) throws AWTException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\Desktop\\Selenium\\TestNG\\src\\Library\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.bobcat.com/safety-training/resources/courses");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//i[@class='fa fa-sort'])[2]")).click();
	//DropDwnList.click();
	Robot r = new Robot();
	for(int i=1; i<=2; i++){
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	}
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
		//driver.navigate().refresh();
		
		for(int i=0; i<=2; i++){
		try{	
			WebElement RtlCdtn = driver.findElement(By.xpath("//div/img[contains(@src, 'rental-cond')]"));
			RtlCdtn.click();
			break;
		}catch(Exception e){
			e.getMessage();
		}
		}
		
	WebElement RentalTxt = driver.findElement(By.xpath("//div[@class='container']/h3[@class='light-title']"));
	WebDriverWait wait = new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.visibilityOf(RentalTxt));
		
	String title = RentalTxt.getText();
	
	System.out.println("Title captured : " + title);
	driver.quit();
}
}
