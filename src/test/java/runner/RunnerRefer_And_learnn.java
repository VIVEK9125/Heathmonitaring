package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features={"C:\\Users\\vivek.nityo\\git\\New folder\\Heathmonitaring\\src\\main\\resources\\Refer and learn"},
		glue= {"steps"},
		plugin= {"pretty"},
		publish=true
		
		
		
		
		
		)

public class RunnerRefer_And_learnn extends AbstractTestNGCucumberTests{

}
