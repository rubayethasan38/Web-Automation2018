package TestPage;

import Page.Footer;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class FooterTest extends Footer {
@BeforeMethod
    public void search() {
        Footer footer = PageFactory.initElements(webDriver, Footer.class);
    }
    @Test
    public void Shipping () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setShippingShipping();
    }
    @Test
    public void setSearchBox () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setReturns();
    }
    @Test
    public void setProductsTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setGiftCards();
    }
    @Test
    public void setBrandsTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setEventSpace();
    }
    @Test
    public void setDealsTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setContactUs();
    }
    @Test
    public void setServicesTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setLiveChat();
    }
    @Test
    public void setWeeklyAdTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setHoursOfService();
    }
    @Test
    public void setDealOfTheDayTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setAddressDirections();
    }
}
