package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_factory.DriverFactory;
import pom.OnScreenPage;

public class OnScreenStep {
	
	OnScreenPage OnScreen = new OnScreenPage(DriverFactory.getDriver());
	WebDriver driver = DriverFactory.getDriver();
	String OnScreenUrl = "https://trade.mirae-asset.co.in/#/login";
	
	
	@Given("the user is on the logins page.")
	public void the_user_is_on_the_logins_page() throws InterruptedException {
		OnScreen.launchurL();
		
	}

	@When("the user enters valid credential.")
	public void the_user_enters_valid_credential() throws InterruptedException {
		OnScreen.pophandle();
		OnScreen.enterusername();
		OnScreen.enterpass();
	    Thread.sleep(1000);
	}

	@When("clicks login button.")
	public void clicks_login_button() {
		System.out.println("The Login button is clicked");
	}

	@When("Entering  valid otp.")
	public void entering_valid_otp() {
		//OnScreen.Enterotp();
	}

	@Then("user should be redirected to the dashboard.")
	public void user_should_be_redirected_to_the_dashboard() throws InterruptedException {
	
		Thread.sleep(1000);
		OnScreen.clkcontineus();
	}

	@When("the user click on hamburger")
	public void the_user_click_on_hamburger() {
		OnScreen.clkhamburger();
	}

	@Then("the side bar should open.")
	public void the_side_bar_should_open() {
		  OnScreen.verifyusername();
	}
	//********************************************************Funds Summary*****************************************************
	
	@When("the user clicks on the Reports Menu")
	public void the_user_clicks_on_the_reports_menu() {
	    OnScreen.clkonreports();
	}
	@When("the user clicks on the Funds Summary")
	public void the_user_clicks_on_the_funds_summary() {
	    OnScreen.clkonFunds();
	}

	@Then("the Funds Summary page is opened")
	public void the_funds_summary_page_is_opened() {
	   String verifytitle= OnScreen.featchtitle();
	   System.out.println(verifytitle);
	}

	@When("the user clicks on {string}")
	public void the_user_clicks_on(String value) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		OnScreen.clkonquerise();
		
	}

	@Then("the pop-up should open")
	public void the_pop_up_should_open() {
	 OnScreen.verifytext();
	}

	@When("the user clicks on any arrow in this pop-up")
	public void the_user_clicks_on_any_arrow_in_this_pop_up() {
	    OnScreen.clkarrow();
	}

	@When("the user clicks on the {string} button")
	public void the_user_clicks_on_the_button(String string) {
	  OnScreen.clkhere();
	}

	@When("the user enters their query and attaches their attachment")
	public void the_user_enters_their_query_and_attaches_their_attachment() throws InterruptedException {
	   OnScreen.enterquery();
	   OnScreen.ord_attch_file();
	}

	@When("clicks on the Raise Query button")
	public void clicks_on_the_raise_query_button() {
	OnScreen.clkraisequeri();
	}

	@Then("the query is attached successfully")
	public void the_query_is_attached_successfully() {
	   OnScreen.verifymessage();
	}
	//********************************************************Ledger**********************************************************
	@When("the user clicks on the Ledger Summary")
	public void the_user_clicks_on_the_ledger_summary() throws InterruptedException {
	    OnScreen.clkledger();
	    Thread.sleep(2000);
	    
	}
	
	@When("the user clicks on\" Ledger report related queries?\"")
	public void the_user_clicks_on_ledger_report_related_queries() {
		OnScreen.clkonqueri();
	}
	@Then("the Ledger Summary page is opened")
	public void the_ledger_summary_page_is_opened() {
		 String verifytitle= OnScreen.featchtitle();
		   System.out.println(verifytitle);
	}
	
	//********************************************************IPO***************************************************************
	@When("the click on IPO")
	public void the_click_on_ipo() {
	    
	}

	@Then("The IPO page Should be open")
	public void the_ipo_page_should_be_open() {
	    
	}



}
