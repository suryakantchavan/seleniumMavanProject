package runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	    format={"pretty"},
	    features= "/Users/suryakant/eclipse-workspace/Selenium-Cucmber/features",
	    glue = "stepDefinations")

public class TestRunner {
	
	
}
