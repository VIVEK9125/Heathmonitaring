package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_factory.DriverFactory;
import pom.Feature_and_option;
import pom.Refer_Learn;

public class Refer_And_learn {
	
	Refer_Learn Refer_learn = new Refer_Learn(DriverFactory.getDriver());
	WebDriver driver = DriverFactory.getDriver();
	String URL = "https://trade.mirae-asset.co.in/#/login";
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() throws InterruptedException {
	    driver.get(URL);
	    
	   // Refer_learn.Loadtime();
	}

	@When("the user enters valid credentials")
	public void the_user_enters_valid_credentials() throws InterruptedException {
		Refer_learn.pophandle();
	    Refer_learn.enterusername();
	    Refer_learn.enterpass();
	    Thread.sleep(1000);
	   
	}

	@When("clicks the login button")
	public void clicks_the_login_button() {
		// Refer_learn.loginbtn();
		System.out.println("The Login button is clicked");
	}

	@When("Entering the valid otp")
	public void entering_the_valid_otp() {
	   System.out.println("otp is successfull");
	   
	}

	@Then("the user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() throws InterruptedException {
		Thread.sleep(1000);
		Refer_learn.clkcontineus();
	}

	@When("the user click on the hamburger.")
	public void the_user_click_on_the_hamburger() {
	    Refer_learn.clkhamburger();
	}

	@Then("the side bar should be open")
	public void the_side_bar_should_be_open() {
	  System.out.println("The side bar should be open");
	}

	@When("the user click on the {string}")
	public void the_user_click_on_the(String string) throws InterruptedException {
	  Refer_learn.clkRefer_learn();
	  Refer_learn.helpMainPage();
	}

	@Then("the refer and earn page should be open in new tab")
	public void the_refer_and_earn_page_should_be_open_in_new_tab() {
	   Refer_learn.refer_featchurl();
	}

	@Then("verify how much time it takes to load the refer and earn page.")
	public void verify_how_much_time_it_takes_to_load_the_refer_and_earn_page() {
	 Refer_learn.referpageloadtime();
	}

	@Then("Verify the URL and title")
	public void verify_the_url_and_title() {
		Refer_learn.refer_featchurl();
		Refer_learn.verifytitle();
	}

	@When("User Enter the refrance number")
	public void user_enter_the_refrance_number() throws InterruptedException {
	 Refer_learn.referralno();
	}

	@When("the Click on the Submit button")
	public void the_click_on_the_submit_button() throws InterruptedException {
	  Refer_learn.clkSubmt();
	  Thread.sleep(2000);
	 
	}
	@Then("Verify this {string} Message")
	public void verify_this_message(String text) {
		 Refer_learn.verifymessage();
		 
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		    Refer_learn.Scrolling();
	   
	}

	@Then("Verify the live refferal Feed")
	public void verify_the_live_refferal_feed() throws InterruptedException {
		Refer_learn.getlivereferralfeed();
		Thread.sleep(6000);
		Refer_learn.leaderboard();
		Thread.sleep(6000);
		Refer_learn.getlivereferralfeed();
	}

	@When("click on  the mail report.")
	public void click_on_the_mail_report() {
	   
	}

	@Then("Verify Success message {string}")
	public void verify_success_message(String string) {
	    
	}


}
