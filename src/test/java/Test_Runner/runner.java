package Test_Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { ".//Features/" }, 
				 glue = "stepDefinition", 
				 dryRun = false,
				 monochrome=false,
				 plugin = {"pretty", 
						   "html:test-output",
						   "json:target/cucumber.json",
		  				   "junit:junit_xml/cucumber.xml" }
           
                 )
public class runner {

}
