package sayfalar;

import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {

    public final String email = "//input[@id='ap_email']";
    //xpath
    public final String continuee = "//input[@id='continue']";
    public final String password= "//input[@id='ap_password']";
    //xpath
    public final String loginButton = "//input[@id='signInSubmit']";
    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
