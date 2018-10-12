package Page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn extends CommonAPI {
    @FindBy(name = "SearchText")
    public static WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/nav[2]/ul/li[1]")
    public static WebElement Account;
    @FindBy(xpath = "//*[@id=\"account-menu-app\"]/div/div[2]/div/div/a")
    public static WebElement SignIn;
    @FindBy(xpath = "//*[@id=\"fld-e\"]")
    public static WebElement EmailAddress;
    @FindBy(xpath = "//*[@id=\"fld-p1\"]")
    public static WebElement Password;
    //methods
    public void setAccount() {
        Account.click();
    }
    public void setSignIn() {
        SignIn.click();
    }
    public void enterUserName(){
        EmailAddress.sendKeys("sameer1187@gmail.com");
    }
    public void enterPassword(){
        Password.sendKeys("RmhssdakH21187$");
    }
}
