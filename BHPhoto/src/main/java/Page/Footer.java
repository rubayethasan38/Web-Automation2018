package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
    public void setShippingShipping() {
        Shipping.click();
    }
    public void setReturns() {
        Returns.click();
    }
    public void setGiftCards() {
        GiftCards.click();
    }
    public void setEventSpace() {
        EventSpace.click();
    }
    public void setContactUs() {
        ContactUs.click();
    }
    public void setLiveChat() {
        LiveChat.click();
    }
    public void setHoursOfService() {
        HoursOfService.click();
    }
    public void setAddressDirections() {
        AddressDirections.click();
    }
}
