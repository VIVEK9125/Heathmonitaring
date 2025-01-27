package pom;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Feature_and_option 
{
	WebDriver driver;
	@FindBy(xpath ="(//input[@id=\"txtMobileNo\"])[1]") 
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
	@FindBy(xpath = "//*[text()=' Once your eKYC process is completed, you can trade through our online trading platform or mobile application.']") 
	private WebElement FAQverifyd;
	@FindBy(xpath = "//*[text()='How much brokerage is charged on F&O trades?']") 
	private WebElement clickonarrow;
	@FindBy (xpath = "//*[text()='How to place F&O orders?']") 
	private WebElement clickonnext;
	@FindBy(xpath = "//*[text()='Mirae Asset Mutual Funds']") 
	private WebElement clickonanylink;
	
	
	
	
	private WebDriverWait wait;
	List<WebElement> links;
	 
	
	public Feature_and_option(WebDriver driver) {
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
 			Jv.executeScript("window.scrollBy(0,600)");
      
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
    	     FAQverifyd.click();
            System.out.println("Answer: " + FAQverifyd.getText());
 		
    	 
     }
     public void clickonarrow() {
    	 clickonarrow.click();
    	 System.out.println("Answer: " + clickonarrow.getText());
     }
     public void clickonnextarrow() {
    	 clickonnext.click();
    	 System.out.println("Answer of How to place F&O orders?: " + clickonarrow.getText());
     }
     public void getalllinkcount() {
    	 links = driver.findElements(By.tagName("a"));
		 int linkCount = links.size();
	        System.out.println("Total number of links: " + linkCount);
	        assertTrue(linkCount > 0);
     }
     public void clickonanylinks() {
    	 clickonanylink.click();
    	 System.out.println("user should be redirect on respectiv page");
    String	textnextpage = clickonanylink.getText();
    System.out.println(textnextpage);
     }
     
  

}
