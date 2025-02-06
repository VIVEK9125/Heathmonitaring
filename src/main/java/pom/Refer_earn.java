package pom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

public class Refer_earn 
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
    
    
    public Refer_earn(WebDriver driver) {
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
    public void clkcontineus() throws InterruptedException {
    	Thread.sleep(2000);
    	continuebtn.click();
    }
    public void clkhamburger() throws InterruptedException {
    	Thread.sleep(2000);
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
    @FindBy(xpath = "(//*[text()=' Email report'])[2]")
    private WebElement clkEmailRep;
    @FindBy(xpath = "//p[@id='SendEmail']")
    private WebElement verfymsg;
    
    @FindBy(xpath = "//img[@src='/Content/images/copy-icon.png']")
    private WebElement clickcopyicon;
    long startTime;
    long endTime;
//    @FindBy(xpath = "//input[@id='submitbtn']") 
//    private WebElement Submit;
//    @FindBy(xpath = "//input[@id='submitbtn']") 
//    private WebElement Submit;
//    
    
    public void referralno() {
        String randomIndianPhoneNumber = referralno1();
       // WebElement phoneNumberField = driver.findElement(By.id("phoneNumber"));
        entrnumbr.sendKeys(randomIndianPhoneNumber);
    }

    private String referralno1() {
        // Indian phone numbers start with 7, 8, or 9 and are 10 digits long
        String[] prefixes = {"7", "8", "9"};
        String prefix = prefixes[faker.random().nextInt(prefixes.length)];
        StringBuilder phoneNumber = new StringBuilder(prefix);
        for (int i = 0; i < 9; i++) {
            phoneNumber.append(faker.number().digit());
        }
        return phoneNumber.toString();
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
    	
//    	Response response = RestAssured.get(referurl);
//    	livedata.sendKeys(response.getBody().asString());
      System.out.println("Data displayed on front end: " + livedata.getText());
   
    }
    public void leaderboard() {
    	System.out.println("Displayed leaderboard data:"+ leaderboard.getText() );
    }
    public void clkEmailRep() throws InterruptedException {
    	Thread.sleep(2000);
    	clkEmailRep.click();
    }
    public void verifysuccessfullmsg() {
    	String Expected="Your referral status report has been emailed on your registered email id!";
    	String Actual= verfymsg.getText();
    	if(Actual.equals(Expected)) {
    		System.out.println("message is verified:"+Actual);
    	}
    	else {
    		System.out.println("message is not verified:"+ Expected+ " but found: " + Actual);
    	}
    }
    public void ScrollingUp() {
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
    	 Jv.executeScript("window.scrollBy(0,0)");
    }
    public void clkcopyicon() {
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
    	clickcopyicon.click();
    }
    public void verifycopytext() {
    	String verifytitl = verifycopytext.getText();
  	System.out.println("Verify the OTP page Title:"+verifytitl);
    }
  //***************************************************** Share-link************************************
    @FindBy(xpath = "//input[@id='MainContent_MobileNumber']")
    private WebElement Number;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement Submitb;
    @FindBy(xpath = "//*[text()='Enter mobile number']")
    private WebElement verifytext;
    @FindBy(xpath = "//p[text()='Referral link copied to clipboard']")
    private WebElement verifycopytext;
    Faker faker = new Faker();
    public void openreferrallink() {
    	try {
            // URL to test
            String ReferralURL = "https://ekyc.miraeassetcm.com/Register-with-us?ref=REF1707585%26refsrc=2";

            // Start measuring time
            long startTime = System.currentTimeMillis();

            // Navigate to the page
            driver.get(ReferralURL);
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
    public void enterPhoneNumber() {
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
         String randomIndianPhoneNumber = generatePhoneNumber();
       // WebElement phoneNumberField = driver.findElement(By.id("phoneNumber"));
        Number.sendKeys(randomIndianPhoneNumber);
    }

    private String generatePhoneNumber() {
        // Indian phone numbers start with 7, 8, or 9 and are 10 digits long
        String[] prefixes = {"6","7", "8", "9"};
        String prefix = prefixes[faker.random().nextInt(prefixes.length)];
        StringBuilder phoneNumber = new StringBuilder(prefix);
        for (int i = 0; i < 9; i++) {
            phoneNumber.append(faker.number().digit());
        }
        return phoneNumber.toString();
    }
    public void clicksubmit() {
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Submitb.click();
    }
    public void verifyotppage() {
    	
    	String expect="Enter mobile number";
    	String Actualt= verifytext.getText();
    	if(Actualt.equals(expect)) {
    		System.out.println("message is verified:"+Actualt);
    	}
    	else {
    		System.out.println("message is not verified:"+ expect+ " but found: " + Actualt);
    	}
//    	 String verifytitle = verifytext.getText();
//      	System.out.println("Verify the OTP page Title:"+verifytitle);
    }
    
  //***************************************************** Share-link************************************
    
    
    @FindBy(xpath = "//input[@id='txtMobileNo']") private WebElement eNumber;
    @FindBy(xpath = "//input[@id='GetStarted']") private WebElement startreferral;
    
    public void openlink() {
    	try {
            // URL to test
            String OpenlURL = "https://referralapi.mstock.com/Miraereferral/Index/";

            // Start measuring time
            long startTime = System.currentTimeMillis();

            // Navigate to the page
            driver.get(OpenlURL);
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
    public void enternumber() throws InterruptedException {
    	eNumber.sendKeys("7972160522");
    	Thread.sleep(2000);
    }
    public void clickstartreferral() {
    	startTime = System.currentTimeMillis();
    	startreferral.click();
        // Wait for the page to load or some element to be visible
       // WebDriverWait wait = new WebDriverWait(driver, 10);
              //  .until(ExpectedConditions.visibilityOfElementLocated(By.id("result-element")));
        endTime = System.currentTimeMillis();
        long loadTime = endTime - startTime;
        System.out.println("Load time: " + loadTime + " milliseconds");
    }
    
    public void getcurrenturl() {
    	String verifyurl =driver.getCurrentUrl();
    	System.out.println("The Current Url Is:"+verifyurl);
    }
    
    
}
