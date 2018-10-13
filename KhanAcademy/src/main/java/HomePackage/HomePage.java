package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    HomePage homePage;

    @FindBy(xpath = "//*[@id=\"login-or-signup\"]")
    public static WebElement login;

    public void goToLoginpage(){login.click();}
}
