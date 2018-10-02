package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DonationPage extends CommonAPI {

    //locators
    @FindBy(xpath = "//*[@id=\"logged-out-homepage-root\"]/div/div[1]/nav/div/div[3]/a[1]")
    public static WebElement donate;
    @FindBy(css = "#donate-react-root > div > div:nth-child(1) > div > div > form > div:nth-child(3) > label > div > input")
    public static WebElement userName;















    //methods
    public void donatetendollers(){donate.click();}
    public void typeUseName () {userName.click();}

}
