package pom;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Margin_tradingp 
{
	
		WebDriver driver;
		@FindBy(xpath ="(//input[@type=\"text\"])[1]") 
		private WebElement Enterno;
		@FindBy(xpath = "//*[text()='Enter mobile number']") 
		private WebElement gettext;
		
		@FindBy(xpath = "(//button[text()='Open Demat Account'])[1]")
		private WebElement OpenAccBtn;
		
		@FindBy(xpath = "//ul[@class=\"PowerfulFeaturesSec_tabNavStrip__8HMxE\"]//li[2]") 
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
		@FindBy(xpath = "//*[text()='Can new or beginner investors benefit by availing Pay Later (MTF)?']") 
		private WebElement clickonarrow;
		@FindBy (xpath = "//*[text()='How to place F&O orders?']") 
		private WebElement clickonnext;
		@FindBy(xpath = "//*[text()='Tata Mutual Funds']") 
		private WebElement clickonanylink;
		
		
		
		
		private WebDriverWait wait;
		List<WebElement> links;
		 
		
		public Margin_tradingp(WebDriver driver) {
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
//	    	 Thread.sleep(2000);
//	    		driver.navigate().back();
	    		
	    	
	     }
	     public void clickbkbtn() throws InterruptedException {

//	    	 String verifytext = gettext.getText();
//	     	System.out.println("Verify the OTP page Title:"+verifytext);
//	     	Thread.sleep(500);
//	     	
//	    	 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    	 wait.until(ExpectedConditions.invisibilityOf(Enterno));
	    	 Thread.sleep(3000);
	     	driver.navigate().back();
	     }
	         public void Scrolling() {
	        	
	 			//down by specific no of the pixcel
	        	 JavascriptExecutor Jv = (JavascriptExecutor)driver;
	 			Jv.executeScript("window.scrollBy(0,1500)");
	      
	     }
	     public void verifytheWachlist() throws InterruptedException {
	    	 Thread.sleep(2000);
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
	    	 Thread.sleep(2000);
	     }
	     public void FAQverify(){
	    	     FAQverifyd.click();
	            System.out.println("Answer: " + FAQverifyd.getText());
	            try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	 		
	    	 
	     }
	     public void clickonarrow() {
	    	 clickonarrow.click();
	    	 System.out.println("Answer: " + clickonarrow.getText());
	    	 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
	     public void clickonnextarrow() throws InterruptedException {
	    	 clickonnext.click();
	    	 System.out.println("Answer of How to place F&O orders?: " + clickonarrow.getText());
	    	 Thread.sleep(2000);
	     }
	     public void getalllinkcount() {
	    	 links = driver.findElements(By.tagName("a"));
			 int linkCount = links.size();
		        System.out.println("Total number of links: " + linkCount);
		        assertTrue(linkCount > 0);
	     }
	     public void clickonanylinks() throws InterruptedException {
	    	 Thread.sleep(2000);
	    	 clickonanylink.click();
	    	 System.out.println("user should be redirect on respectiv page");
	    String	textnextpage = clickonanylink.getText();
	    System.out.println(textnextpage);
	     }
	     
	}

