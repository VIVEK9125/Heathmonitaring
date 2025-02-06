package pom;

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

public class login_Fail_pom
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
    @FindBy(xpath = "(//div[@class='wzrk-alert wiz-show-animate']//button)[1]") 
    private WebElement handlepopup;
    
    public login_Fail_pom(WebDriver driver) {
    	this.driver=driver;
		PageFactory.initElements(driver, this);
		
    	
    }
    
    public void cugurL() {
    	 try {
    	
             // URL to test
             String cugUrl = "https://trade.mirae-asset.co.in/#/login";

             // Start measuring time
             long startTime = System.currentTimeMillis();

             // Navigate to the page
             driver.get(cugUrl);
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
    public void enteruser() throws InterruptedException {
    	Thread.sleep(2000);
    	 Username.sendKeys("9075794960");
    }
    public void enterpassword() throws InterruptedException {
    	Thread.sleep(2000);
    	Password.sendKeys("Vivek@9125",Keys.ENTER);
    	//Password.sendKeys("Vivek@9125",Keys.ENTER);
    }
    public void login_button() {
    	loginbtn.click();
    }
    public void VerifyTextonnextpage() throws InterruptedException {
    	Thread.sleep(1000);
    	continuebtn.click();
    	
    }
    

}
