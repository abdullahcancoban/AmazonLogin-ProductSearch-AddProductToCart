package sayfalar;

import org.openqa.selenium.WebDriver;

public class ProductPage extends Page{
    public final String addToCart= "//input[@id='add-to-cart-button']";
    public ProductPage(WebDriver driver) {
        super(driver);
    }
}
