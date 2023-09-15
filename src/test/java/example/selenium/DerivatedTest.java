package example.selenium;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;

public class DerivatedTest extends BaseTest{

    @Test
    @Tag("aceptacion")
    public void test() {
        // Your test code here. For example:
        driver.get(url);
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
