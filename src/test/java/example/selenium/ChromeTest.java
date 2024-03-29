package example.selenium;

//import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class ChromeTest {

    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        // WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }


    @Test
    public void test() {
        // Your test code here. For example:
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        By searchInput = By.cssSelector("input.cdx-text-input__input");
        // wait.until(presenceOfElementLocated(searchInput));
        driver.findElement(searchInput).sendKeys("Software");
        By searchButton = By.cssSelector("button.cdx-search-input__end-button");
        wait.until(elementToBeClickable(searchButton));
        driver.findElement(searchButton).click();

        wait.until(textToBePresentInElementLocated(By.tagName("body"),
                "Computer software"));
    }

}