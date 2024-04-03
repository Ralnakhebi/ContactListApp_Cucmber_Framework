package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepdefinitions",
        features = "src/test/resources/features",
        plugin = {
                "html:target/html-report/report.html",
                "json:target/report.json",
                "junit:target/xml-report/report.xml",
                "pretty",
        },
        monochrome = false,
        dryRun = false
)
public class TestRunnerParallel {
}
