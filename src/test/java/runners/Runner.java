package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepdefinitions",
        features = "src/test/resources/features",
        //tags = " @Click_Buttons ",
        plugin = {
                "html:target/html-report/report.html",
                "json:target/json-report/report.json",
                "junit:target/xml-report/report.xml",
                "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = false,
        dryRun = false
)
public class Runner {

}
