package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
       typeLogin.sendKeys("asdasd");
        }

    }

