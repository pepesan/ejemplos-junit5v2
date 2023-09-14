package ejercicios.selenium;// Generated by Selenium IDE

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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
import org.w3c.dom.html.HTMLButtonElement;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OcultaTest {
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
  public void oculta() {
    // Test name: oculta
    // Step # | name | target | value
    // 1 | open | https://cursosdedesarrollo.com/pactometro/ | 
    driver.get("https://cursosdedesarrollo.com/pactometro/");
    // 2 | click | id=part-PP |
    WebElement botonPP = driver.findElement(By.id("part-PP"));
    botonPP.click();
    // 3 | click | id=num-sies | 
    driver.findElement(By.id("num-sies")).click();
    // 4 | assertText | id=num-sies | 137
    assertEquals(
            driver.findElement(By.id("num-sies")).getText(),
            "137");
    // 5 | assertElementPresent | css=#sies img | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#sies img"));
      assert(elements.size() > 0);
      String disabledValue = botonPP.getAttribute("disabled");
      System.out.println("Disabled: "+ disabledValue);
      assertEquals(disabledValue, "true");
    }
  }
}
