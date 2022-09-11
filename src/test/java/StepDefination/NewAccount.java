package StepDefination;

import java.io.IOException;
import java.time.Duration;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class NewAccount {
	WebDriver driver=null;HomePage obj;
	
	@Given("Go to url {string}")
	public void go_to_url(String string) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}

	@And("Verify logo is present in webpage")
	public void verify_logo_is_present_in_webpage() {
		obj =new HomePage(driver);
		String Logo_name="Your Store";
		String Actual_Logo_name = driver.findElement(obj.Logo_text()).getText();
		Assert.assertEquals("Logo Verified", Logo_name,Actual_Logo_name);
	}

	@And("Verify Title")
	public void verify_title() {
		String Expected_page_Title="Your Store";
		String Actual_page_Title=driver.getTitle();
		Assert.assertTrue("Title Matches", Expected_page_Title.equals(Actual_page_Title));		
		
	}

	@When("Click on MyAccount and Register")
	public void click_on_my_account_and_register() {
		obj.Clic_on_Register();
	}

	@When("Get Register Account Text")
	public void get_register_account_text() throws IOException {
		String Expected_Register_Pagetext="Register Account";
		Assert.assertTrue("Title Matches", Expected_Register_Pagetext.equals(driver.getTitle()));	
		//test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		//test.addScreenCaptureFromPath("screenshot.png");	
	}

	@Then("Verify Register Account Text is present or not")
	public void verify_register_account_text_is_present_or_not() throws InterruptedException {
		String Expected_regtext="Register Account";
		Assert.assertTrue("Title Matches",Expected_regtext.equals(driver.findElement(obj.RegText()).getText()));	
		Thread.sleep(2000);
		driver.close();
	}

	
	
}
