package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"login-or-signup\"]")
    public static WebElement login;
    @FindBy(xpath = "//*[@id=\"uid-dialog-0-children\"]/div/section[2]/div/div/div[2]/div[1]/label/form/input")
    public  static WebElement userNameInput;
    @FindBy(xpath = "//*[@id=\"uid-dialog-0-children\"]/div/section[2]/div/div/div[2]/div[2]/label/form/input")
    public  static WebElement passwordInput;

    //methods
    public void loginpage(){login.click();}
    public void setLogin() {
        login.click();
        userNameInput.sendKeys("saleem689");
        passwordInput.sendKeys("saif");
    }
}
