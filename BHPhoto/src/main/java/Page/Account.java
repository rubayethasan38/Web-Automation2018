package Page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"account-cart\"]/div[1]/a")
    public static WebElement logIn;
    @FindBy(xpath = "//*[@id=\"user-input\"]")
    public static WebElement enteremail;
    @FindBy(xpath = "//*[@id=\"password-input\"]")
    public static WebElement enterpassword;
    @FindBy(xpath = "//*[@id=\"onePopupLayer\"]/div[2]/div/div/div/div[1]/form/input[1]")
    public static WebElement submitlogin;

    public void login1(){
        logIn.click();
    }
}

