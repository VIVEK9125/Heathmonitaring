package steps;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_factory.DriverFactory;
import pom.Feature_and_option;

public class Feature_and_options 
{
	Feature_and_option Feature = new Feature_and_option(DriverFactory.getDriver());
	WebDriver driver = DriverFactory.getDriver();
	
	@Given("I navigate to the feature and options landing page")
	public void i_navigate_to_the_feature_and_options_landing_page() {
		driver = DriverFactory.getDriver();
		
		try { 
			   long startTime = System.currentTimeMillis();
			   driver.get("https://www.mstock.com/sem-landing/futures-and-options");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
          while (!js.executeScript("return document.readyState").toString().equals("complete")) {
              Thread.sleep(100); // Check every 100ms
          }

          // End measuring time
          long endTime = System.currentTimeMillis();

          // Calculate load time
          long loadTime = endTime - startTime;
          System.out.println("ZERO BROKERAGE PAGE LOADED IN: " + loadTime + " ms");
		} catch (InterruptedException e) {
            System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
        }
	}

	@When("the page loads successfully")
	public void the_page_loads_successfully() {
		System.out.println("The page Should be loaded Succesfully");
	}

	@Then("the title of the page should be {string}.")
	public void the_title_of_the_page_should_be(String string) {
		String veridytitle =Feature.featchtitle();
		 assertEquals(veridytitle, "Save unlimited brokerage with Futures & Options @ ₹5/order");
		 System.out.println(veridytitle);
	}

	@Then("the URL should be {string}.")
	public void the_url_should_be(String string) throws InterruptedException {
		 String verifycurrentUrl = Feature.featchURL();
		  Reporter.log(verifycurrentUrl);
		  assertEquals(verifycurrentUrl, "https://www.mstock.com/sem-landing/futures-and-options");
	}

	@When("the user enters the {string} number")
	public void the_user_enters_the_number(String string) throws InterruptedException {
		Feature.Enter();
	}

	@Then("the OTP screen should be displayed.")
	public void the_otp_screen_should_be_displayed() {
		System.out.println("The otp page is displayed");
	}

	@When("the user scrolls down and clicks on the tab.")
	public void the_user_scrolls_down_and_clicks_on_the_tab() throws InterruptedException {
		Feature.clickbackbtn();
		   Thread.sleep(1000);
		   Feature.Scrolling();
	}

	@Then("the tab should be clickable.")
	public void the_tab_should_be_clickable() throws InterruptedException {
		Feature.verifytheWachlist();
		Feature.verifyAdvanceorder();
		Feature.verifytread_chart();
	}

	@When("the user enters the {string} number and clicks on the Open Account button")
	public void the_user_enters_the_number_and_clicks_on_the_open_account_button(String string) throws InterruptedException {
		 Feature.secEnterno();
		   Feature.clickbackbtn();
	}

	@When("the user clicks on the down arrow.")
	public void the_user_clicks_on_the_down_arrow() {
		Feature.FAQverify();
	}

	@Then("the answer should be displayed.")
	public void the_answer_should_be_displayed() throws InterruptedException {
      Feature.FAQverify();
      Feature.clickonarrow();
      Thread.sleep(2000);
      Feature.clickonnextarrow();
	}

	@When("the user clicks on any CTA.")
	public void the_user_clicks_on_any_cta() throws InterruptedException {
		Thread.sleep(2000);
	    Feature.getalllinkcount();
	}

	@Then("the user should navigate to the respective page.")
	public void the_user_should_navigate_to_the_respective_page() throws InterruptedException {
		Thread.sleep(2000);
	    Feature.clickonanylinks();
	}
	

}
