package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features={"src\\main\\resources\\Refer and Earn"},
		glue= {"steps"},
		plugin= {"pretty","html:tatrget/cucumber-html-report.html"},
		publish=true
		,tags="@sharelink"
	
		)

public class RunnerRefer_And_Earn extends AbstractTestNGCucumberTests{

}
