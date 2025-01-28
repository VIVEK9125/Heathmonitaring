package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_factory.DriverFactory;
import pom.Organic_sem_Page4;

public class Organic_sem_page_4 
{
	Organic_sem_Page4 organic = new Organic_sem_Page4(DriverFactory.getDriver());
	WebDriver driver=DriverFactory.getDriver();
	String url="https://www.mstock.com/brokerage-calculator";
	String URL2 = "https://www.mstock.com/equity-trading";
	 String IpoURL = "https://www.mstock.com/ipo";
	
	@Given("I am on the brokerage-calculato Page.")
	public void i_am_on_the_brokerage_calculato_page() {
	   driver.get(url);
	}

	@Then("verify the title of the page should {string}")
	public void verify_the_title_of_the_page_should(String string) {
		organic.featchtitle();
	}

	@Then("Page URL should {string}.")
	public void page_url_should(String string) {
		organic.featchurl();
	}

	@Then("Validate page should contain a heading. {string}.")
	public void validate_page_should_contain_a_heading(String string) {
		  organic.verifytitle();
	}

	@Then("Verify how much time takes to load the page.")
	public void verify_how_much_time_takes_to_load_the_page() {
		organic.loadtime();
	}
	
	
	//***************equity-trading**********************//

	@Given("I am on the equity-trading page.")
	public void i_am_on_the_equity_trading_page() {
	   driver.get(URL2);
	}

	@When("the page loads successfully.")
	public void the_page_loads_successfully() {
	    System.out.println("The page is load sucessfull");
	}

	@Then("verify the page title is {string}.")
	public void verify_the_page_title_is(String string) {
	   organic.ET_featchtitle();
	}

	@Then("verify how much time it takes to load the page.")
	public void verify_how_much_time_it_takes_to_load_the_page() {
	   organic.ET_loadtime();
	}

	@When("we enter a mobile number on the main page and click on {string} button")
	public void we_enter_a_mobile_number_on_the_main_page_and_click_on_button(String string) throws InterruptedException {
	    organic.enterno();
	    Thread.sleep(1000);
	    organic.clkbackbtn();
	}

	@When("the page URL is {string}.")
	public void the_page_url_is(String string) {
	   organic.ET_featchurl();
	}

	@When("validate the page contains a heading {string}.")
	public void validate_the_page_contains_a_heading(String string) {
		organic.verifypage();
	    
	}
	//****************************************************************IPO***********************************************

	@Given("I am on the IPO main page.")
	public void i_am_on_the_ipo_main_page() {
	    driver.get(IpoURL);
	}

	@When("we enter a mobile number on the main page and click on the {string} button.")
	public void we_enter_a_mobile_number_on_the_main_page_and_click_on_the_button(String string) throws InterruptedException {
	   organic.enterno2();
	}

	@Then("the user should be redirected to the respective OTP screen page.")
	public void the_user_should_be_redirected_to_the_respective_otp_screen_page() throws InterruptedException {
	   System.out.println("The otp screen should be displayed");
	   organic.clkbackbtnipo();
	}

	@Then("verify how much time it takes to load the IPO page.")
	public void verify_how_much_time_it_takes_to_load_the_ipo_page() {
	    organic.IPO_loadtime();
	}

	@Then("verify the IPO page title is {string}.")
	public void verify_the_ipo_page_title_is(String string) {
	  organic.ipo_featchtitle();
	}

	@Then("the Mstock main page URL is {string}.")
	public void the_mstock_main_page_url_is(String string) {
	  organic.ipo_featchurl();
	  organic.verifyioppageipo();
	}

	
	
	//****************************************************************stock videos***********************************************
	 String StockURL = "https://www.mstock.com/videos";
	@Given("I am on the Mstock videos page.")
	public void i_am_on_the_mstock_videos_page() {
	 driver.get(StockURL);
	}

	@When("I click on a popular topic.")
	public void i_click_on_a_popular_topic() throws InterruptedException {
	   organic.clickon_topic();
	}

	@Then("the topic should change accordingly.")
	public void the_topic_should_change_accordingly() throws InterruptedException {
	  //  organic.clkvideo();
	}

	@Then("verify how much time it takes to load the Mstock videos page.")
	public void verify_how_much_time_it_takes_to_load_the_mstock_videos_page() {
	  organic.stock_loadtime();
	}

	@Then("verify the Mstock videos page title is {string}.")
	public void verify_the_mstock_videos_page_title_is(String string) {
	    organic.Stock_featchtitle();
	}

	@Then("the Organic SEM Open Demat Account page URL is {string}.")
	public void the_organic_sem_open_demat_account_page_url_is(String string) {
	    organic.Stock_featchurl();
	}
	//****************************************************************partner page***********************************************
	
	
	 String partnerURL = "https://www.miraeassetpartners.com/";
	@Given("I am on the partner page.")
	public void i_am_on_the_partner_page() {
	   driver.get(partnerURL);
	}

	@Then("verify the Margin Trading Facility page title is {string}.")
	public void verify_the_margin_trading_facility_page_title_is(String string) {
	  String verifytitlep = organic.partner_featchtitle();
	  System.out.println(verifytitlep);
	}

	@When("I click on the {string}.")
	public void i_click_on_the(String string) {
	    organic.clkviewdoc();
	}

	@Then("the Margin Trading Facility page URL is {string}.")
	public void the_margin_trading_facility_page_url_is(String string) {
		String verifyurl = organic.Partner_featchurl();
		System.out.println(verifyurl);
	}

	@Then("verify how much time it takes to load the Partner page.")
	public void verify_how_much_time_it_takes_to_load_the_partner_page() {
	   organic.partner_loadtime();
	}

}
