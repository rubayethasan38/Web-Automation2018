package HomePageObjects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageHelper extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"signin-button\"]")
    public static WebElement signinButton;
    @FindBy(xpath = "/html/body/div/div[5]/header/div[4]/div[3]/a")
    public static WebElement searchButton;



}



