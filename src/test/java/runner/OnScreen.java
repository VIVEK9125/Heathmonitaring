package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features={"src\\main\\resources\\feature\\Login_Fail.feature","src\\main\\resources\\Refer and Earn\\OnScreenScenario.feature"},
		glue= {"steps"},
		plugin= {"pretty","html:tatrget/cucumber-html-report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		//publish=true
		//,tags="@sharelink"
	
		)



public class OnScreen extends AbstractTestNGCucumberTests{

}
