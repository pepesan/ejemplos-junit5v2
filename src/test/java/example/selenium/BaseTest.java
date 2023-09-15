package example.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    public WebDriver driver;

    public WebDriverWait wait;
    public Map<String, Object> vars;
    JavascriptExecutor js;
    
    public String url = "https://en.wikipedia.org/wiki/Main_Page";

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
