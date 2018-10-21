package PageTest;
import Page.Bottom;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class BottomTest extends Bottom {
    Bottom bottom = PageFactory.initElements(webDriver, Bottom.class);
    @Test
    public void TrackRequestReturn () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    bottom.setTrackRequestReturn();
    }
    @Test
    public void UnsubscribeCatalog () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    bottom.setUnsubscribeCatalog();
    }
    @Test
    public void UnsubscribeEmail () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    bottom.setUnsubscribeEmail();
    }
    @Test
    public void Payments () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    bottom.setPayments();
    }
    @Test
    public void AllHelpTopics () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    bottom.setAllHelpTopics();
    }
    @Test
    public void WorldwideShipping () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    bottom.setWorldwideShipping();
    }
    @Test
    public void PaymentOptions () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    bottom.setPaymentOptions();
    }
    @Test
    public void CustomsVAT () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    bottom.setCustomsVAT();
    }
}
