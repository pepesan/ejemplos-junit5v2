package example.selenium;// Generated by Selenium IDE

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NavegacionCursosTest {
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
  public void navegacioncursos() {
    // Test name: navegacion-cursos
    // Step # | name | target | value
    // 1 | open | / |
    // GIVEN
    driver.get("https://cursosdedesarrollo.com/");
    // WHEN
    // 2 | click | linkText=Cursos Gratuitos | 
    driver.findElement(By.linkText("Cursos Gratuitos")).click();
    // 3 | verifyText | css=.entry-title | Cursos Gratuitos
    // THEN
    assertEquals(
            driver.findElement(By.cssSelector(".entry-title")).getText(),
            "Cursos Gratuitos");
  }
}
