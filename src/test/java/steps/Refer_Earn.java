package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_factory.DriverFactory;
import pom.Refer_earn;

public class Refer_Earn {
	Refer_earn Refer_earn = new Refer_earn(DriverFactory.getDriver());
	WebDriver driver = DriverFactory.getDriver();
	String URL = "https://trade.mirae-asset.co.in/#/login";
	 String ReferralURL = "https://ekyc.miraeassetcm.com/Register-with-us?ref=REF1707585%26refsrc=2";
	
	@Given("the user is on the logins page")
	public void the_user_is_on_the_login_page() throws InterruptedException {
	    driver.get(URL);
	    
	   // Refer_learn.Loadtime();
	}

	@When("the user enters valid credentials")
	public void the_user_enters_valid_credentials() throws InterruptedException {
		Refer_earn.pophandle();
		Thread.sleep(1000);
		Refer_earn.enterusername();
		Refer_earn.enterpass();
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
		Refer_earn.clkcontineus();
	}

	@When("the user click on the hamburger.")
	public void the_user_click_on_the_hamburger() throws InterruptedException {
		Thread.sleep(2000);
		Refer_earn.clkhamburger();
	}

	@Then("the side bar should be open")
	public void the_side_bar_should_be_open() {
	  System.out.println("The side bar should be open");
	}

	@When("the user click on the {string}")
	public void the_user_click_on_the(String string) throws InterruptedException {
		Thread.sleep(2000);
		Refer_earn.clkRefer_learn();
		Thread.sleep(2000);
		Refer_earn.helpMainPage();
	}

	@Then("the refer and earn page should be open in new tab")
	public void the_refer_and_earn_page_should_be_open_in_new_tab() {
		Refer_earn.refer_featchurl();
	}

	@Then("verify how much time it takes to load the refer and earn page.")
	public void verify_how_much_time_it_takes_to_load_the_refer_and_earn_page() {
		Refer_earn.referpageloadtime();
	}

	@Then("Verify the URL and title")
	public void verify_the_url_and_title() {
		Refer_earn.refer_featchurl();
		Refer_earn.verifytitle();
	}

	@When("User Enter the refrance number")
	public void user_enter_the_refrance_number() throws InterruptedException {
		Refer_earn.referralno();
		Thread.sleep(2000);
	}

	@When("the Click on the Submit button")
	public void the_click_on_the_submit_button() throws InterruptedException {
		Refer_earn.clkSubmt();
	  Thread.sleep(2000);
	 
	}
	@Then("Verify this {string} Message")
	public void verify_this_message(String value) {
		Refer_earn.verifymessage();
		 
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		 Refer_earn.Scrolling();
	   
	}

	@Then("Verify the live refferal Feed")
	public void verify_the_live_refferal_feed() throws InterruptedException  {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Refer_earn.getlivereferralfeed();
		Thread.sleep(6000);
		System.out.println("******************************************************leaderDashboard*************************************************");
		Refer_earn.leaderboard();
		Thread.sleep(6000);
		System.out.println("******************************************************getlivereferralfeed*************************************************");
		Refer_earn.getlivereferralfeed();
	}

	@When("click on  the mail report.")
	public void click_on_the_mail_report() throws InterruptedException {
		Refer_earn.Scrolling();
	   Thread.sleep(1000);
	   Refer_earn.clkEmailRep();
	   
	}

	@Then("Verify Success message {string}")
	public void verify_success_message(String string) {
		Refer_earn.verifysuccessfullmsg();
	    
	}
	@When("Copy the link to share it")
	public void copy_the_link_to_share_it() {
		
	   driver.navigate().refresh();
	   
	}
	
	@When("paste the copied link in a new tab.")
	public void paste_the_copied_link_in_a_new_tab() throws InterruptedException {
		Thread.sleep(1000);
		Refer_earn.clkcopyicon();
	}

	@Then("the user should be redirected to the registration page.")
	public void the_user_should_be_redirected_to_the_registration_page() {
		
	   Refer_earn.verifycopytext();
	   
	}
	
	//***************************************************** Share-link************************************
	
	
	@Given("User on the Share link")
	public void user_on_the_share_link() {
	   driver.get(ReferralURL);
	  // Refer_earn.referralpageloadtime();
	}

	@When("the user Entering the number and click on the get otp button")
	public void the_user_entering_the_number_and_click_on_the_get_otp_button() {
	   Refer_earn.enterPhoneNumber();
	   Refer_earn.clicksubmit();
	}

	@Then("The user Should be redirect on the Enter OTP page")
	public void the_user_should_be_redirect_on_the_enter_otp_page() {
	 Refer_earn.verifyotppage();
	}
	
	//***************************************************** Open-link************************************
	
	@Given("User on the Open link")
	public void user_on_the_open_link() {
	  Refer_earn.openlink();
	}

	@When("the user Entering the number and click on the Start Referring button")
	public void the_user_entering_the_number_and_click_on_the_start_referring_button() {
        Refer_earn.clickstartreferral();
	}

	@Then("The user Should redirect on referral page")
	public void the_user_should_redirect_on_referral_page() {
	    Refer_earn.getcurrenturl();
	}

	

}
