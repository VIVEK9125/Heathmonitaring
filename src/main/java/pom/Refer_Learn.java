package pom;

import java.awt.SecondaryLoop;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Refer_Learn 
{
	WebDriver driver;
	private WebDriverWait wait;
	List<WebElement> links;
	
	String referurl = "https://referralapi.mstock.com/Miraereferral/Index/QtaQDxzuf%5E8Lwx6xCN2iw57+4ZWSQ8ot%5EfDXykZ%5EdLQ=";
	@FindBy(xpath = "//input[@id='username']")
	private WebElement Username;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement Password;
    @FindBy(xpath = "//button[text()='LOGIN']")
    private WebElement loginbtn;
    @FindBy(xpath = "//button[text()='I understand, continue']")
    private WebElement continuebtn;
    @FindBy(xpath = "//*[@class='hamburger']")
    private WebElement hamburger;
    @FindBy(xpath = "//*[text()='Refer and Earn']")
    private WebElement Refer_learn;
    @FindBy(xpath = "(//div[@class='wzrk-alert wiz-show-animate']//button)[1]") 
    private WebElement handlepopup;
//    @FindBy(xpath = "//*[@class='hamburger']")
//    private WebElement hamburger;
//    @FindBy(xpath = "//*[@class='hamburger']")
//    private WebElement hamburger;
//    @FindBy(xpath = "//*[@class='hamburger']")
//    private WebElement hamburger;
//    @FindBy(xpath = "//*[@class='hamburger']")
//    private WebElement hamburger;
//    @FindBy(xpath = "//*[@class='hamburger']")
//    private WebElement hamburger;
    
    
    public Refer_Learn(WebDriver driver) {
    	this.driver=driver;
		PageFactory.initElements(driver, this);
		
    	
    }
    
    public void launchurl() {
    	 try {
             // URL to test
             String URL = "https://trade.mirae-asset.co.in/#/login";

             // Start measuring time
             long startTime = System.currentTimeMillis();

             // Navigate to the page
             driver.get(URL);
             driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

             // Wait for the page to load completely
             JavascriptExecutor js=(JavascriptExecutor)driver;
             while (!js.executeScript("return document.readyState").toString().equals("complete")) {
                 Thread.sleep(100); // Check every 100ms
             }

             // End measuring time
             long endTime = System.currentTimeMillis();

             // Calculate load time
             long loadTime = endTime - startTime;
             System.out.println("IPO PAGE LOADED IN: " + loadTime + " ms");
         } catch (InterruptedException e) {
             System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
         }
    }
//    public void Loadtime() throws InterruptedException {
//    	 // URL to test
//        String URL2 = "https://trade.mirae-asset.co.in/#/login";
//
//        // Start measuring time
//        long startTime = System.currentTimeMillis();
//
//        // Navigate to the page
//        driver.get(URL2);
//
//        // Wait for the page to load completely
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        while (!js.executeScript("return document.readyState").toString().equals("complete")) {
//            Thread.sleep(100); // Check every 100ms
//            long endTime = System.currentTimeMillis();
//
//            // Calculate load time
//            long loadTime = endTime - startTime;
//            System.out.println("IPO PAGE LOADED IN: " + loadTime + " ms");
//        }
//    }
    public void pophandle() {
   	 try {
            //wait.until(ExpectedConditions.visibilityOf(handlepopup));
            // Handle the pop-up (e.g., close it)
   		 handlepopup.click();
            System.out.println("Pop-up handled successfully.");
        } catch (NoSuchElementException e) {
            // Pop-up not found, handle accordingly
            System.out.println("Pop-up not found.");
        }
   }
    public void enterusername() throws InterruptedException {
    	Thread.sleep(2000);
    	 Username.sendKeys("9075794960");
    }
    public void enterpass() {
    	Password.sendKeys("Vivek@91255",Keys.ENTER);
    }
    public void loginbtn() {
    	loginbtn.click();
    }
    public void clkcontineus() {
    	continuebtn.click();
    }
    public void clkhamburger() {
    	hamburger.click();
    }
    public void clkRefer_learn() throws InterruptedException {
    	Thread.sleep(1000);
    	Refer_learn.click();
    }
    
    public void referpageloadtime() {
    	 try {
             // URL to test
             String referurl = "https://referralapi.mstock.com/Miraereferral/Index/QtaQDxzuf%5E8Lwx6xCN2iw57+4ZWSQ8ot%5EfDXykZ%5EdLQ=";

             // Start measuring time
             long startTime = System.currentTimeMillis();

             // Navigate to the page
             driver.get(referurl);
             driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

             // Wait for the page to load completely
             JavascriptExecutor js=(JavascriptExecutor)driver;
             while (!js.executeScript("return document.readyState").toString().equals("complete")) {
                 Thread.sleep(100); // Check every 100ms
             }

             // End measuring time
             long endTime = System.currentTimeMillis();

             // Calculate load time
             long loadTime = endTime - startTime;
             System.out.println("IPO PAGE LOADED IN: " + loadTime + " ms");
         } catch (InterruptedException e) {
             System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
         }
    	 
    }
    public void refer_featchurl() {
		String verifyreferurl =driver.getCurrentUrl();
		System.out.println(verifyreferurl);
    }
    public void verifytitle() {
		String verifytitile = driver.getTitle();
		System.out.println(verifytitile);
	 }
    //**************************************************Referral page***************************************************************
   // propertyReader propertyReader;
    @FindBy(xpath = "//input[@id='Mobile']") 
    private WebElement entrnumbr;
    @FindBy(xpath = "//input[@id='submitbtn']") 
    private WebElement Submit;
    @FindBy(xpath = "//*[@style=\"display: block;\"]") 
    private WebElement Sucessfullymsg;
    @FindBy(xpath = "//ul[@id='earned']") 
    private WebElement livedata;
    @FindBy(xpath = "//div[@class='leader-detail-block']")
    private WebElement leaderboard;
    long startTime;
    long endTime;
//    @FindBy(xpath = "//input[@id='submitbtn']") 
//    private WebElement Submit;
//    @FindBy(xpath = "//input[@id='submitbtn']") 
//    private WebElement Submit;

    public void referralno() throws InterruptedException {
    	//wait.until(ExpectedConditions.visibilityOf(entrnumbr));
    	Thread.sleep(2000);
    	entrnumbr.sendKeys("9256898545");
    }
    public void helpMainPage() throws InterruptedException {
		Thread.sleep(2000);
		//Get the list of all open tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
 
        // Switch to the new tab
        driver.switchTo().window(tabs.get(1));
        
		System.out.println("HELP MAIN PAGE TITLE IS  :" + driver.getTitle() +"AND HELP PAGE OPEN SUCCESSFULLY");
    
    }
    public void clkSubmt() {
    	  
          startTime = System.currentTimeMillis();
          Submit.click();
          // Wait for the page to load or some element to be visible
         // WebDriverWait wait = new WebDriverWait(driver, 10);
                //  .until(ExpectedConditions.visibilityOfElementLocated(By.id("result-element")));
          endTime = System.currentTimeMillis();
          long loadTime = endTime - startTime;
          System.out.println("Load time: " + loadTime + " milliseconds");
    }
    public void verifymessage() {
    	String expected="Your referral has been successfully added";
    	String actual = Sucessfullymsg.getText();
    	if(actual.equals(expected)) {
    	System.out.println("message is verified:"+actual);
    	}
    	else {
    		System.out.println("message is not verified:"+ expected+ " but found: " + actual);
    	}
    }
    public void Scrolling() {
    	
			//down by specific no of the pixcel
    	 JavascriptExecutor Jv = (JavascriptExecutor)driver;
			Jv.executeScript("window.scrollBy(0,600)");
  
 }
    public void getlivereferralfeed() {
    	try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
//    	Response response = RestAssured.get(referurl);
//    	livedata.sendKeys(response.getBody().asString());
      System.out.println("Data displayed on front end: " + livedata.getText());
   
    }
    public void leaderboard() {
    	System.out.println("Displayed leaderboard data:"+ leaderboard.getText() );
    }
}
