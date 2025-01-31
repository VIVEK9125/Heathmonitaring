package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src\\main\\resources\\feature\\Pledage_mstock.feature"},
		glue= {"steps"},
		plugin= {"pretty","html:tatrget/cucumber-html-report.html"},
		publish=true
		//tags=" @Mstcokmodule"
		//monochrome = true,
		
		//tags= "@Mstcokmodule"
		
		
	
		
		
		)

public class runner_zero extends AbstractTestNGCucumberTests
{
}
