package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sayfalar.HomePage;
import sayfalar.LoginPage;

import java.time.Duration;
import java.util.List;

public class LoginTests {
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;

    @BeforeEach
    void setup() {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        homePage= new HomePage(driver);
        loginPage= new LoginPage(driver);
        driver.get("https://www.amazon.com/");
    }

    @Test
    void amazonLoginTests(){
        homePage.waitUntilElementShowCss(homePage.myAccount);
        homePage.clickButtonCss(homePage.myAccount);

        loginPage.waitUntilElementShowXpath(loginPage.email);
        loginPage.typeInBlankXpath(loginPage.email, "can.coban07@gmail.com");
        loginPage.waitUntilElementShowXpath(loginPage.continuee);
        loginPage.clickButtonXpath(loginPage.continuee);
        loginPage.waitUntilElementShowXpath(loginPage.password);
        loginPage.typeInBlankXpath(loginPage.password, "Apocan07");
        loginPage.clickButtonXpath(loginPage.loginButton);

    }

    @Test
    void amazonProductSearchTest() {
        homePage.waitUntilElementShowXpath(homePage.productSearch);
        homePage.typeInBlankXpath(homePage.productSearch, "blanket");
        homePage.hitKeyboardButtonXpath(homePage.productSearch, Keys.ENTER);
        List<WebElement> productList = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']//h2/a"));
        productList.get(0).click();
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();
        System.out.println("Product added to cart successfully!");

    }


        @AfterEach
    void teardown(){
        driver.close();
    }
}
