package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"C:\\Users\\vivek.nityo\\Downloads\\HealthMonitoring\\HealthMonitoring\\src\\main\\resources\\feature\\pledage_mstock.feature"},
		glue= {"steps"},
		plugin= {"pretty", "html:target/amazon/report.html","rerun:target/failedrun.txt"}
		//tags="@sanity"
		//dryRun=true
	//	publish=true
	
		
		
		)

public class runner_zero extends AbstractTestNGCucumberTests{

	
	
}
