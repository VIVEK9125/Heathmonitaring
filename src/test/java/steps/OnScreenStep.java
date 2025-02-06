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
		Thread.sleep(2000);
		//OnScreen.haldleNotifiaction();
		
	}

	@When("the user enters valid credential.")
	public void the_user_enters_valid_credential() throws InterruptedException {
		OnScreen.pophandle();
		OnScreen.enterusername();
		
		Thread.sleep(1000);
		OnScreen.enterpass();
	    Thread.sleep(2000);
	    
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
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OnScreen.clkhamburger();
	}

	@Then("the side bar should open.")
	public void the_side_bar_should_open() {
		  OnScreen.verifyusername();
	}
	//********************************************************Funds Summary*****************************************************
	
	@When("the user clicks on the Reports Menu")
	public void the_user_clicks_on_the_reports_menu() {
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    OnScreen.clkonreports();
	}
	@When("the user clicks on the Funds Summary")
	public void the_user_clicks_on_the_funds_summary() throws InterruptedException {
		 Thread.sleep(2000);
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
			Thread.sleep(2000);
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
	public void the_user_clicks_on_any_arrow_in_this_pop_up() throws InterruptedException {
	    OnScreen.clkarrow();
	}

	@When("the user clicks on the {string} button")
	public void the_user_clicks_on_the_button(String string) throws InterruptedException {
	  OnScreen.clkhere();
	}

	@When("the user enters their query and attaches their attachment")
	public void the_user_enters_their_query_and_attaches_their_attachment() throws InterruptedException {
	   OnScreen.enterquery();
	   OnScreen.ord_attch_file();
	}

	@When("clicks on the Raise Query button")
	public void clicks_on_the_raise_query_button() throws InterruptedException {
	OnScreen.clkraisequeri();
	}

	@Then("the query is attached successfully")
	public void the_query_is_attached_successfully() {
	   OnScreen.verifymessage();
	}
	//********************************************************Ledger**********************************************************
	@When("the user clicks on the Reports.")
	public void the_user_clicks_on_the_reports() {
	  OnScreen.clkonreports();
	}

	@When("the user clicks on the Ledger Summary.")
	public void the_user_clicks_on_the_ledger_summary() throws InterruptedException {
	  OnScreen.clkledger();
	}

	@Then("the Ledger Summary page is opened.")
	public void the_ledger_summary_page_is_opened() {
		String verifytitle= OnScreen.featchtitle();
		   System.out.println(verifytitle);
	}

	@When("the user clicks on the\" Ledger report related queries?\" button.")
	public void the_user_clicks_on_the_ledger_report_related_queries_button() throws InterruptedException {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		OnScreen.clkonqueri();
		
	
	}

	@Then("the pop-up should be open")
	public void the_pop_up_should_be_open() {
		 OnScreen.verifytitle();
	}

	@When("the user clicks on any arrow in this pop-up1.")
	public void the_user_clicks_on_any_arrow_in_this_pop_up1() throws InterruptedException {
		 OnScreen.clkarrow();
	}

	@When("the user clicks on {string} button")
	public void the_user_clicks_on_button(String string) throws InterruptedException {
		 OnScreen.clkhere();
	}

	@When("the user enters their query and attaches their attachments.")
	public void the_user_enters_their_query_and_attaches_their_attachments() throws InterruptedException {
		   OnScreen.enterquery();
		   OnScreen.ord_attch_file();
	}

	@When("clicks on Raise Query button.")
	public void clicks_on_raise_query_button() throws InterruptedException {
		OnScreen.clkraisequeri();
	}

	@Then("the query is attacheds successfully.")
	public void the_query_is_attacheds_successfully() {
		 OnScreen.verifymessage();
	}
	
	//************************************************************Trade History************************************************************ 

	@When("the user clicks on the Reports1.")
	public void the_user_clicks_on_the_reports1() {
	  OnScreen.clkonreports();
	}
	
	@When("the user clicks on the Trade_History page.")
	public void the_user_clicks_on_the_trade_history_page() throws InterruptedException {
		OnScreen.clkTrade_History();
	   
	}

	@Then("the Trade_History page is opened.")
	public void the_trade_history_page_is_opened() {
		System.out.println("The page is open");
	}

	@When("the user clicks on the Trade history related queries? button.")
	public void the_user_clicks_on_the_trade_history_related_queries_button() throws InterruptedException {
		Thread.sleep(2000);
		OnScreen.clk_trade_History();
	}

	@Then("the Trade history pop-up should be open")
	public void the_trade_history_pop_up_should_be_open() {
		OnScreen.verify_trade_title();
	}

	@When("the user clicks on any arrow on this pop-up1.")
	public void the_user_clicks_on_any_arrow_on_this_pop_up1() throws InterruptedException {
		OnScreen.clkarrow();
	}

	@When("the user click on the {string} button")
	public void the_user_click_on_the_button(String type) throws InterruptedException {
		OnScreen.clkhere();
	}

	@When("the user enters their query and attaches their attachments on pop up.")
	public void the_user_enters_their_query_and_attaches_their_attachments_on_pop_up() throws InterruptedException {
		OnScreen.enterquery();
		   OnScreen.ord_attch_file();
	}

	@When("clicks on the Raise Query buttons.")
	public void clicks_on_the_raise_query_buttons() throws InterruptedException {
		OnScreen.clkraisequeri();
	}

	@Then("query is attached successfully.")
	public void query_is_attached_successfully() {
		 OnScreen.verifymessage();
	}
	
	
	
	//********************************************************IPO***************************************************************
	@When("the click on IPO")
	public void the_click_on_ipo() throws InterruptedException {
	    OnScreen.clkonIPO();
	    OnScreen.helpnewPage();
	}

	@Then("The IPO page Should be open")
	public void the_ipo_page_should_be_open() {
	    String verify = OnScreen.Verifypage();
	    System.out.println("Verifed the ipo page:"+verify);
	}
	
	@When("the User click on IPO related queries")
	public void the_user_click_on_ipo_related_queries() throws InterruptedException {
		OnScreen.Scrolling();
		Thread.sleep(1000);
	   OnScreen.clkIPOrelated();
	}

	@Then("The IPO pop is opened")
	public void the_ipo_pop_is_opened() {
	  OnScreen.IPOpagetitile();
	}

	@When("the user clicks on arrow on this pop-up.")
	public void the_user_clicks_on_arrow_on_this_pop_up() {
		OnScreen.Arrowbutton();
	}

	@When("the user click on the {string} button on IPO popup")
	public void the_user_click_on_the_button_on_ipo_popup(String string) throws InterruptedException {
		OnScreen.clkhere();
	}

	@When("the user enters their query and attaches the attachments on pop up.")
	public void the_user_enters_their_query_and_attaches_the_attachments_on_pop_up() throws InterruptedException {
		   OnScreen.enterquery();
		   OnScreen.ord_attch_file();
	}

	@When("clicks on the Raise Query button on IPO popup")
	public void clicks_on_the_raise_query_button_on_ipo_popup() throws InterruptedException {
		OnScreen.clkraisequeri();
	}

	@Then("query and attachments is attached successfully.")
	public void query_and_attachments_is_attached_successfully() {
		OnScreen.verifymessage();
	}

	@Then("Back to main page")
	public void back_to_main_page() throws InterruptedException {
	  OnScreen.helpMainPage();
	}

	@When("click on the hamburger")
	public void click_on_the_hamburger() throws InterruptedException {
	   OnScreen.clkhamburger();
	   Thread.sleep(2000);
	}

	@When("click on Help module")
	public void click_on_help_module() {
		
	   OnScreen.helppage();
	}

	@Then("the Help page is open")
	public void the_help_page_is_open() throws InterruptedException {
	    OnScreen.help2Page();
	    Thread.sleep(1000);
	    OnScreen.Scrolling(); 
	    Thread.sleep(1500);
	}

	@Then("the All Recent Queries is displayed on this page")
	public void the_all_recent_queries_is_displayed_on_this_page() {
		OnScreen.Scrolling();
	   OnScreen.getCurrentraisequiery();
	}




}
