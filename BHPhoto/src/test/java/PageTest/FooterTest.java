package PageTest;
import Page.Footer;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class FooterTest extends Footer {
    Footer footer = PageFactory.initElements(webDriver, Footer.class);
    @Test
    public void Shipping () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    footer.clickShipping();
    }
    @Test
    public void Returns () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    footer.clickReturns();
    }
    @Test
    public void GiftCards () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    footer.clickGiftCards();
    }
    @Test
    public void EventSpace () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    footer.clickEventSpace();
    }
    @Test
    public void ContactUs () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    footer.clickContactUs();
    }
    @Test
    public void LiveChat () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    footer.clickLiveChat();
    }
    @Test
    public void HoursOfService () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        footer.clickHoursOfService();
    }
    @Test
    public void AddressDirections () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    footer.clickAddressDirections();
    }
}
