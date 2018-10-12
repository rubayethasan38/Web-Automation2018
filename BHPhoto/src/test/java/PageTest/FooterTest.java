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
        footer.setShippingShipping();
    }
    @Test
    public void setSearchBox () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        footer.setReturns();
    }
    @Test
    public void setProductsTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        footer.setGiftCards();
    }
    @Test
    public void setBrandsTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        footer.setEventSpace();
    }
    @Test
    public void setDealsTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        footer.setContactUs();
    }
    @Test
    public void setServicesTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        footer.setLiveChat();
    }
    @Test
    public void setWeeklyAdTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        footer.setHoursOfService();
    }
    @Test
    public void setDealOfTheDayTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        footer.setAddressDirections();
    }
}
