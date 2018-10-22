package Page;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
public class Bottom extends CommonAPI {
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[1]/div[2]/a/span[1]")
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
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    TrackRequestReturn.click();
    }
    public void setUnsubscribeCatalog() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    UnsubscribeCatalog.click();
    }
    public void setUnsubscribeEmail() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    UnsubscribeEmail.click();
    }
    public void setPayments() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    Payments.click();
    }
    public void setAllHelpTopics() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    AllHelpTopics.click();
    }
    public void setWorldwideShipping() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    WorldwideShipping.click();
    }
    public void setPaymentOptions() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    PaymentOptions.click();
    }
    public void setCustomsVAT() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    CustomsVAT.click(); }
}

