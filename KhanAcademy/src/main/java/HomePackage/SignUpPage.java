package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends CommonAPI {
//    @FindBy(className = "pad_hvrboe-o_O-navItem_9vq2q-o_O-wonderBlocksNavItem_eijtp7-o_O-hideWhenSmall_1uwvskc-o_O-withLeftMargin_61ie8v")
//    public static WebElement signUp;
    @FindBy(xpath = "//*[@id=\"login_signup-widget-root\"]/div/div[3]/section[2]/div/div/div[1]/div[2]/button[2]")
    public static WebElement teacher;
    @FindBy(xpath = "//*[@id=\"logged-out-homepage-root\"]/div/div[1]/nav/div/div[3]/a[3]")
    public static WebElement signOn;

        //methods
    public void clickTeacher(){
        signOn.click();
        teacher.click();
    }
}
