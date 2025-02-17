package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnScreenPage 
{
	WebDriver driver;
	private WebDriverWait wait;
	List<WebElement> links;
	JavascriptExecutor Jv = (JavascriptExecutor)driver;
	
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
    @FindBy(xpath = "//input[@autocomplete=\"one-time-code\"]") 
    private WebElement Enterotp;
    @FindBy(xpath = "//p[@class='user-name']") 
    private WebElement usernameV;
    
    public OnScreenPage(WebDriver driver) {
    	this.driver=driver;
		PageFactory.initElements(driver, this);
		
    	
    }
    
    public void launchurL() {
    	 try {
    	
             // URL to test
             String OnScreenUrl = "https://trade.mirae-asset.co.in/#/login";

             // Start measuring time
             long startTime = System.currentTimeMillis();

             // Navigate to the page
             driver.get(OnScreenUrl);
             driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

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
    public void enterpass() throws InterruptedException {
    	Thread.sleep(2000);
    	Password.sendKeys("Vivek@91255",Keys.ENTER);
    	//Password.sendKeys("Vivek@9125",Keys.ENTER);
    }
    public void loginbtn() {
    	loginbtn.click();
    }
    
    
    public void Enterotp() {	
        // Sending the OTP
        if (Enterotp != null) {  // Check if Enterotp element is not null
            Enterotp.sendKeys("123"); 
            System.out.println("OTP entered successfully.");
        } else {
        	System.out.println("Enterotp element is not found.");
            return; // Exit the method if Enterotp is null
        }
    }
    
    public void clkcontineus() throws InterruptedException {
    	Thread.sleep(1000);
    	continuebtn.click();
    	
    }
    public void clkhamburger() {
    	hamburger.click();
    }
    public void verifyusername() {
    	String VerifyUN =usernameV.getText();
    	System.out.println(VerifyUN);
    }
    
  //********************************************************Funds Summary*****************************************************
    @FindBy(xpath = "//p[text()='Reports']")
    private WebElement Reports;
    @FindBy(xpath = "//p[text()='Funds Summary']")
    private WebElement Funds;
    @FindBy(xpath = "//p[text()=' Funds related queries? ']")
    private WebElement queries;
    @FindBy(xpath = "//img[@alt=\"right_arrow_onscreen\"]")
    private WebElement downarrow;
    @FindBy(xpath = "//span[text()='by clicking here']")
    private WebElement clkhere;
    @FindBy(xpath = "//textarea[@placeholder=\"Type your query.\"]")
    private WebElement typetext;
    @FindBy(xpath = "//span[text()='Attach your screen']")
    private WebElement Attach;
    @FindBy(xpath = "//button[text()='Raise Query']")
    private WebElement button;
    @FindBy(xpath = "//*[@class=\"text-success text-center\"]")
    private WebElement verify;
    @FindBy(xpath = "//*[text()='Funds Summary - FAQs']")
    private WebElement verifytext;
    @FindBy(xpath = "//*[text()='Query submitted successfully! Kindly refer the Ticket ID - 3008777 for your further reference. You can track the status of it, by visiting the HELP > MY QUERIES tab']")
    private WebElement validmessage;
    long startTime;
    long endTime;
    
    public void clkonreports() {
    	Reports.click();
    }
    public void clkonFunds() {
    	startTime = System.currentTimeMillis();
        Funds.click();
        // Wait for the page to load or some element to be visible
       // WebDriverWait wait = new WebDriverWait(driver, 10);
              //  .until(ExpectedConditions.visibilityOfElementLocated(By.id("result-element")));
        endTime = System.currentTimeMillis();
        long loadTime = endTime - startTime;
        System.out.println("Load time: " + loadTime + " milliseconds");
	
    }
    public void Scrolling() {
    	 JavascriptExecutor Jv = (JavascriptExecutor)driver;
			Jv.executeScript("window.scrollBy(0,2500)");
    }
    public void clkonquerise() {
    	startTime = System.currentTimeMillis();
    	queries.click();
        endTime = System.currentTimeMillis();
        long loadTime = endTime - startTime;
        System.out.println("Load time: " + loadTime + " milliseconds");
	 }
    
    
    public String featchtitle() {
		String verifytitle =driver.getTitle();
		
		return verifytitle;

 }
    public void verifytext() {
    	String verify =verifytext.getText();
    	System.out.println("The pop headline title is:" +verify);
    }
    public void clkarrow() throws InterruptedException {
    	Thread.sleep(2000);
    	downarrow.click();
    }
    public void clkhere() throws InterruptedException {
    	startTime = System.currentTimeMillis();
    	clkhere.click();
        endTime = System.currentTimeMillis();
        long loadTime = endTime - startTime;
        System.out.println("Pop Up Load time: " + loadTime + " milliseconds");
        Thread.sleep(2000);
    }
    public void enterquery() throws InterruptedException{
    	
    	typetext.sendKeys("Please find the attachment");
    Thread.sleep(2000);
    }
    public void ord_attch_file() throws InterruptedException {
    	Attach.click();
		Thread.sleep(2000);
		 try {
			   
	            // Create an instance of Robot class
	            Robot robot = new Robot();
                 Thread.sleep(2000);
	            // Copy the file path to the clipboard
	            StringSelection filePath = new StringSelection("C:\\Users\\vivek.nityo\\git\\New folder\\Heathmonitaring\\Screenshot 2025-02-03 104608.png");
	            Thread.sleep(1000);
	            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
	            Thread.sleep(1000);

	            // Press CTRL+V to paste the file path
	            robot.keyPress(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_V);
	            Thread.sleep(2000);
	            robot.keyRelease(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_CONTROL);
	            Thread.sleep(2000);
	            // Press ENTER to upload the file
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.keyRelease(KeyEvent.VK_ENTER);
	        
	            Thread.sleep(2000);
		   
		  } catch (AWTException e) {
	            e.printStackTrace();
		   }
		
		
	}
    public void clkraisequeri() throws InterruptedException {
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		 button.click();
		 Thread.sleep(1000);
	 }
    public void verifymessage() {
    	 String Expected="Query submitted successfully! Kindly refer the Ticket ID - 3008777 for your further reference. You can track the status of it, by visiting the HELP > MY QUERIES tab";
 	 System.out.println("Verify message:"+Expected);
    }
    
  //************************************************************Leader************************************************************ 
    @FindBy(xpath = "//p[text()='Ledger']")
    private WebElement Ledger;
    @FindBy(xpath = "//p[text()=' Ledger report related queries? ']")
    private WebElement Ledgerclk;
    @FindBy(xpath = "//*[text()='Ledger Report - FAQs']")
    private WebElement verifyledger;
    
    public void clkledger() throws InterruptedException {
    	Thread.sleep(2000);
    	Ledger.click();
    }
    public void clkonqueri() throws InterruptedException {
    	Thread.sleep(2000);
    	Ledgerclk.click();
    }
    public void handlepopup() {
    	// Switch to the alert
    	Alert alert = driver.switchTo().alert();

    	// Get the alert text
    	String alertText = alert.getText();
    	System.out.println("Alert text: " + alertText);

    	// Accept the alert
    	alert.accept();
    }
    public void verifytitle() {
    	String verifytitle = verifyledger.getText();
    	System.out.println("The pop-up title is:"+verifytitle);
    }
    
  //************************************************************Trade History************************************************************ 
    @FindBy(xpath = "//p[text()='Trade History ']")
    private WebElement Trade_History;
    @FindBy(xpath = "//p[text()=' Trade history related queries? ']")
    private WebElement Trade_history;
    @FindBy(xpath = "//p[text()='Trade History - FAQ']")
    private WebElement verifyTrade;
    
    public void clkTrade_History() throws InterruptedException {
    	Thread.sleep(2000);
    	Trade_History.click();
    }
    public void clk_trade_History() throws InterruptedException {
    	Thread.sleep(2000);
    	Trade_history.click();
    }
    public void handle_trade_popup() {
    	// Switch to the alert
    	Alert alert = driver.switchTo().alert();

    	// Get the alert text
    	String alertText = alert.getText();
    	System.out.println("Alert text: " + alertText);

    	// Accept the alert
    	alert.accept();
    }
    public void verify_trade_title() {
    	String verifytitle = verifyTrade.getText();
    	System.out.println("The pop-up title is:"+verifytitle);
    }
    
    
    //************************************************************IPO************************************************************
    @FindBy(xpath = "//p[text()='IPO']") private WebElement IPO;
    @FindBy(xpath = "//*[text()='IPO Listing']") private WebElement IPOpage;
    @FindBy(xpath = "//a[text()=' IPO related queries?']") 
    private WebElement IPOqueries;
    @FindBy(xpath = "//p[text()='IPO']") 
    private WebElement VerifyIPO;
    @FindBy(xpath = "//button[@type='button']") 
    private WebElement arrowbutton;
    @FindBy(xpath = "//p[text()='Help']") 
    private WebElement help;
    @FindBy(xpath = "//*[text()='Quick Links']") 
    private WebElement gettext;
    @FindBy(xpath = "//ul[@id=\"listingquery\"]") 
    private WebElement getcrrentqueires;
    
    
    
    public void clkonIPO() throws InterruptedException {
    	Thread.sleep(2000);
    	startTime = System.currentTimeMillis();
    	IPO.click();
        // Wait for the page to load or some element to be visible
       // WebDriverWait wait = new WebDriverWait(driver, 10);
              //  .until(ExpectedConditions.visibilityOfElementLocated(By.id("result-element")));
        endTime = System.currentTimeMillis();
        long loadTime = endTime - startTime;
        System.out.println("Load time: " + loadTime + " milliseconds");
    	
    }
    
    public void helpnewPage() throws InterruptedException {
		Thread.sleep(2000);
		//Get the list of all open tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
 
        // Switch to the new tab
        driver.switchTo().window(tabs.get(1));
        
		System.out.println("HELP MAIN PAGE TITLE IS  :" + driver.getTitle() +"AND HELP PAGE OPEN SUCCESSFULLY");
		
		Thread.sleep(2000);
	}
    public String  Verifypage() {
    	
    	String verifypage = IPOpage.getText();
    	return verifypage;
    }
    public void clkIPOrelated() throws InterruptedException {
    	Thread.sleep(2000);
    	IPOqueries.click();
    }
    
    public void IPOpagetitile() {
    	String verifytext =VerifyIPO.getText();
    	System.out.println(verifytext);
    }
    
    public void helpMainPage() throws InterruptedException {
		Thread.sleep(2000);
		//Get the list of all open tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
 
        // Switch to the new tab
        driver.switchTo().window(tabs.get(0));
        
		System.out.println("HELP MAIN PAGE TITLE IS  :" + driver.getTitle() +"AND HELP PAGE OPEN SUCCESSFULLY");
		//String helpurl=driver.getCurrentUrl();
		//System.out.println("HELP CURRENT PAGE URL IS:  "+helpurl);
		//WebElement jss=driver.findElement(By.xpath("//span[text()=' Write to us here']"));
		Thread.sleep(2000);
	}
    public void Arrowbutton() {
             arrowbutton.click();
    }
    public void helppage() {
    	startTime = System.currentTimeMillis();
        help.click();
        // Wait for the page to load or some element to be visible
       // WebDriverWait wait = new WebDriverWait(driver, 10);
              //  .until(ExpectedConditions.visibilityOfElementLocated(By.id("result-element")));
        endTime = System.currentTimeMillis();
        long loadTime = endTime - startTime;
        System.out.println("Load time: " + loadTime + " milliseconds");
    }
    public void getCurrentraisequiery() {
    	String verifydata = getcrrentqueires.getText();
    	System.out.println(verifydata);
    }
    public void help2Page() throws InterruptedException {
		Thread.sleep(2000);
		//Get the list of all open tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
 
        // Switch to the new tab
        driver.switchTo().window(tabs.get(2));
        
		System.out.println("HELP MAIN PAGE TITLE IS  :" + driver.getTitle() +"AND HELP PAGE OPEN SUCCESSFULLY");
		
		Thread.sleep(2000);
	}
    public void Actiondown() {
    	//  down the page using the Page Down key
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
    public void haldleNotifiaction() {
    	Alert alert = driver.switchTo().alert();
    	//alert.accept();
    	alert.dismiss();
    }
    
    
    
    


}
