package Lumen_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)			
@CucumberOptions(
		         features="FeatureFile",
                 glue={"stepDef"},
                 plugin = { "pretty","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
                		 "html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}
		        )
public class RunnerFile {

}
