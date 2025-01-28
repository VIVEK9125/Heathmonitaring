package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"C:\\Users\\vivek.nityo\\git\\New folder\\Heathmonitaring\\src\\main\\resources\\feature"},
		glue= {"steps"},
		plugin= {"pretty", "html:target/amazon/report.html","rerun:target/failedrun.txt"}
		//tags="@priority3"
		//monochrome = true,
		//publish=true
		//tags= "@Mstcokmodule"
		
		
	
		
		
		)

public class runner_zero extends AbstractTestNGCucumberTests{

	
	
}
