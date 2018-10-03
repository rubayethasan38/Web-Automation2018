package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DonationPage extends CommonAPI {

    //locators
    @FindBy(xpath = "//*[@id=\"logged-out-homepage-root\"]/div/div[1]/nav/div/div[3]/a[1]")
    public static WebElement donate;
    @FindBy(className = "textField_5atvp5")
    public static WebElement yourName;

    //methods
    public void donatetendollers (){donate.click();}
    public void typeInName () {
        donate.click();
        yourName.sendKeys("Saleem");
    }
}
