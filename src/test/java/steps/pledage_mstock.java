package steps;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_factory.DriverFactory;
import pom.Pladage_Mstocks;

public class pledage_mstock 
{
	Pladage_Mstocks Mstock = new Pladage_Mstocks(DriverFactory.getDriver());
	WebDriver driver = DriverFactory.getDriver();
	List<WebElement> links;
	 String URL2 = "https://www.mstock.com/sem-landing/brokerage-savings";
	 String URL = "https://www.mstock.com/sem-landing/pledge-shares";
	
	@Given("I am on the pledge-shares page")
	public void i_am_on_the_pledge_shares_page() {
	driver.get(URL);
	}

	@When("I enter a mobile number and click on the {string} button")
	public void i_enter_a_mobile_number_and_click_on_the_button(String string) throws InterruptedException {
	   Mstock.Enter();
	   Thread.sleep(1000);
	   
	}

	@Then("the user should be redirected to the OTP screen page")
	public void the_user_should_be_redirected_to_the_otp_screen_page() throws InterruptedException {
	   System.out.println("User Should be redirect on otp page");
	   Thread.sleep(2000);
		Mstock.clickbkbtn();
	}

	
	@Then("verify how much time it takes to load the pledge-shares page")
	public void verify_how_much_time_it_takes_to_load_the_pledge_shares_page()  {
		
		try { 
			   long startTime = System.currentTimeMillis();
			   driver.get("https://www.mstock.com/sem-landing/pledge-shares");
			//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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

	@Then("verify the pledge-shares page title should be {string}")
	public void verify_the_pledge_shares_page_title_should_be(String string) {
	   String verifytitle = Mstock.MStocktitle();
	   System.out.println(verifytitle);
	}

	@Then("the pledge-shares page URL should be {string}")
	public void the_pledge_shares_page_url_should_be(String string) {
	
		String verifyURL = driver.getCurrentUrl();
		System.out.println(verifyURL);
	   	}

	
	
	//*******************************************************brokerage-savings**************************************

	
	@Given("User on the brokerage-savings page.")
	public void user_on_the_brokerage_savings_page() {
	    driver.get(URL2);
	}

	@When("enter a mobile number and click on the {string} button.")
	public void enter_a_mobile_number_and_click_on_the_button(String string) throws InterruptedException {
		Mstock.secEnterno();
		
	}

	@Then("user should be redirected to the OTP screen page.")
	public void user_should_be_redirected_to_the_otp_screen_page() throws InterruptedException {
	      Mstock.clickbkbtn();
	}

	@Then("verify how much time it takes to load the brokerage-savings pages.")
	public void verify_how_much_time_it_takes_to_load_the_brokerage_savings_pages() {
		Mstock.BS_loadtime();
	}
	@Then("verify the brokerage-savings page title should  {string}")
	public void verify_the_brokerage_savings_page_title_should(String string) {
		String verifytitle = Mstock.MStocktitle();
		System.out.println(verifytitle);
	}

	@Then("the brokerage-savings page URL should {string}")
	public void the_brokerage_savings_page_url_should(String string) {
		String verifyurl = Mstock.MStockURL();
		System.out.println(verifyurl);
	}



}
