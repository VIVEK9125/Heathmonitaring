package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features={"src\\main\\resources\\Refer and Earn\\Login_Fail.feature"},
		glue= {"steps"},
		plugin= {"pretty","html:tatrget/cucumber-html-report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		//publish=true
		//,tags="@IPO_Page"
	
		)



public class OnScreen extends AbstractTestNGCucumberTests{

}
