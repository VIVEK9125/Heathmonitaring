package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_factory.DriverFactory;
import pom.login_Fail_pom;

public class Login_fail {

	login_Fail_pom login = new login_Fail_pom(DriverFactory.getDriver());
	WebDriver driver = DriverFactory.getDriver();
	//String cugUrl = "https://trade.mirae-asset.co.in/#/login";
	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() throws InterruptedException {
		login.cugurL();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		login.pophandle();
	}

	@When("the user enters invalid credentials")
	public void the_user_enters_invalid_credentials() throws InterruptedException {
		
		login.handleAlert();
	 login.enteruser();
	 login.enterpassword();
	}

	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
	   login.login_button();
	}

	@Then("the {string} error message should be displayed")
	public void the_error_message_should_be_displayed(String string) throws InterruptedException {
	   login.VerifyTextonnextpage();
	}

}
