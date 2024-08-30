package stepDefinition;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
	
WebDriver driver;
	
	@Given("User should Open Chrome Browser")
	public void user_should_open_chrome_browser() {
//		System.setProperty("webdriver.chrome.driver", "./chrome_driver/chromedriver.exe");
//		driver = new ChromeDriver();
	}


	@When("User should Enter Url in Browser")
	public void user_should_enter_url_in_browser() {
		
	}


	@When("User Should Navigate Home Page")
	public void user_should_navigate_home_page() {
		
	}


	@When("Enter UserName and Password in Edit Box")
	public void enter_user_name_and_password_in_edit_box() throws Exception {
		
	}


	@When("Click On Login PushButton")
	public void click_on_login_push_button() throws InterruptedException {
		
	}
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		
	}

	@Then("User Should Navigate to Dashboard")
	public void user_should_navigate_to_dashboard() {

	}

	@Then("User Should Logout Holland and Barrett Application")
	public void user_should_logout_holland_and_barrett_application() {
		
	}

	@Then("Message displayed Logout Successfully")
	public void message_displayed_logout_successfully() {
		
	}
}

