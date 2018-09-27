package Page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"account-cart\"]/div[1]/a")
    public static WebElement logIn;
    @FindBy(xpath = "//*[@id=\"user-input\"]")
    public static WebElement enteremail;
    @FindBy(xpath = "//*[@id=\"password-input\"]")
    public static WebElement enterpassword;

    public void login1(){
        logIn.click();
    }
}

