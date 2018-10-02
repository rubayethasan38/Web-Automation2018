package Page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"account-menu-app\"]/div/div[2]/div/div/a")
    public static WebElement logIn;
    @FindBy(xpath = "//*[@id=\"fld-e\"]")
    public static WebElement enteremail;
    @FindBy(xpath = "//*[@id=\"fld-p1\"]")
    public static WebElement enterpassword;

    public void login1(){
        logIn.click();
    }
}


