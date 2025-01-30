package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"C:\\Users\\vivek.nityo\\git\\New folder\\Heathmonitaring\\src\\main\\resources\\feature\\4_Organic_sem_page_link.feature"},
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
