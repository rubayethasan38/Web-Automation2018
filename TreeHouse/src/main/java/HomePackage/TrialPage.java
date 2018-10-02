package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrialPage extends CommonAPI {
    @FindBy ( xpath = "//*[@id=\"shareasale\"]/section/div[2]/section[3]/div/div/div/div[2]/a")
    public static WebElement trial;

















    //methods
    public void clickTrial () { trial.click();}
}
