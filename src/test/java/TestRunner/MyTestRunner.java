package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features"},
		monochrome=true,
	    dryRun=false,		
	    glue = {"stepdefinitions","Hooks"},

		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
				
		
		
		
		
		
		)
public class MyTestRunner {

}
