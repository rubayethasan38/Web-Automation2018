package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonAPI {

    @FindBy(css = "#featurette-5")
    public static WebElement login;
    @FindBy(css = "#new_user_session > div:nth-child(4) > label")
    public static WebElement typeLogin;
    @FindBy(xpath = "//*[@id=\"new_user_session\"]/div[2]/label")
    public static WebElement typePassword;

    // methods
    public void clickLogin() {
        login.click();
    }
    public void usernameInput() {
      login.click();
       typeLogin.sendKeys("saleem689@yahoo.com");
       typePassword.sendKeys("saleem");
        }

    }
