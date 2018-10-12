package PageTest;

import Page.Home;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomeTest extends Home {
    @BeforeMethod
    public void init(){ Home homepage = PageFactory.initElements(webDriver, Home.class);}
    @Test
    public void setSearchBoxButton () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setSearchBoxButton();
    }
    @Test
    public void setSearchBox () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setSearch();
    }
    @Test
    public void setProductsTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setProductsTab();
    }
    @Test
    public void setBrandsTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setBrandsTab();
    }
    @Test
    public void setDealsTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setDealsTab();
    }
    @Test
    public void setServicesTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setServicesTab();
    }
    @Test
    public void setWeeklyAdTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setWeeklyAdTab();
    }
    @Test
    public void setDealOfTheDayTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setDealOfTheDayTab();
    }
    @Test
    public void setCreditCardsTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setCreditCardsTab();
    }
    @Test
    public void setGiftCardsTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setGiftCardsTab();
    }
    @Test
    public void setGiftIdeasRegistryTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setGiftIdeasRegistryTab();
    }
}
