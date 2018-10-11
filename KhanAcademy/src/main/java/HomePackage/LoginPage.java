package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    //valid credentials
    @FindBy(xpath = "//*[@id=\"login-or-signup\"]")
    public static WebElement validlogin;
    @FindBy(xpath = "//*[@id=\"uid-dialog-0-children\"]/div/section[2]/div/div/div[2]/div[1]/label/form/input")
    public  static WebElement validUserNameInput;
    @FindBy(xpath = "//*[@id=\"uid-dialog-0-children\"]/div/section[2]/div/div/div[2]/div[2]/label/form/input")
    public  static WebElement validPasswordInput;

    //methods
    //invalid credentials
    public void loginpage(){login.click();}
    public void setLogin() {
        login.click();
        userNameInput.sendKeys("saleem689");
        passwordInput.sendKeys("saif", Keys.ENTER);
    }
    //valid credential
    public void validLoginpage(){login.click();}
    public void validSetLogin() {
        login.click();
        validUserNameInput.sendKeys("saleem689yahoo.com");
        validPasswordInput.sendKeys("123.selenium", Keys.ENTER);
    }
}
