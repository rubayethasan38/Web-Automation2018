package Page;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class FooterB extends CommonAPI {
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[1]/a[1]")
    public static WebElement TrackRequestReturn;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[1]/a[2]")
    public static WebElement UnsubscribeCatalog;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[1]/a[3]")
    public static WebElement UnsubscribeEmail;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[1]/a[4]")
    public static WebElement Payments;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[1]/a[5]")
    public static WebElement AllHelpTopics;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[2]/a[1]")
    public static WebElement WorldwideShipping;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[2]/a[2]")
    public static WebElement PaymentOptions;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[2]/a[3]")
    public static WebElement CustomsVAT;
    //methods
    public void setTrackRequestReturn() {
        TrackRequestReturn.click();
    }
    public void setUnsubscribeCatalog() {
        UnsubscribeCatalog.click();
    }
    public void setUnsubscribeEmail() { UnsubscribeEmail.click(); }
    public void setPayments() {
        Payments.click();
    }
    public void setAllHelpTopics() {
        AllHelpTopics.click();
    }
    public void setWorldwideShipping() {
        WorldwideShipping.click();
    }
    public void setPaymentOptions() {
        PaymentOptions.click();
    }
    public void setCustomsVAT() { CustomsVAT.click(); }
}
