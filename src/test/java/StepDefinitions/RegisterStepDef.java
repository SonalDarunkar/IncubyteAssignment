package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDef {
	static WebDriver driver;
	
	@Given("I am on the registration page")
	public void i_am_on_the_registration_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://magento.softwaretestingboard.com/");
	    
	}

	@When("I fill in the registration form with valid details")
	public void i_fill_in_the_registration_form_with_valid_details() {
		driver.findElement(By.linkText("Create an Account")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Sonal");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sonald9@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("Test@12345");
		
	   }

	@And("I submit the registration form")
	public void i_submit_the_registration_form() {
	    driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
	}

	@Then("I should see a success message")
	public void i_should_see_a_success_message() {
		String value = driver.findElement(By.xpath("//div[text()='Thank you for registering with Main Website Store.']")).getText();
		Assert.assertEquals(value, value);
		
	}
	
	@And("Close the browser")
	public void close_the_browser() {
	 driver.close();
	}

	



}
