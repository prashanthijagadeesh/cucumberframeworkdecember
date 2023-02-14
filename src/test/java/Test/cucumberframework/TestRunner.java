package Test.cucumberframework;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"Features1"},
                 glue = {"Test.stepdefnition"},
                plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                tags = "@loginwithinvaliddata",
                 
		        monochrome = true
		
			)
public class TestRunner extends AbstractTestNGCucumberTests{

}
