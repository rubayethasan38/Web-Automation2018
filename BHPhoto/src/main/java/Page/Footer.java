package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
public class Footer extends CommonAPI {
    public void clickOnCss(String locator){
        webDriver.findElement(By.cssSelector(locator)).click();
    }
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[4]/footer[1]/div[3]/div[1]/div[1]/div[1]/a[1]/span[1]")
    public static WebElement Shipping;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[4]/footer[1]/div[3]/div[1]/div[1]/div[2]/a[1]/span[1]")
    public static WebElement Returns;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[4]/footer[1]/div[3]/div[1]/div[1]/div[3]/a[1]/span[1]")
    public static WebElement GiftCards;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[4]/footer[1]/div[3]/div[1]/div[1]/div[4]/a[1]/span[1]")
    public static WebElement EventSpace;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[4]/footer[1]/div[2]/div[2]/div[1]/a[1]/span[1]")
    public static WebElement ContactUs;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[4]/footer[1]/div[2]/div[3]/div[1]/a[1]/span[1]")
    public static WebElement LiveChat;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/footer[1]/div[1]/a[1]")
    public static WebElement HoursOfService;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[4]/footer[1]/div[1]/a[3]")
    public static WebElement AddressDirections;
    //methods
    public void clickShipping() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    Shipping.click();
    }
    public void clickReturns() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    Returns.click();
    }
    public void clickGiftCards() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    GiftCards.click();
    }
    public void clickEventSpace() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    EventSpace.click();
    }
    public void clickContactUs() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    ContactUs.click();
    }
    public void clickLiveChat() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    LiveChat.click();
    }
    public void clickHoursOfService() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    HoursOfService.click();
    }
    public void clickAddressDirections() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    AddressDirections.click();
    }
}
