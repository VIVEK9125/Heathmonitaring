package steps;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_factory.DriverFactory;

public class pledage_mstock 
{
	WebDriver driver = DriverFactory.getDriver();
	List<WebElement> links;
	
	@Given("I am on the pledge-shares page")
	public void i_am_on_the_pledge_shares_page() {
		try { 
			   long startTime = System.currentTimeMillis();
			   driver.get("https://www.mstock.com/sem-landing/pledge-shares");
				//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
    while (!js.executeScript("return document.readyState").toString().equals("complete")) {
        Thread.sleep(100); // Check every 100ms
    }

    // End measuring time
    long endTime = System.currentTimeMillis();

    // Calculate load time
    long loadTime = endTime - startTime;
    System.out.println("pledge_shares_page: " + loadTime + " ms");
		} catch (InterruptedException e) {
      System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
  }
	}

	@When("I enter a mobile number and click on the {string} button")
	public void i_enter_a_mobile_number_and_click_on_the_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user should be redirected to the OTP screen page")
	public void the_user_should_be_redirected_to_the_otp_screen_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify how much time it takes to load the brokerage-savings page")
	public void verify_how_much_time_it_takes_to_load_the_brokerage_savings_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify the pledge-shares page title should be {string}")
	public void verify_the_pledge_shares_page_title_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the pledge-shares page URL should be {string}")
	public void the_pledge_shares_page_url_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("validate the Margin Trading Facility page should contain a heading {string}")
	public void validate_the_margin_trading_facility_page_should_contain_a_heading(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	//*******************************************************brokerage-savings**************************************

	@Given("I am on the brokerage-savings page")
	public void i_am_on_the_brokerage_savings_page() {
		 driver.get("https://www.mstock.com/sem-landing/pledge-shares");
		try { 
			   long startTime = System.currentTimeMillis();
			   //driver.get("https://www.mstock.com/sem-landing/pledge-shares");
				//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
 while (!js.executeScript("return document.readyState").toString().equals("complete")) {
     Thread.sleep(100); // Check every 100ms
 }

 // End measuring time
 long endTime = System.currentTimeMillis();

 // Calculate load time
 long loadTime = endTime - startTime;
 System.out.println("pledge_shares_page: " + loadTime + " ms");
		} catch (InterruptedException e) {
   System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
}
	}

	@Then("verify the brokerage-savings page title should be {string}")
	public void verify_the_brokerage_savings_page_title_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the brokerage-savings page URL should be {string}")
	public void the_brokerage_savings_page_url_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	   
	//***********************************
	
	@Given("Useron the brokerage-savings page.")
	public void useron_the_brokerage_savings_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("enter a mobile number and click on the {string} button.")
	public void enter_a_mobile_number_and_click_on_the_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be redirected to the OTP screen page.")
	public void user_should_be_redirected_to_the_otp_screen_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify how much time it takes to load the brokerage-savings pages.")
	public void verify_how_much_time_it_takes_to_load_the_brokerage_savings_pages() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("verify the brokerage-savings page title should  {string}")
	public void verify_the_brokerage_savings_page_title_should(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the brokerage-savings page URL should {string}")
	public void the_brokerage_savings_page_url_should(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("validate the Margin Trading Facility page should contain heading.{string}")
	public void validate_the_margin_trading_facility_page_should_contain_heading(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
