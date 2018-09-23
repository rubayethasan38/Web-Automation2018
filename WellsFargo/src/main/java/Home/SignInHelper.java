package Home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class SignInHelper extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"userid\"]") public static WebElement UserInputField;
    @FindBy(xpath = "//*[@id=\"password\"]") public static WebElement PasswordInputField;
    @FindBy(xpath = "//*[@id=\"btnSignon\"]") public static WebElement SignInButton;
    @FindBy(xpath = "//*[@id=\"frmSignon\"]/div[6]/a") public static WebElement ForgotPassword;

    public void signIn(){
        UserInputField.sendKeys("luillo123");
        PasswordInputField.sendKeys("luilloluilllo");
        SignInButton.click();
    }
    public void signInButton(){
        SignInButton.click();
    }
    public void forgotPasswordButton(){
        ForgotPassword.click();
    }
}
