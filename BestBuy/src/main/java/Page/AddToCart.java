package Page;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends CommonAPI {
    @FindBy(xpath="//*[@id=\"header\"]/div[1]/div[2]/ul/li[2]/a")
    public static WebElement checkoutButton;

    public static String clickCheckOutButton(){
        for (String handle : WebDriver.getWindowHandles()) {
            WebDriver.switchTo().window(handle);
        }
        //checkoutButton.click();
        String str = WebDriver.getCurrentUrl();
        return str;
    }
}

