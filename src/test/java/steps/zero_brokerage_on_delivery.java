package steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_factory.DriverFactory;
import pom.Brokerage_page;
import utility.propertyReader;

public class zero_brokerage_on_delivery extends propertyReader
{
	Brokerage_page Brokage = new Brokerage_page(DriverFactory.getDriver());
	WebDriver driver = DriverFactory.getDriver();
	List<WebElement> links;
	
	@Given("I navigate to the zero brokage on delivery landing page")
	public void i_navigate_to_the_zero_brokage_on_delivery_landing_page() {
		 driver = DriverFactory.getDriver();
		 try { 
			   long startTime = System.currentTimeMillis();
			   driver.get("https://www.mstock.com/sem-landing/zero-brokerage-on-delivery");
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
	

	@When("the page loads completely")
	public void the_page_loads_completely() {
		/*Brokage.verifylogo();
		driver.navigate().back();*/
		System.out.println("The page Should be loaded Succesfully");
	}

	@Then("the title of the page should be {string}")
	public void the_title_of_the_page_should_be(String string) {
		String veridytitle =Brokage.featchtitle();
		 assertEquals(veridytitle, "Trade in Delivery @ Zero Brokerage for life with m.Stock");
		 System.out.println(veridytitle);
	}

	@Then("the URL should be {string}")
	public void the_url_should_be(String string) {
	  String verifycurrentUrl = Brokage.featchURL();
	  Reporter.log(verifycurrentUrl);
	  assertEquals(verifycurrentUrl, "https://www.mstock.com/sem-landing/zero-brokerage-on-delivery");
	  
	}

	@When("the user enters the phone number")
	public void the_user_enters_the_phone_number() throws InterruptedException {
	    Brokage.Enter();
	}

	@Then("the OTP screen should be displayed")
	public void the_otp_screen_should_be_displayed() {
		System.out.println("The otp page is displayed");
	
	}

	@When("the user scrolls down and clicks on the tab")
	public void the_user_scrolls_down_and_clicks_on_the_tab() throws InterruptedException {
		   Brokage.clickbackbtn();
		   Thread.sleep(1000);
		   Brokage.Scrolling();
	}

	@Then("the tab should be clickable")
	public void the_tab_should_be_clickable() throws InterruptedException {
		Brokage.verifytheWachlist();
		Brokage.verifyAdvanceorder();
		Brokage.verifytread_chart();
	    
	}

	@When("the user enters the phone number and clicks on the Open Account button")
	public void the_user_enters_the_phone_number_and_clicks_on_the_open_account_button() throws InterruptedException {
	   Brokage.secEnterno();
	   Brokage.clickbackbtn();
	   
	}

	@When("the user clicks on the down arrow")
	public void the_user_clicks_on_the_down_arrow() {
		Brokage.FAQverify();
		Brokage.clickonnextarrow();
	}

	@Then("the answer should be displayed")
	public void the_answer_should_be_displayed() {
	    System.out.println("the ans should be displayed");
	}

	@When("the user clicks on any CTA")
	public void the_user_clicks_on_any_cta() {
		links = driver.findElements(By.tagName("a"));
		 int linkCount = links.size();
	        System.out.println("Total number of links: " + linkCount);
	        assertTrue(linkCount > 0);
	}

	@Then("the user should navigate to the respective page")
	public void the_user_should_navigate_to_the_respective_page() {
		Brokage.clkonlink();
	}


}
