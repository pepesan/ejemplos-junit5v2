package example.cucumber;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.runner.RunWith;

@Cucumber
@CucumberOptions(plugin = {
        "pretty",
        "html:target/informes-html",
        "json:target/informes/cucumber.json",
        "junit:target/Cucumber.xml"
})
public class RunCucumberTest{
}