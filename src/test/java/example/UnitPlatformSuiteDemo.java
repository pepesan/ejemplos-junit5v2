package example;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;
@RunWith(JUnitPlatform.class)
@SuiteDisplayName("JUnit Platform Suite Demo")
@SelectPackages("example.asserts")
class JUnitPlatformSuiteDemo {
}
