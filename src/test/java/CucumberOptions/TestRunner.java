package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/login1.feature",
		glue="StepDefinitions",
		stepNotifications=true,
		tags="@RegTest or  @SmokeTest",
		
		//monochrome=true,
			    plugin= {"pretty","html:target/cucumber.html"
			    		//,"json:target/cucumber.json","junit:target/cukes.xml"
			    		}
		)
public class TestRunner {
	
 
}
 