package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Brokerage_page 
{
	
	WebDriver driver;
	@FindBy(xpath ="(//input[@id='txtMobileNo'])[1]") 
	private WebElement Enterno;
	@FindBy(xpath = "//h2[text()='Enter mobile number']") 
	private WebElement gettext;
	
	@FindBy(xpath = "(//button[text()='Open Demat Account'])[1]")
	private WebElement OpenAccBtn;
	
	@FindBy(xpath = "//*[text()='Watchlist PRO']") 
	private WebElement clkWatchlist;
	@FindBy(xpath = "//header[@class='Header_header__gtmFw Header_notopBar__ki4Wf Header_stickyMarTop30__SPeBj ']//img")
	private WebElement logo;
	
	@FindBy(xpath = "//*[text()='Advanced order types']") 
	private WebElement advance_order;
	
	@FindBy(xpath = "//*[text()='Trade from charts']") 
	private WebElement tread_chart;
	@FindBy(xpath = "(//input[@id='txtMobileNo'])[2]") 
	private WebElement secondNo;
	@FindBy(xpath = "(//button[text()='Open Demat Account'])[2]") 
	private WebElement opac2;
	@FindBy(xpath = "//*[text()='With an m.Stock Demat account, you can place Delivery trades at ZERO brokerage.']") 
	private WebElement FAQverify;
	@FindBy(xpath = "//*[text()='Can I use margin funding through Pay Later (MTF) for delivery trades?']") 
	private WebElement clickonnext;
	@FindBy(xpath = "//*[text()='HDFC Mutual Funds']") private WebElement clickonlink;
	
	
	
	private WebDriverWait wait;
	 
	
	public Brokerage_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	 public String featchtitle() {
			String verifytitle =driver.getTitle();
			
			return verifytitle;
	
	 }
	 public String featchURL() {
		String verifyURL = driver.getCurrentUrl();
		return verifyURL;
	 }
	 public void verifylogo() {
		 logo.click();
		 wait.until(ExpectedConditions.invisibilityOf(Enterno));
		 
		
	 }
     public void Enter() throws InterruptedException  {
    	 
    	 Enterno.sendKeys("9284267915");
    	 Thread.sleep(2000);
    	 
    	 OpenAccBtn.click();
    	
     }
     public void clickbackbtn() {

    	 String verifytext = gettext.getText();
     	System.out.println("Verify the OTP page Title:"+verifytext);
     	
    	 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait.until(ExpectedConditions.invisibilityOf(Enterno));
         driver.navigate().back();
     }
         public void Scrolling() {
        	
 			//down by specific no of the pixcel
        	 JavascriptExecutor Jv = (JavascriptExecutor)driver;
 			Jv.executeScript("window.scrollBy(0,1200)");
      
     }
     public void verifytheWachlist() throws InterruptedException {
    	 clkWatchlist.click();
    	 String watchlistytext =clkWatchlist.getText();
    	 System.out.println("Title of the tab is :"+watchlistytext);
    	 Thread.sleep(2000);

     }
     public void verifyAdvanceorder() throws InterruptedException {
    	
    	 advance_order.click();
    	 String advanceorder =advance_order.getText();
    	 System.out.println("Title of the tab is :"+advanceorder);
    	 Thread.sleep(2000);
    	
     }
     public void verifytread_chart() throws InterruptedException {
    	 tread_chart.click();
    	 String threadchart =tread_chart.getText();
    	 System.out.println("Title of the tab is :"+threadchart);
    	 Thread.sleep(2000);
     }
    
     public void secEnterno() throws InterruptedException {
    	 secondNo.sendKeys("9284267912");
    	 Thread.sleep(3000);
    	 opac2.click();
     }
     public void FAQverify(){
    	  FAQverify.getText();
    	  System.out.println("Answer: " + FAQverify.getText());
    	 
     }
     public void clickonnextarrow() {
    	 clickonnext.click();
    	 System.out.println("Answer: " + clickonnext.getText());
     }
     public void clkonlink () {
    	 clickonlink.click();
    	 String	textnextpage = clickonlink.getText();
    	    System.out.println(textnextpage);
     }
     
  
     
}
