package sayfalar;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class Page {
    WebDriver driver;
    public Page(WebDriver driver) { this.driver=driver;}

    public void waitUntilElementShowCss (String elementId) {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementId)));
    }
    public void waitUntilElementShowXpath(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementId)));
    }
    public void waitUntilTheElementCanBeClickableCss(String elementId){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(elementId)));
    }
    public void waitUntilTheElementCanBeClickableXpath(String elementId){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementId)));
    }
    public void clickButtonCss(String tusId){
        driver.findElement(By.cssSelector(tusId)).click();
    }
    public void clickButtonXpath(String tusId){
        driver.findElement(By.xpath(tusId)).click();
    }

    public void typeInBlankCss(String elementId, String words) {
        driver.findElement(By.cssSelector(elementId)).sendKeys(words);
    }
    public void typeInBlankXpath(String elementId, String words) {
        driver.findElement(By.xpath(elementId)).sendKeys(words);
    }
    public void hitKeyboardButtonXpath (String elementId, Keys keyboardButton){
        driver.findElement(By.xpath(elementId)).sendKeys(keyboardButton);
    }
}
