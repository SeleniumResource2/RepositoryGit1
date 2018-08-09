package StepDefenition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/Test1.Feature", 
					glue = {"StepDefenition"}, 
					tags = {"@End2End"}, 
					plugin={"html:target"}, 
					monochrome = true)
public class TestRunner {

}
