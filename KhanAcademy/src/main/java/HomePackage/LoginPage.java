package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class LoginPage extends CommonAPI {

    //Invalid credentials
    @FindBy(xpath = "//*[@id=\"login-or-signup\"]")
    public static WebElement login;
    @FindBy(xpath = "//*[@id=\"uid-dialog-0-children\"]/div/section[2]/div/div/div[2]/div[1]/label/form/input")
    public  static WebElement userNameInput;
    @FindBy(xpath = "//*[@id=\"uid-dialog-0-children\"]/div/section[2]/div/div/div[2]/div[2]/label/form/input")
    public  static WebElement passwordInput;
    @FindBy(xpath = "//*[@id=\"uid-dialog-2-children\"]/div/section[2]/div/div/div[2]/button/div")
    public static WebElement loginAccount;
    @FindBy(xpath = "//*[@id=\"uid-dialog-0-children\"]/div/section[2]/div/div/div[2]/div[3]")
    public static WebElement errorMessage;
    //*[@id="uid-dialog-0-children"]/div/section[2]/div/div/div[2]/div[3]
    //valid credentials
    @FindBy(xpath = "//*[@id=\"login-or-signup\"]")
    public static WebElement validlogin;
    @FindBy(xpath = "//*[@id=\"uid-dialog-0-children\"]/div/section[2]/div/div/div[2]/div[1]/label/form/input")
    public  static WebElement validUserNameInput;
    @FindBy(xpath = "//*[@id=\"uid-dialog-0-children\"]/div/section[2]/div/div/div[2]/div[2]/label/form/input")
    public  static WebElement validPasswordInput;
    @FindBy(xpath = "//*[@id=\"uid-dialog-3-children\"]/div/section[2]/div/div/div[2]/button")
    public static WebElement loginButton;
    //methods
    //invalid credentials
    public void loginpage(){login.click();}
    public void setLogin() throws InterruptedException {
        login.click();
        sleepFor(3);
        userNameInput.sendKeys("saleem689");
        sleepFor(2);
        passwordInput.sendKeys("saif", Keys.ENTER);
    }
//    public void error() {errorMessage};
    //valid credential
    public void validLoginpage(){login.click();}
    public void validSetLogin() throws InterruptedException {
        sleepFor(3);
        login.click();
        validUserNameInput.sendKeys("saleem689yahoo.com");
        sleepFor(2);
        validPasswordInput.sendKeys("123.selenium", Keys.ENTER);
        sleepFor(5);
    }
    //XlsReader method

    public void signInUsingDataProvider(String email, String passCode, String message) throws InterruptedException {
        SendKeys(validUserNameInput,email, "account");
        validPasswordInput.sendKeys(passCode,Keys.ENTER);
        Thread.sleep(3000);
        String ErrorMessage = errorMessage.getText();
        TestLogger.log("Error Message: "+errorMessage);

    }
}
