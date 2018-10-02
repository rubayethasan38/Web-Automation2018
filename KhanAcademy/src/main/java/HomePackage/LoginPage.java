package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"login-or-signup\"]")
    public static WebElement login;









    //methods
    public void loginpage(){login.click();}

}
