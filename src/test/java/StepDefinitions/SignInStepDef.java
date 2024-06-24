package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SignInStepDef {
	static WebDriver driver;
	@Given("I am on the sign-in page")
	public void i_am_on_the_sign_in_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://magento.softwaretestingboard.com/");
	}

	@And("I have a registered account with email {string} and password {string}")
	public void i_have_a_registered_account_with_email_and_password(String string, String string2) {
		driver.findElement(By.xpath("//a[@href]//preceding::li[@class='authorization-link'][2]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sonald9@gmail.com");
		driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("Test@12345");
	}

	@When("I enter my credentials and submit the sign-in form")
	public void i_enter_my_credentials_and_submit_the_sign_in_form() {
		driver.findElement(By.xpath("//button[@class='action login primary']")).click();
	}

	@Then("I should see my dashboard or profile page")
	public void i_should_see_my_dashboard_or_profile_page() {
	   String welcome = driver.findElement(By.xpath("//span[text()='Welcome, Sonal Test!']")).getText();
	   Assert.assertEquals(welcome, welcome);
	}
	
	@And("Close the application")
	public void close_the_application() {
	    driver.close();
	}

}
