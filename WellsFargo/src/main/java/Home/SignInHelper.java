package Home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SignInHelper extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"userid\"]") public static WebElement UserInputField;
    @FindBy(xpath = "//*[@id=\"password\"]") public static WebElement PasswordInputField;
    @FindBy(xpath = "//*[@id=\"btnSignon\"]") public static WebElement SignInButton;
    @FindBy(xpath = "//*[@id=\"frmSignon\"]/div[6]/a") public static WebElement ForgotPassword;
    @FindBy(xpath = "//*[@id=\"saveuid\"]/label") public static WebElement SaveUsernameBox;
    @FindBy(css = "#pageerrors > div > strong > strong") public static WebElement signInErrorMessage;
    @FindBy(xpath = "//*[@id=\"signOnHeader\"]") public static WebElement Account;
    @FindBy(xpath = "//*[@id=\"j_username\"]") public static WebElement AccountUserInput;
    @FindBy(xpath = "//*[@id=\"j_password\"]") public static WebElement AccountPasswordInput;
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
    public void saveUserName(){
        SaveUsernameBox.click();
    }
    public void signInUsingDataProvider(String email, String passCode, String message) throws InterruptedException {
        SendKeys(AccountUserInput, email, "account");
        AccountPasswordInput.sendKeys(passCode);
        Thread.sleep(3000);
        SignInButton.click();
        String errorMessage = signInErrorMessage.getText();
        TestLogger.log("Error Message: "+errorMessage);
    }
}
