package StepDefenition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoQATextBox{
	
	WebDriver driver;
	
	@Before
    public void beforeScenario(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\Desktop\\Selenium\\TestNG\\src\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/registration/");
		driver.manage().window().maximize();
    }	
	
	
	@After
    public void afterScenario(){
        driver.quit();
    }
	
	
	@Given("user is on registration page")
	public void user_is_on_registration_page() {
		System.out.println("Navigated to application");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@When("user is able to enter text box")
	public void user_is_able_to_enter_text_box() {
		WebElement FirstName = driver.findElement(By.name("first_name"));
		WebElement LastName = driver.findElement(By.name("last_name"));
		
		 FirstName.sendKeys("Kamalesh");
		 LastName.sendKeys("Sundar");
		 
		 
	}

	@Then("Validation of entered text")
	public void validation_of_entered_text() {
		
		WebElement FirstName = driver.findElement(By.name("first_name"));
		WebElement LastName = driver.findElement(By.name("last_name"));
				
		Assert.assertTrue("FirstName validation failed", FirstName.getAttribute("value").equals("Kamalesh"));
		Assert.assertTrue("LastName validation failed", LastName.getAttribute("value").equals("Sundar"));
			
	}
	
	@When("user is able to select Radio-button")
	public void user_is_able_to_select_Radio_button() {
		WebElement RadioBtn = driver.findElement(By.xpath("//input[@value ='single']"));
		RadioBtn.click();
	}

	@Then("Validation of selected radio-button")
	public void validation_of_selected_radio_button() {
		WebElement RadioBtn = driver.findElement(By.xpath("//input[@value ='single']"));
		Assert.assertTrue("Radio button is not selectable", RadioBtn.isSelected());
			
	}
	
	@When("user is able to select and deselect checkbox")
	public void user_is_able_to_select_and_deselect_checkbox() {
		WebElement ChkBx = driver.findElement(By.xpath("//input[@value = 'reading']"));
		ChkBx.click();
	}

	@Then("Validation of checkbox when selected and deselected")
	public void validation_of_checkbox_when_selected_and_deselected() {
		WebElement ChkBx = driver.findElement(By.xpath("//input[@value = 'reading']"));
		Assert.assertTrue("Check box is not selectable", ChkBx.isSelected());
		
	}

	@When("user is able select dropdown values")
	public void user_is_able_select_dropdown_values() {
		WebElement dropdwn = driver.findElement(By.id("dropdown_7"));
		Select dpdwn = new Select(dropdwn);
		dpdwn.selectByVisibleText("Algeria");
	}

	@Then("Validation of selected value in dropdown")
	public void validation_of_selected_value_in_dropdown() {
		WebElement dropdwn = driver.findElement(By.id("dropdown_7"));
		Assert.assertTrue("Dropdown values are not selectable", dropdwn.getAttribute("value").equals("Algeria"));
		
	}
	
}