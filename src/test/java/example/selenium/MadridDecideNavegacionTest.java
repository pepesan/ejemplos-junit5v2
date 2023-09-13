package example.selenium;// Generated by Selenium IDE

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
public class MadridDecideNavegacionTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeEach
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }
  @Test
  @Tag("aceptacion")
  public void navegacion() {
    driver.get("https://decide.madrid.es/presupuestos");
    // driver.findElement(By.id("iam-cookie-control-modal-action-primary")).click();
    // driver.findElement(By.cssSelector("a[href='/budgets/presupuestos-participativos-2021/investments/18956']")).click();
    // driver.findElement(By.cssSelector("h1:nth-child(1)")).click();
    // assertThat(driver.getTitle(), is("Paso peatonal a la entrada trasera del colegio Edith Stein"));
    // assertThat(driver.findElement(By.cssSelector("#investment_code > strong")).getText(), is("17045"));
  }
}
