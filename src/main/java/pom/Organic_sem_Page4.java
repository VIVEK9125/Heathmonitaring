package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organic_sem_Page4 
{
	WebDriver driver;
	@FindBy(xpath = "(//input[@id=\"txtMobileNo\"])[1]") 
	private WebElement Enternumber;
	@FindBy(xpath = "(//button[@id='openAccountBtn'])[1]") 
	private WebElement clkgetStart;
	@FindBy(xpath = "(//input[@id=\"txtMobileNo\"])[2]") 
	private WebElement Enternumber2;
	@FindBy(xpath = "(//button[text()='Open Demat Account']") 
	private WebElement clkopen_Account;
	@FindBy(xpath = "(//*[text()='Brokerage Calculator'])[1]") 
	private WebElement title;
	@FindBy(xpath = "//*[text()='Equity Trading Account']") 
	private WebElement contain;
	@FindBy(xpath = "//*[text()='IPOs']") 
	private WebElement verifyipo;
	
	
	
	
	
	
	
	
	public Organic_sem_Page4(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	 public String featchtitle() {
			String verifytitle =driver.getTitle();
			return verifytitle;
	 }
	 
	 public String featchurl() {
			String verifyurl =driver.getCurrentUrl();
			return verifyurl;
	 }
	 public void loadtime() {
		 try {
	            // URL to test
	            String url = "https://www.mstock.com/brokerage-calculator";

	            // Start measuring time
	            long startTime = System.currentTimeMillis();

	            // Navigate to the page
	            driver.get(url);

	            // Wait for the page to load completely
	            JavascriptExecutor js=(JavascriptExecutor)driver;
	            while (!js.executeScript("return document.readyState").toString().equals("complete")) {
	                Thread.sleep(100); // Check every 100ms
	            }

	            // End measuring time
	            long endTime = System.currentTimeMillis();

	            // Calculate load time
	            long loadTime = endTime - startTime;
	            System.out.println("brokare calcluate PAGE LOADED IN: " + loadTime + " ms");
	        } catch (InterruptedException e) {
	            System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
	        }
	     

	 }
	 //****************************************************************equity-trading*************************
	 
	 
	 public String ET_featchtitle() {
			String verifytitle =driver.getTitle();
			return verifytitle;
	 }
	 
	 public String ET_featchurl() {
			String verifyurl =driver.getCurrentUrl();
			return verifyurl;
	 }
	 public void verifytitle() {
		String verifytitile = title.getText();
		System.out.println(verifytitile);
	 }
	 public void verifyconatin() {
		String  verifyconatin =contain.getText();
		System.out.println(verifyconatin);
	 }
	 public void enterno() throws InterruptedException {
		 Enternumber.sendKeys("9284267989");
		 Thread.sleep(1000);
		 clkgetStart.click();
		 Thread.sleep(1000);
		 
	 }
	 public void clkbackbtn() {
		 
		 driver.navigate().back();
	 }
	 public void verifypage() {
		 String verifytext = contain.getText();
		 System.out.println(verifytext);
	 }
	 public void ET_loadtime() {
		 try {
	            // URL to test
	            String URL2 = "https://www.mstock.com/equity-trading";

	            // Start measuring time
	            long startTime = System.currentTimeMillis();

	            // Navigate to the page
	            driver.get(URL2);

	            // Wait for the page to load completely
	            JavascriptExecutor js=(JavascriptExecutor)driver;
	            while (!js.executeScript("return document.readyState").toString().equals("complete")) {
	                Thread.sleep(100); // Check every 100ms
	            }

	            // End measuring time
	            long endTime = System.currentTimeMillis();

	            // Calculate load time
	            long loadTime = endTime - startTime;
	            System.out.println("Equaty trading PAGE LOADED IN: " + loadTime + " ms");
	        } catch (InterruptedException e) {
	            System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
	        }
	     

	 }
	//****************************************************************IPO***********************************************

	 @FindBy(xpath = "(//button[text()='Open Demat Account'])[1]") private WebElement clkopenaccouunt;
	 public String ipo_featchtitle() {
			String verifytitle =driver.getTitle();
			return verifytitle;
	 }
	 
	 public String ipo_featchurl() {
			String verifyurl =driver.getCurrentUrl();
			return verifyurl;
	 }
	 public void verify_ipo_title() {
		String verifytitile = title.getText();
		System.out.println("The ipo title is:"+verifytitile);
	 }
	 public void verify_conatin() {
		String  verifyconatin =contain.getText();
		System.out.println(verifyconatin);
	 }
	 public void enterno2() throws InterruptedException {
		 Enternumber.sendKeys("9284267989");
		 Thread.sleep(1000);
		 clkopenaccouunt.submit();
		 
	 }
	 public void clkbackbtnipo() throws InterruptedException {
		 Thread.sleep(1000);
		 driver.navigate().back();
	 }
	 public void verifyioppageipo() {
		 String verifyioptext = verifyipo.getText();
		 System.out.println(verifyioptext);
	 }
	 
	 
	 public void IPO_loadtime() {
		 try {
	            // URL to test
	            String IpoURL = "https://www.mstock.com/ipo";

	            // Start measuring time
	            long startTime = System.currentTimeMillis();

	            // Navigate to the page
	            driver.get(IpoURL);

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
	//****************************************************************stock videos***********************************************
	 @FindBy(xpath = "//li[@class='PopularTopicsSec_active__evLyc']") private WebElement sharemarket;
	 @FindBy(xpath = "//*[text()='Demat Account']") private WebElement demataccount;
	 @FindBy(xpath = "(//*[text()='Trading Account'])[1]") private WebElement tradingaccount;
	 @FindBy(xpath = "(//*[text()='Mutual Funds'])[1]") private WebElement Mutual_fund;
	 @FindBy(xpath = "//*[text()='Initial Public Offering (IPO)']") private WebElement IPO1;
	 @FindBy(xpath = "//*[text()='Margin Trading Facility (MTF)']") private WebElement MTF;
	 @FindBy(xpath = "//*[text()='Customer Review']") private WebElement customer_review;
	 @FindBy(xpath = "//*[text()='Intraday Trading']") private WebElement intraday;
	 @FindBy(xpath = "//*[@src=\"https://marktech-images.mstock.com/MACM-CMS/Assets/video_list_img_icon_36_100a5fc006.webp\"]")
	 private WebElement clkvideo;
	 @FindBy(xpath = "//*[text()='Videos']") private WebElement text;
	 

	 
	 public void clickon_topic() throws InterruptedException {
		 demataccount.click();
		 Thread.sleep(1000);
		 tradingaccount.click();
		 Thread.sleep(1000);
		 Mutual_fund.click();
		 Thread.sleep(1000);
		 IPO1.click();
		 Thread.sleep(1000);
		 MTF.click();
		 Thread.sleep(1000);
		 customer_review.click();
		 Thread.sleep(1000);
		 intraday.click();
		 
	 }
	 public String Stock_featchtitle() {
			String verifytitle =driver.getTitle();
			return verifytitle;
	 }
	 public void clkvideo() throws InterruptedException {
		 clkvideo.click();
		 Thread.sleep(1000);
		 clkvideo.clear();
	 }
	 
	 public String Stock_featchurl() {
			String verifyurl =driver.getCurrentUrl();
			return verifyurl;
	 }
	 public void verify_stock_title() {
		String verifytitile = title.getText();
		System.out.println("The ipo title is:"+verifytitile);
	 }
	 public void verify_stock_conatin() {
		String  verifyconatin =contain.getText();
		System.out.println(verifyconatin);
	 }
	 public void stockpgno() throws InterruptedException {
		 Enternumber.sendKeys("9284267989");
		 Thread.sleep(1000);
		 clkopenaccouunt.submit();
		 
	 }
	 public void clkbackbtnstock() throws InterruptedException {
		 Thread.sleep(1000);
		 driver.navigate().back();
	 }
	 public void verifypagestock() {
		 String verifytext = text.getText();
		 System.out.println(verifytext);
	 }
	 
	 
	 public void stock_loadtime() {
		 try {
	            // URL to test
	            String StockURL = "https://www.mstock.com/videos";

	            // Start measuring time
	            long startTime = System.currentTimeMillis();

	            // Navigate to the page
	            driver.get(StockURL);

	            // Wait for the page to load completely
	            JavascriptExecutor js=(JavascriptExecutor)driver;
	            while (!js.executeScript("return document.readyState").toString().equals("complete")) {
	                Thread.sleep(100); // Check every 100ms
	            }

	            // End measuring time
	            long endTime = System.currentTimeMillis();

	            // Calculate load time
	            long loadTime = endTime - startTime;
	            System.out.println("Stock Video PAGE LOADED IN: " + loadTime + " ms");
	        } catch (InterruptedException e) {
	            System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
	        }
	 }
	//****************************************************************partner page***********************************************
	 
	 @FindBy(xpath = "//*[text()='View Document Checklist']") private WebElement clickviewdoc;
	 
	 public String partner_featchtitle() {
			String verifytitle =driver.getTitle();
			return verifytitle;
	 }
	 public void clkviewdoc() {
		 clickviewdoc.click();
	 }
   
     public void verifypagepartner() {
	 String verifytext = text.getText();
	 System.out.println(verifytext);
   }
     public String Partner_featchurl() {
			String verifyurl =driver.getCurrentUrl();
			return verifyurl;
	 }


     public void partner_loadtime() {
	 try {
           // URL to test
           String partnerURL = "https://www.miraeassetpartners.com/";

           // Start measuring time
           long startTime = System.currentTimeMillis();

           // Navigate to the page
           driver.get(partnerURL);

           // Wait for the page to load completely
           JavascriptExecutor js=(JavascriptExecutor)driver;
           while (!js.executeScript("return document.readyState").toString().equals("complete")) {
               Thread.sleep(100); // Check every 100ms
           }

           // End measuring time
           long endTime = System.currentTimeMillis();

           // Calculate load time
           long loadTime = endTime - startTime;
           System.out.println("Partner PAGE LOADED IN: " + loadTime + " ms");
       } catch (InterruptedException e) {
           System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
       }
}
	 
}
