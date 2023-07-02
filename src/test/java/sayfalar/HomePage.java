package sayfalar;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
    public final String myAccount = ".nav-line-1-container";
    //css
    public final String login = "//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner']";
    //xpath
    public final String productSearch = "//input[@id='twotabsearchtextbox']";
    //xpathh

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
