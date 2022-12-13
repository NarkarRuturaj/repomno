package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/features",
		glue="Stepdefinition"
		)
public class Runner extends AbstractTestNGCucumberTests{
	

}
