package pages;

import driverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public BasePage() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Métodos
    public void navigateTo(String url) {
        driver.get(url);
    }

    //Se espera que esté presente en el DOM - 1 elemento
    private WebElement getWebElement(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public String getTextWebElement(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))).getText();
    }

    public void writeText(String locator, String text) {
        getWebElement(locator).clear();
        getWebElement(locator).sendKeys(text);
    }

    public void clickButton(String locator) {
        getWebElement(locator).click();
    }





}