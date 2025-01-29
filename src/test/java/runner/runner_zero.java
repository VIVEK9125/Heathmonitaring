package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"C:\\Users\\vivek.nityo\\git\\New folder\\Heathmonitaring\\src\\main\\resources\\feature"},
		glue= {"steps"},
		plugin= {"pretty"},
		publish=true
		//tags="@Brokage_saving"
		//monochrome = true,
		
		//tags= "@Mstcokmodule"
		
		
	
		
		
		)

public class runner_zero extends AbstractTestNGCucumberTests
{
}
