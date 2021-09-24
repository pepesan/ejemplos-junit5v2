package example.cucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
@CucumberOptions(
        plugin = {
        "pretty", "html:target/cucumber", "json:target/Cucumber.json",
        "junit:target/Cucumber.xml" })
public class RunCucumberCalculadoraTest {
}
