package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features={"src\\main\\resources"},
		glue= {"steps"},
		plugin= {"pretty","html:tatrget/cucumber-html-report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		//publish=true
		//,tags="@OpenLink"
	
		)



public class OnScreen extends AbstractTestNGCucumberTests{

}
