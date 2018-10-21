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
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[1]/div[1]/a/span[1]")
    public static WebElement Shipping;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[1]/div[2]/a/span[1]")
    public static WebElement Returns;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[1]/div[3]/a/span[1]")
    public static WebElement GiftCards;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[1]/div[4]/a/span[1]")
    public static WebElement EventSpace;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[2]/div[2]/div/a/span")
    public static WebElement ContactUs;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[2]/div[3]/div/a/span")
    public static WebElement LiveChat;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[1]/a[1]")
    public static WebElement HoursOfService;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[1]/a[2]")
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
