package Home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BottomMenuHelper extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[1]/section[5]/div/div[1]/ul/li[1]/a") public static WebElement Checking;
    @FindBy(xpath = "//*[@id=\"main-content\"]/div[1]/section[5]/div/div[1]/ul/li[2]/a") public static WebElement DebitAndPrepaidCards;

    public void checkingOption(){
        Checking.click();
    }
}
