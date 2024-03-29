package example.selenium;// Generated by Selenium IDE


import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public class LoginfallidoGridTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeEach
  public void setUp() throws MalformedURLException {
    FirefoxOptions firefoxOptions = new FirefoxOptions();
    driver = new RemoteWebDriver(
            new URL("http://localhost:4444/wd/hub"),
            firefoxOptions);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }
  @Test
  @Disabled
  @Tag("aceptacion")
  public void loginfalido() throws InterruptedException {
    Thread.sleep(5000);
    // Test name: Login falido
    // Step # | name | target | value
    // 1 | open | /wp-admin/ | 
    driver.get("https://cursosdedesarrollo.com/wp-admin/");
    // 2 | type | id=user_login | admin
    driver.findElement(By.id("user_login")).sendKeys("admin");
    // 3 | type | id=user_pass | asddads
    driver.findElement(By.id("user_pass")).sendKeys("asddads");
    // 4 | click | id=wp-submit | 
    driver.findElement(By.id("wp-submit")).click();
    // 5 | assertText | id=login_error | ERROR: The username or password you entered is incorrect. Lost your password?
    assertThat(driver.findElement(By.id("login_error")).getText(), containsString("ERROR:"));
  }
}
