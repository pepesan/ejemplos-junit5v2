package example.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
// Generated by Selenium IDE
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;

public class StepNavegacion {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Given("Abro el navegador en la pagina web principal")
    public void abroElNavegadorEnLaPaginaWebPrincipal() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pepesan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        // Test name: Cursos
        // Step # | name | target | value
        // 1 | open | / |
        driver.get("https://cursosdedesarrollo.com/");
    }

    @When("Voy a la pagina de profesores mediante el menu")
    public void voyALaPaginaDeProfesoresMedianteElMenu() {
        // 2 | click | css=.g-menu-item-2313 .g-menu-item-title |
        driver.findElement(By.cssSelector(".g-menu-item-2313 .g-menu-item-title")).click();
    }

    @Then("Deberia aparecer el con el titulo magento")
    public void deberiaAparecerElConElTituloMagento() {
        // 3 | assertElementPresent | linkText=Magento |
        {
            List<WebElement> elements = driver.findElements(By.linkText("Magento"));
            assert(elements.size() > 0);
        }
    }
}