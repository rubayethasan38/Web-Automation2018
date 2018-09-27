package Page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends CommonAPI {
    @FindBy(xpath="//*[text()='Checkout Now']")
    public static WebElement checkoutButton;

    //T3HOM_AP_TC01 verify CheckOut Now
    public static String clickCheckOutButton(){
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        //checkoutButton.click();
        String str = driver.getCurrentUrl();
        return str;
    }
}

