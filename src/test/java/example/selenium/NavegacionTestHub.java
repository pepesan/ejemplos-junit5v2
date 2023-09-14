package example.selenium;// Generated by Selenium IDE
import org.junit.jupiter.api.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;


public class NavegacionTestHub {
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
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }
  @Test
  @Tag("aceptacion")
  @Disabled
  public void navegacionTest() {
    driver.get("https://decide.madrid.es/presupuestos");
    driver.findElement(By.cssSelector(".shadow_squared:nth-child(19) a")).click();
    driver.findElement(By.linkText("Paso peatonal a la entrada trasera del colegio Edith Stein")).click();
    driver.findElement(By.cssSelector("h1:nth-child(1)")).click();
    assertThat(driver.getTitle(), is("Paso peatonal a la entrada trasera del colegio Edith Stein"));
    assertThat(driver.findElement(By.cssSelector("#investment_code > strong")).getText(), is("17045"));
  }
}
