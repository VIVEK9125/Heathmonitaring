package steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_factory.DriverFactory;
import pom.Margin_tradingp;
import utility.propertyReader;

public class Margin_trading extends propertyReader
{
	Margin_tradingp Margin = new Margin_tradingp(DriverFactory.getDriver());
	WebDriver driver = DriverFactory.getDriver();
	List<WebElement> links;
	
	
	@Given("I navigate to the Margin trading landing page")
	public void i_navigate_to_the_margin_trading_landing_page() {
	    
		try { 
			   long startTime = System.currentTimeMillis();
			   driver.get("https://www.mstock.com/sem-landing/margin-trading");
				//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
       while (!js.executeScript("return document.readyState").toString().equals("complete")) {
           Thread.sleep(100); // Check every 100ms
       }

       // End measuring time
       long endTime = System.currentTimeMillis();

       // Calculate load time
       long loadTime = endTime - startTime;
       System.out.println("Margin trading PAGE LOADED IN: " + loadTime + " ms");
		} catch (InterruptedException e) {
         System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
     }
	}

	@When("the title of the page should  {string}")
	public void the_title_of_the_page_should(String string) {
		System.out.println("The page Should be loaded Succesfully");
	}

	@When("the URL should  {string}")
	public void the_url_should(String string) {
		String veridytitle =Margin.featchtitle();
		 assertEquals(veridytitle, "Trade with m.Stock's Pay Later (MTF) Facility - Know all about MTF");
		 System.out.println(veridytitle);
	}

	@Then("The title should be displayed")
	public void the_title_should_be_displayed() {
		 String verifycurrentUrl = Margin.featchURL();
		  Reporter.log(verifycurrentUrl);
		  assertEquals(verifycurrentUrl, "https://www.mstock.com/sem-landing/margin-trading");
	}

	@When("The user enters the phone number")
	public void the_user_enters_the_phone_number() throws InterruptedException {
		Margin.Enter();
	}

	@Then("The OTP screen should be displayed")
	public void the_otp_screen_should_be_displayed() {
		System.out.println("The otp page is displayed");
	}

	@When("The user scrolls down and clicks on the tab")
	public void the_user_scrolls_down_and_clicks_on_the_tab() throws InterruptedException {
		Margin.clickbkbtn();
		   Thread.sleep(2000);
		   Margin.Scrolling();
	}

	@Then("The tab should be clickable")
	public void the_tab_should_be_clickable() throws InterruptedException {
		Margin.verifytheWachlist();
		Margin.verifyAdvanceorder();
		Margin.verifytread_chart();
	}

	@When("The user enters the phone number and clicks on the Open Account button")
	public void the_user_enters_the_phone_number_and_clicks_on_the_open_account_button() throws InterruptedException {
		Margin.secEnterno();
		Margin.clickbkbtn();
	}

	@When("The user clicks on the down arrow")
	public void the_user_clicks_on_the_down_arrow() {
		
		Margin.clickonarrow();
	}

	@Then("The answer should be displayed")
	public void the_answer_should_be_displayed() {
		 System.out.println("the ans should be displayed");
	}

	@When("The user clicks on any CTA")
	public void the_user_clicks_on_any_cta() {
		links = driver.findElements(By.tagName("a"));
		 int linkCount = links.size();
	        System.out.println("Total number of links: " + linkCount);
	        assertTrue(linkCount > 0);
	}

	@Then("The user should navigate to the respective page")
	public void the_user_should_navigate_to_the_respective_page() {
		Margin.clickonanylinks();
	}

}
